package com.example.pingpongx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupPlayers()

    }

    private fun setupPlayers(){
        tvPlayerOneName.text = intent.getStringExtra("KEY_EXTRA_PLAYER_1")
        tvPlayerTwoName.text = intent.getStringExtra("KEY_EXTRA_PLAYER_2")
    }
}
