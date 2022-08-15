package com.mba.bullfin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.mba.bullfin.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {

    lateinit var binding: ActivitySplashScreenBinding
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lottieAnimation.setAnimation(R.raw.splashimage)
        binding.lottieAnimation.playAnimation()


        handler= Handler(Looper.myLooper()!!)
        handler.postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },5000)
    }
}