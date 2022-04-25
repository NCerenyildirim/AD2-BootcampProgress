package com.example.tweenanimationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView= findViewById(R.id.imageView2)
        button = findViewById(R.id.button)
        var anim = AnimationUtils.loadAnimation(this, R.anim.tween_animation)

        button.setOnClickListener{
            imageView.startAnimation(anim)

        }
    }
}