package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextPage(view: View) {
        val name = NameInput.editableText.toString()
        val intent = Intent(this, BirthdayDisplay::class.java)

        intent.putExtra(BirthdayDisplay.NAME_EXTRA, name)
        startActivity(intent)
    }
}