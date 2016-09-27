package com.androidresid.androidapp

import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import kotlin.test.assertNotNull

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)


class MainActivityTest {

    @Test
    fun itShouldDisplayToolbar(){
        val activity = Robolectric.setupActivity(MainActivity::class.java)
        assertNotNull(activity.findViewById(R.id.toolbar))
    }
    @Test
    fun itShouldDisplayNavigationDrawer(){
        val activity = Robolectric.setupActivity(MainActivity::class.java)
        assertNotNull(activity.findViewById(R.id.drawer))
    }

}


