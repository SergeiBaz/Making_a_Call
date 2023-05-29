package com.example.makingacall

import android.R
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.makingacall.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       /* val mDialButton: Button = findViewById<View>(R.id.btn_dial) as Button
        val mPhoneNoEt = findViewById<View>(R.id.et_phone_no) as EditText
        mDialButton.setOnClickListener(object : DialogInterface.OnClickListener() {
            fun onClick(view: View?) {
                val phoneNo = mPhoneNoEt.text.toString()
                if (!TextUtils.isEmpty(phoneNo)) {
                    val dial = "tel:$phoneNo"
                    startActivity(Intent(Intent.ACTION_DIAL, Uri.parse(dial)))
                } else {
                    Toast.makeText(this@MainActivity, "Enter a phone number", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        })*/
        binding.apply {
            button.setOnClickListener {
                val phoneNo = edText.text.toString()
                if (!TextUtils.isEmpty(phoneNo)) {
                    val dial = "tel:$phoneNo"
                    startActivity(Intent(Intent.ACTION_DIAL, Uri.parse(dial)))
                } else {
                    Toast.makeText(this@MainActivity, "Enter a phone number", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}