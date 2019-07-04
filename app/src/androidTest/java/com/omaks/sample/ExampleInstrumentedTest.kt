package com.omaks.sample

import android.content.Context
import androidx.test.core.app.ApplicationProvider

import org.junit.Test

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 *
 * Removed "RunWith" as per documentation it's needed only in case of JUnit3 and JUnit4 mix.
 */
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = ApplicationProvider.getApplicationContext<Context>()
        assertEquals("com.omaks.sample", appContext.packageName)
    }
}
