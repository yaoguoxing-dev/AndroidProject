package com.example.gameprojectdemov1

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_stage1.*

class stage1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stage1)
        next_section.setOnClickListener{
            ObjectAnimator.ofFloat(background_view, "translationX", 100f).apply {
                duration = 2000
                start()
            }
        }
    }
}
