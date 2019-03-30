package com.example.hindienglish

import android.app.PendingIntent.getActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.ToggleButton
import android.content.res.Configuration
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.DisplayMetrics

/**
 * Hi Friends this a MultiLanguageSupport App built in Kotlin in Android.
 * This is developed on 29th March By Rahul Kushwaha.
 * In This I have used ShrePreference to save language data and strings.**/




class MainActivity : AppCompatActivity() {

    private var myLocale: Locale? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSupportActionBar()!!.setTitle(getString(R.string.app_name))

        txtView.text=getString(R.string.hello_world)

        change_language?.setOnCheckedChangeListener{buttonView, isChecked ->
            val fag=buttonView.text.toString()
            System.out.println("asjdhgas"+fag)
            if (isChecked){

             changeToHindi("hi")
            }else{
                changeToEnglish("en")
            }


        }

        buttnClick.setOnClickListener {
            val intent=Intent(this,NewAcivity::class.java)
            startActivity(intent)
        }
    }

    private fun changeToHindi(language: String?) {
     /*   myLocale = Locale(language)//Set Selected Locale
        Locale.setDefault(myLocale)//set new locale as default
        val config = Configuration()//get Configuration
        config.locale = myLocale//set config locale as selected locale
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)//Update the config
        txtView.setTextColor(resources.getColor(R.color.colorAccent))*/


        /////////////////////

        myLocale= Locale(language)
        val resources = resources
        val dm = resources.displayMetrics
        val conf = resources.configuration
        conf.locale = myLocale
        resources.updateConfiguration(conf, dm)
        val refreshIntent = Intent(this, MainActivity::class.java)
        finish()
        startActivity(refreshIntent)


    }

    private fun changeToEnglish(language: String?) {
      /* System.out.println("language"+language)
        myLocale = Locale(language)//Set Selected Locale
        Locale.setDefault(myLocale)//set new locale
        // as default
        val config = Configuration()//get Configuration
        config.locale = myLocale//set config locale as selected locale
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)//Update the config
        txtView.setTextColor(resources.getColor(R.color.colorPrimary))*/
    }


}
