package com.androidresid.androidapp

import android.app.Activity
import android.os.Build
import android.view.View
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.fakes.RoboMenuItem
import org.robolectric.shadows.ShadowToast
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, manifest = "AndroidManifest.xml", sdk = intArrayOf(Build.VERSION_CODES.LOLLIPOP))
class MainActivityTest {

    private var activity: Activity? = null

    @Before
    fun setup() {
        activity = Robolectric.buildActivity(MainActivity::class.java)
                .create()
                .start()
                .resume()
                .visible()
                .get()
    }

    @Test
    fun isShouldDisplayTitle() {
        assertTrue(activity!!.title.toString() == ("AndroidResId"))
    }

    @Test
    fun itShouldDisplayToolbar() {
        val toolbar = activity!!.findViewById(R.id.toolbar)
        assertNotNull(toolbar)
        assertTrue(toolbar.visibility == View.VISIBLE)
    }

    @Test
    fun itShouldDisplayNavigationDrawer() {
        val drawer = activity!!.findViewById(R.id.drawer)
        assertNotNull(drawer)
        assertTrue(drawer.visibility == View.VISIBLE)
    }

    @Test
    fun itShouldHaveMenuItemSetting() {
        val menu = RoboMenuItem(R.id.action_settings)
        assertTrue(menu.isVisible)
        activity!!.onOptionsItemSelected(menu)
        assertTrue(ShadowToast.getTextOfLatestToast() == ("Settings"))
    }

}


