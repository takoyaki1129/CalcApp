package com.example.sho_sakai.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log
import android.support.design.widget.Snackbar
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val num1 = editText1.text.toString()
        val num2 = editText2.text.toString()
        var test: Double = 0.0

        //try {
        //    test = num1 / num2
        //} catch (e: Exception) {
        //    Snackbar.make(v, "エラー", Snackbar.LENGTH_LONG)
        //            .setAction("Action"){
        //                Log.d("UI_PARTS", "Snackbarをタップした")
        //            }.show()
        //} finally {
        //    Log.d("kotlintest", "ans = " + test.toString())
        //}
        if (num1.isEmpty() || num2.isEmpty() || num1!="." || num2!=".") {
            Snackbar.make(v, "エラー", Snackbar.LENGTH_LONG)
                       .setAction("Action"){
                            Log.d("UI_PARTS", "Snackbarをタップした")
                        }.show()
            return}

        else {
            when (v.id) {
                R.id.button1 -> {
                    val plus = (editText1.text.toString().toDouble() + editText2.text.toString().toDouble())
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("VALUE1", plus)
                    startActivity(intent)
                }

                R.id.button2 -> {
                    val minus = (editText1.text.toString().toDouble() - editText2.text.toString().toDouble())
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("VALUE1", minus)
                    startActivity(intent)
                }

                R.id.button3 -> {
                    val multiply = (editText1.text.toString().toDouble() * editText2.text.toString().toDouble())
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("VALUE1", multiply)
                    startActivity(intent)
                }

                R.id.button4 -> {
                    val divide = (editText1.text.toString().toDouble() / editText2.text.toString().toDouble())
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("VALUE1", divide)
                    startActivity(intent)
                }
            }
        }
    }
}