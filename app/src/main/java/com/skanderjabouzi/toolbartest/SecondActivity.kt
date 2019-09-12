package com.skanderjabouzi.toolbartest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.toolbar_main.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setSupportActionBar(toolbar)
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorBadMood));
        toolbar.setSubtitleTextColor(getResources().getColor(R.color.colorDissatisfied));
        Log.e("Toolbar", supportActionBar.toString())
        supportActionBar!!.setDisplayHomeAsUpEnabled(true);
        supportActionBar!!.setDisplayShowHomeEnabled(true);
        supportActionBar!!.setLogo(R.mipmap.ic_launcher);
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_smiley_1);

    }

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, SecondActivity::class.java)
        }
    }
}
