package com.example.anddroidsplashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.badge.BadgeDrawable.TOP_START

class Screen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)

        val top= AnimationUtils.loadAnimation(this,R.anim.top)
        val middle=AnimationUtils.loadAnimation(this,R.anim.middle)

        val screen=1000
        val mainActivity=Intent(this@Screen,MainActivity::class.java)

        Handler().postDelayed({
            startActivity(mainActivity)
            finish()
        } ,1900)




    }
}