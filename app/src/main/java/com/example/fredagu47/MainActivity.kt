package com.example.fredagu47

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Legg til feilhåndtering på oppg 1 - 5
        //Legg til feilhåndering for å unngå at appen krasjer.
        //Tips, se i Run console og se etter rød skrift. Den røde teksten gir deg forslag på hvor feilen oppstår og hva det kommer av
        //oppg1()
        //oppg2()
        //oppg3()
        //oppg4()
        //oppg5()

        //Etter feilhåndtering er lagt til så kan du løse feilene i koden
        //ved å f.eks å sette verdier på variabler, objekter osv.
    }

    private fun oppg1() {
        var ten : String = "I0"
        val list = listOf("en", "to", "tre", "fire")
        val list2 = listOf("A", "B", "C")

        for ((index) in list.withIndex()) {
            Log.d("OPPG1_LOG","${list2[index]}")
            val age: Int  = ten.toInt() + index

            Log.d("OPPG1_LOG", "age is $age")
        }
    }

    lateinit var someText: String

    private fun oppg2() {
        Log.d("OPPG2_LOG", someText)
    }

    lateinit var user: User

    private fun oppg3() {
        Log.d("OPPG3_LOG", user.name.toString())
    }

    val user2: User = User(null)
    private fun oppg4() {
        Log.d("OPPG4_LOG", user2.name.toString())
    }

    var num: Int? = null
    private fun oppg5() {
        val text = test_editText.text

        for ((index) in text.withIndex()) {
            num = ((text[index]).toInt() * 0.3) as Int
        }
    }
}