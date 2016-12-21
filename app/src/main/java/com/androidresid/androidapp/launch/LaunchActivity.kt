package com.androidresid.androidapp.launch

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.androidresid.androidapp.R
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.verticalLayout

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            backgroundResource = R.mipmap.ic_launcher
        }
    }
}
