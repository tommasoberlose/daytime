package com.tommasoberlose.daytime.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tommasoberlose.daytime.R

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    finish()
    setContentView(R.layout.activity_main)
  }
}
