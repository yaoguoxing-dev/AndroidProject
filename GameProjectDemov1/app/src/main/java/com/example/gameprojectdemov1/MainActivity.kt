package com.example.gameprojectdemov1

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var backgroundOne:ImageView
    private lateinit var backgroundTwo:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var svc = Intent(this, StartActivityMusic::class.java)
        startService(svc)
        login_btn_cancle.setOnClickListener {
            Intent()
        }


//        var y = 100f
//        ObjectAnimator.ofFloat(backgroundOne, "translationX", y).start()
//        y+=100f

//        backgroundOne = findViewById(R.id.background_one)
//        backgroundTwo = findViewById(R.id.background_two)
//        ObjectAnimator.ofFloat(backgroundOne, "translationX", 100f).apply {
//            duration = 2000
//            start()
//        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
    private fun backgroundAnimation(){

//        val animator:ValueAnimator = ValueAnimator.ofFloat(0.0f, 1.0f)
//        animator.repeatCount = VeAnimator.INFINITE
//        val mDuration = 1000
//        animator.duration = mDuration.toLong()
//        animator.setInterpolator
//
//        val ty1 = ObjectAnimator.ofFloat(ball, View.TRANSLATION_Y, 0f, 200f)
//        ty1.setDuration(1000)
//        ty1.interpolator = BounceInterpolator()
//        ty1.start()

    }
}
