package com.androidresid.androidapp.components

import android.support.constraint.ConstraintLayout
import com.androidresid.androidapp.AboutActivity
import com.androidresid.androidapp.R
import org.jetbrains.anko.*

class AboutUI : AnkoComponent<AboutActivity> {
    override fun createView(ui: AnkoContext<AboutActivity>) = with(ui) {
        include<ConstraintLayout>(R.layout.about)
    }
}
