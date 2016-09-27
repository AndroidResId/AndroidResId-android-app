package com.androidresid.androidapp

import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)


class MainActivityTest {
    val activity = Robolectric.buildActivity(MainActivity::class.java)
            .create()
            .start()
            .resume()
            .visible()
            .get()

    @Test
    fun isShouldDisplayTitle(){
        assertTrue(activity.title.toString().equals("AndroidResId"))
    }

    @Test
    fun itShouldDisplayToolbar(){
        val toolbar = activity.findViewById(R.id.toolbar)
        assertNotNull(toolbar)
    }
    @Test
    fun itShouldDisplayNavigationDrawer(){
        val drawer = activity.findViewById(R.id.drawer)
        assertNotNull(drawer)
    }

}


