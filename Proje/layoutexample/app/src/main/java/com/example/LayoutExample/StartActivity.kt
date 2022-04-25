package com.example.layoutexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.layoutexample.databinding.ActivityStartBinding


class StartActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityStartBinding
    private lateinit var bindingUtil: DataBindingUtil
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_start)
        binding.button.setOnClickListener(this)


    }
    override fun onClick(view: View) {
        val intent: Intent = Intent(this, PremiumActivity::class.java)

        startActivity(intent)

    }

}