package com.androidresid.androidapp

import org.junit.Test
import kotlin.test.assertTrue

class KotlinJunitTest {

    @Test
    fun firstTest() {
        val mainActivity = MainActivity()
        assertTrue(mainActivity.isCoverageTestWorks())
        val mainUI = MainUI()
        assertTrue(mainUI.isCoverageTestWorks())

    }
}