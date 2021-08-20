package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_display.*

class BirthdayDisplay : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA = "name extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_display)

        val name = intent.getStringExtra(NAME_EXTRA)

        Greeting.text = "Happy Birthday $name"

    }
}