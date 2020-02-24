package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var rightAnswers = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener {
            checkAnswer()
            Toast.makeText(this, getString(R.string.result) + "$rightAnswers", Toast.LENGTH_LONG).show()
            //IF YOU KEEP SUBMITTING THE ANSWER COUNT WILL START, HOW TO STOP IT...??
        }
    }

    private fun checkAnswer(){

        val answer1 = et1.text.toString()
        val answer2 = et2.text.toString()
        val answer3 = et3.text.toString()
        val answer4 = et4.text.toString()


        if (answer1 == getString(R.string.et1)){
            rightAnswers++
        } else { return }

        if (answer2 == getString(R.string.et2)){
            rightAnswers++
        } else { return }

        if (answer3 == getString(R.string.et3)){
            rightAnswers++
        } else { return }

        if (answer4 == getString(R.string.et4)){
            rightAnswers++
        } else { return }

    }
}
