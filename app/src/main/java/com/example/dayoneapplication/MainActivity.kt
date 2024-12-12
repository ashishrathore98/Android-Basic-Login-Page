package com.example.dayoneapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var number1 : EditText
    lateinit var number2 : EditText
    lateinit var textButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        number1 = findViewById(R.id.editTextOne)
        number2 = findViewById(R.id.editTextTwo)
        textButton = findViewById(R.id.textView_Id)


        textButton.setOnClickListener {
             var number1 = number1.text.toString().toInt()
             var number2 = number2.text.toString().toInt()

            val result = number1.plus(number2)
            Toast.makeText(this, "Result "+result, Toast.LENGTH_LONG).show()
        }


    }
}
