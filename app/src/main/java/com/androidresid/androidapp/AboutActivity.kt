package com.androidresid.androidapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.androidresid.androidapp.components.AboutUI
import org.jetbrains.anko.setContentView

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AboutUI().setContentView(this)
    }
}
