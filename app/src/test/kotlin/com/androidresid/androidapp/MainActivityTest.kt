package com.androidresid.androidapp

import android.os.Build
import android.view.View
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.fakes.RoboMenuItem
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, manifest = "AndroidManifest.xml", sdk = intArrayOf(Build.VERSION_CODES.LOLLIPOP))
class MainActivityTest {

    val activity = Robolectric.buildActivity(MainActivity::class.java)
            .create()
            .start()
            .resume()
            .visible()
            .get()

    @Test
    fun isShouldDisplayTitle(){
        assertTrue(activity.title.toString() == ("AndroidResId"))
    }

    @Test
    fun itShouldDisplayToolbar(){
        val toolbar = activity.findViewById(R.id.toolbar)
        assertNotNull(toolbar)
        assertTrue(toolbar.visibility == View.VISIBLE)
    }
    @Test
    fun itShouldDisplayNavigationDrawer(){
        val drawer = activity.findViewById(R.id.drawer)
        assertNotNull(drawer)
        assertTrue(drawer.visibility == View.VISIBLE)
    }
    @Test
    fun itShouldMenuItemSetting(){
        RoboMenuItem(R.id.action_settings)
        activity.onOptionsItemSelected(RoboMenuItem(R.id.action_settings))
    }

}


