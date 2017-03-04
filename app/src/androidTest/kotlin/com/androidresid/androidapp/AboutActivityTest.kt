package com.androidresid.androidapp

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
    fun telegramLinkExistAndDisplayed() {
        val telegramLink = onView(
                allOf(withId(R.id.telegram_link), isDisplayed()))
        telegramLink.check(matches(withText(R.string.telegram_channel)))
    }

    @Test
    fun webLinkExistAndDisplayed() {
        val webLink = onView(
                allOf(withId(R.id.web_link), isDisplayed()))
        webLink.check(matches(withText(R.string.web)))
    }

    @Test
    fun gitHubLinkExistAndDisplayed() {
        val githubLink = onView(
                allOf(withId(R.id.github_link), isDisplayed()))
        githubLink.check(matches(withText(R.string.github_repository)))
    }

    @Test
    fun twitterLinkExistAndDisplayed() {
        val twitterLink = onView(
                allOf(withId(R.id.twitter_link), isDisplayed()))
        twitterLink.check(matches(withText(R.string.twitter)))
    }
}
