package com.androidresid.androidapp

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.support.test.espresso.Espresso.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import com.androidresid.androidapp.launch.LaunchActivity
import org.hamcrest.Matchers.*

@RunWith(AndroidJUnit4::class)
class DeepLinkTest {

    @Rule @JvmField
    var mActivityTestRule = ActivityTestRule(LaunchActivity::class.java, false, false)

    @Test
    fun aboutAppNameExistAndDisplayed() {
        val intent = Intent(ACTION_VIEW)
        intent.setData(Uri.parse("https://androidresid.com/about"))
        mActivityTestRule.launchActivity(intent)

        val appName = onView(
                allOf(withId(R.id.app_name), isDisplayed()))
        appName.check(matches(withText(R.string.app_name)))
    }
}
