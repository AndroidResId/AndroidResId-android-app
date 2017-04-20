package com.androidresid.androidapp.launch

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.LinearLayout
import com.androidresid.androidapp.MainActivity
import com.androidresid.androidapp.R
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import org.jetbrains.anko.*
import java.util.concurrent.TimeUnit

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        frameLayout {
            linearLayout {
                gravity = Gravity.CENTER
                orientation = LinearLayout.VERTICAL

                imageView {
                    imageResource = R.drawable.img_logo_black
                }

                textView {
                    text = getString(R.string.app_name)
                    gravity = Gravity.CENTER
                    textSize = 20f
                }.lparams {
                    topMargin = dip(16)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        Observable.timer(3, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    val i = Intent(this, MainActivity::class.java)
                    startActivity(i)
                    finish()
                })
    }
}
