package com.androidresid.androidapp.components

import com.androidresid.androidapp.AboutActivity
import org.jetbrains.anko.*

class AboutUI : AnkoComponent<AboutActivity> {
    override fun createView(ui: AnkoContext<AboutActivity>) = with(ui) {
        verticalLayout {
            button("Hello") { }
        }
    }
}