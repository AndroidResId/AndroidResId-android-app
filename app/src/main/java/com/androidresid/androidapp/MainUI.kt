package com.androidresid.androidapp

import android.support.design.widget.AppBarLayout
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.util.TypedValue
import android.view.Gravity
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.floatingActionButton
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.support.v4.drawerLayout


class MainUI : AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        drawerLayout {
            id = R.id.drawer
            fitsSystemWindows = true
            coordinatorLayout {
                coordinatorLayout(theme = R.style.Theme_AppCompat_NoActionBar)

                appBarLayout {
                    toolbar {
                        id = R.id.toolbar
                        backgroundResource = R.color.colorPrimary
                    }.lparams(width = matchParent) {
                        val tv = TypedValue()
                        if (ui.owner.theme.resolveAttribute(R.attr.actionBarSize, tv, true)) {
                            height = TypedValue.complexToDimensionPixelSize(tv.data, resources.displayMetrics)
                        }
                    }
                }.lparams(width = matchParent)

                relativeLayout {
                    horizontalPadding = resources.getDimensionPixelSize(R.dimen.activity_horizontal_margin)
                    verticalPadding = resources.getDimensionPixelSize(R.dimen.activity_vertical_margin)
                    textView("Hello World!")
                }.lparams(width = matchParent, height = matchParent) {
                    behavior = AppBarLayout.ScrollingViewBehavior()
                }

                floatingActionButton {
                    imageResource = android.R.drawable.ic_dialog_email
                    backgroundColor = ContextCompat.getColor(ui.owner, R.color.colorAccent)
                    onClick {

                    }
                }.lparams {
                    margin = resources.getDimensionPixelSize(R.dimen.fab_margin)
                    gravity = Gravity.BOTTOM or GravityCompat.END
                }
            }.lparams(width = matchParent, height = matchParent)


            navigationView {
                fitsSystemWindows = true
                setNavigationItemSelectedListener(ui.owner)
                inflateHeaderView(R.layout.nav_header_main)
                inflateMenu(R.menu.activity_main_drawer)
            }.lparams(height = matchParent, gravity = GravityCompat.START)
        }
    }

    fun isCoverageTestWorks(): Boolean {
        return true
    }
}