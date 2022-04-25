package com.example.layoutexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.layoutexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bindingUtil: DataBindingUtil
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.startnow.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        val intent: Intent = Intent(this, StartActivity::class.java)

        startActivity(intent)

    }
}