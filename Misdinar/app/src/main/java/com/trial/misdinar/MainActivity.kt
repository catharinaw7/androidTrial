package com.trial.misdinar

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //move to another activity
        val button = findViewById<Button>(R.id.buttonGetStarted);
        button.setOnClickListener {

            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        //end move to another activity
    }
}
