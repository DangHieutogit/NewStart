package com.example.newstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class lamlaibaidktaikhoan : AppCompatActivity() {
    private var edtname: EditText? = null
    private var edtpass: EditText? = null
    private var edtnlpass : EditText? = null

    var tvThongBao = findViewById<TextView>(R.id.tvThongBao)

    private var button : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lamlaibaidktaikhoan)
        addControls();

    }



    private fun addControls() {
        edtname = findViewById(R.id.edt_name)
        edtpass = findViewById(R.id.edt_password)
        edtnlpass = findViewById(R.id.edt_nl_password)
       tvThongBao = findViewById(R.id.tvThongBao)
        button = findViewById(R.id.btn_tieptuc)

    }
}