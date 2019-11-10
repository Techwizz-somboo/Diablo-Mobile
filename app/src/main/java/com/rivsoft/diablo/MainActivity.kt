package com.rivsoft.diablo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)
//Gets the website
        val myWebView: WebView = findViewById(R.id.webview)
//        setContentView(myWebView)
        myWebView.loadUrl("https://d07riv.github.io/diabloweb/") //Website URL
        myWebView.settings.javaScriptEnabled = true //Javascript is required, do not turn it off or it will tell you that you need to enable java script

    }
}
