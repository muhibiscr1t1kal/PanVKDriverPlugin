package com.muhibiscr1t1kal.panvkdriverplugin

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
        }

        val text = TextView(this).apply {
            textView = "Made by MuhibIsCr1t1kal"
            textSize = 20f
            gravity = Gravity.CENTER
        }

        val button = Button(this).apply {
            text = "Visit GitHub Repo"
        }

        layout.addView(textView)
        layout.addView(button)

        setContentView(layout)

        button.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://github.com/muhibiscr1t1kal/PanVKDriverPlugin")
            )
            startActivity(intent)
        }
    }
}
