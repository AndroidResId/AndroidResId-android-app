package com.androidresid.androidapp

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertTrue

class KotlinJunitTest {

    @Test
    fun firstTest() {
        val mainActivity = MainActivity();
        assertTrue(mainActivity.isCoverageTestWorks());
    }

    @Test
    fun secondTest() {
        val mainActivity = MainActivity();
        assertTrue(mainActivity.isUnitTestCoverageWorks());
    }

}
