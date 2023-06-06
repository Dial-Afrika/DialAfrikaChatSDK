package com.example.bongasdk

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.net.Uri
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.LinearLayout

class ChatSDK {
    companion object {
        private const val BASE_URL = "https://home.dialafrika.com/webchat/?"

        fun initialize(context: Context, apikey: String, greeting: String, message: String) {
            val webView = WebView(context)

            @SuppressLint("javascriptEnabled")
            val settings = webView.settings
            settings.javaScriptEnabled = true

            // Enable responsive layout
            settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
            settings.cacheMode = WebSettings.LOAD_DEFAULT

            // Optimize WebView performance
            settings.domStorageEnabled = true
            settings.databaseEnabled = true


            // Construct the URL with the necessary parameters.
            val finalUrl = buildFinalUrl(apikey, greeting, message)

            webView.loadUrl(finalUrl)

            val layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            (context as Activity).setContentView(webView, layoutParams)
        }

        private fun buildFinalUrl(apikey: String, greeting: String, message: String): String {
            val builder = Uri.parse(BASE_URL).buildUpon()
            builder.appendQueryParameter("apikey", apikey)
            builder.appendQueryParameter("greeting", greeting)
            builder.appendQueryParameter("message", message)
            return builder.build().toString()
        }
    }
}
