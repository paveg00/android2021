package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import android.animation.AnimatorInflater

import android.animation.AnimatorSet
import android.app.Activity
import android.content.Intent
import android.nfc.cardemulation.CardEmulation
import android.util.Log
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {
    private lateinit var postButton: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = getString(R.string.main_title)
        setContentView(R.layout.activity_main)
        postButton = findViewById(R.id.card_view)
        postButton.setOnClickListener(listener)
    }

    private val listener = View.OnClickListener { view ->
        Log.d("[main]", "click")
        when (view.id) {
            R.id.card_view -> changeActivity()
            else -> {}
        }
    }

    private fun changeActivity() {
        Log.d("[main]", "changeActivity")
        val intent = Intent(this, DetailedInfo::class.java).apply {

        }
        startActivity(intent)
    }
}