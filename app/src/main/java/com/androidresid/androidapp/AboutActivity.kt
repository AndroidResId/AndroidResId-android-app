package com.androidresid.androidapp

import android.content.Context
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.androidresid.androidapp.components.AboutUI
import org.jetbrains.anko.browse
import org.jetbrains.anko.find
import org.jetbrains.anko.onClick
import org.jetbrains.anko.setContentView

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AboutUI().setContentView(this)

        val appVersion = find<TextView>(R.id.app_version)
        appVersion.text = BuildConfig.VERSION_NAME

        val telegramLink = find<TextView>(R.id.telegram_link)
        telegramLink.onClick {
            intentTelegram()
        }
        val githubLink = find<TextView>(R.id.github_link)
        githubLink.onClick {
            browse("https://github.com/AndroidResId/AndroidResId-android-app")
        }
        val webLink = find<TextView>(R.id.web_link)
        webLink.onClick {
            browse("http://androidresid.com/")
        }

        val twitterLink = find<TextView>(R.id.twitter_link)
        twitterLink.onClick {
            intentTwitter()
        }
    }

    private fun intentTwitter() {
        val appName = "org.telegram.messenger"
        val isAppInstalled = isAppAvailable(applicationContext, appName)
        if (isAppInstalled) {
            browse("tg://resolve?domain=AndroidResId")
        } else {
            browse("https://telegram.me/AndroidResId")
        }
    }

    fun intentTelegram() {
        val appName = "com.twitter.android"
        val isAppInstalled = isAppAvailable(applicationContext, appName)
        if (isAppInstalled) {
            browse("twitter://user?screen_name=AndroidResId")
        } else {
            browse("https://twitter.com/AndroidResId")
        }
    }

    fun isAppAvailable(context: Context, appName: String): Boolean {
        val pm = context.packageManager
        try {
            pm.getPackageInfo(appName, PackageManager.GET_ACTIVITIES)
            return true
        } catch (e: PackageManager.NameNotFoundException) {
            return false
        }
    }
}
