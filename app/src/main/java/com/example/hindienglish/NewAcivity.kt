package com.example.hindienglish

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.new_activity.*

class NewAcivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity)

        getSupportActionBar()!!.setTitle(getString(R.string.about))
        aboutMe.text=resources.getString(R.string.about_me)
    }
}