package com.androidresid.androidapp

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.intent.Intents.intended
import android.support.test.espresso.intent.matcher.IntentMatchers.*
import android.support.test.espresso.intent.matcher.UriMatchers.hasHost
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers.*

@RunWith(AndroidJUnit4::class)
class AboutActivityTest {

    @Rule @JvmField
    var mActivityTestRule = ActivityTestRule(AboutActivity::class.java)

    @Test
    fun aboutAppNameExistAndDisplayed() {
        val appName = onView(
                allOf(withId(R.id.app_name), isDisplayed()))
        appName.check(matches(withText(R.string.app_name)))
    }

    @Test
    fun shouldOpenTelegramLink() {

        val telegramLink = onView(
                allOf(withId(R.id.telegram_link), isDisplayed()))
        telegramLink.check(matches(withText(R.string.telegram_channel)))

//        val appName = "org.telegram.messenger"
//        val isAppInstalled = isAppAvailable(mActivityTestRule.activity, appName)
//        telegramLink.perform(click())
//
//        if (isAppInstalled) {
//            intended(toPackage("org.telegram.messenger"))
//            allOf(
//                    hasAction(equalTo(Intent.ACTION_VIEW)),
//                    hasCategories(hasItem(equalTo(Intent.CATEGORY_APP_MESSAGING))),
//                    hasData(hasHost(equalTo("tg://resolve?domain=AndroidResId")))
//            )
//        } else {
//            allOf(
//                    hasAction(equalTo(Intent.ACTION_VIEW)),
//                    hasCategories(hasItem(equalTo(Intent.CATEGORY_BROWSABLE))),
//                    hasData(hasHost(equalTo("http://androidresid.com/")))
//            )
//        }
    }

    @Test
    fun shouldOpenWebLink() {
        val webLink = onView(
                allOf(withId(R.id.web_link), isDisplayed()))
        webLink.check(matches(withText(R.string.web)))
//        webLink.perform(click())
//        pressBack()
//        allOf(
//                hasAction(equalTo(Intent.ACTION_VIEW)),
//                hasCategories(hasItem(equalTo(Intent.CATEGORY_BROWSABLE))),
//                hasData(hasHost(equalTo("http://androidresid.com/")))
//        )
//        pressBack()
    }

    @Test
    fun shouldOpenGitHubLink() {
        val githubLink = onView(
                allOf(withId(R.id.github_link), isDisplayed()))
        githubLink.check(matches(withText(R.string.github_repository)))
//        githubLink.perform(click())
//        pressBack()
//        allOf(
//                hasAction(equalTo(Intent.ACTION_VIEW)),
//                hasCategories(hasItem(equalTo(Intent.CATEGORY_BROWSABLE))),
//                hasData(hasHost(equalTo("https://github.com/AndroidResId/AndroidResId-android-app")))
//        )
//        pressBack()
    }

//    fun isAppAvailable(context: Context, appName: String): Boolean {
//        val pm = context.packageManager
//        try {
//            pm.getPackageInfo(appName, PackageManager.GET_ACTIVITIES)
//            return true
//        } catch (e: PackageManager.NameNotFoundException) {
//            return false
//        }
//    }
}
