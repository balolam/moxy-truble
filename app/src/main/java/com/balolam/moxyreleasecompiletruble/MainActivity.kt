package com.balolam.moxyreleasecompiletruble

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton.setOnClickListener {
            val intent = Intent(this@MainActivity, HelloActivity::class.java)
            intent.putExtra("name", nameEditText.text.toString())

            startActivity(intent)
        }
    }
}
