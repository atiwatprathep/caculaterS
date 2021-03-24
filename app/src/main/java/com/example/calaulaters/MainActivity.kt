package com.example.calaulaters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var vr1 = ""

        onebtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(1)
                result.setText(vr1)
            } else {
                vr1 = result.text.toString().plus(1)
                result.setText(vr1)
            }
        }

        twobtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(2)
                result.setText(vr1)
            } else {
                vr1 = result.text.toString().plus(2)
                result.setText(vr1)
            }
        }

        threebtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(3)
                result.setText(vr1)
            } else {
                vr1 = result.text.toString().plus(3)
                result.setText(vr1)
            }
        }

        fourbtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(4)
                result.setText(vr1)
            } else {
                vr1 = result.text.toString().plus(4)
                result.setText(vr1)
            }
        }


        fivebtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(5)
                result.setText(vr1)
            } else {
                vr1 = result.text.toString().plus(5)
                result.setText(vr1)
            }
        }

        sixbtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(6)
                result.setText(vr1)
            } else {
                vr1 = result.text.toString().plus(6)
                result.setText(vr1)
            }
        }

        sevenbtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(7)
                result.setText(vr1)
            } else {
                vr1 = result.text.toString().plus(7)
                result.setText(vr1)
            }
        }

        eightbtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(8)
                result.setText(vr1)
            } else {
                vr1 = result.text.toString().plus(8)
                result.setText(vr1)
            }
        }

        ninebtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(9)
                result.setText(vr1)
            } else {
                vr1 = result.text.toString().plus(9)
                result.setText(vr1)
            }
        }

        zerobtn.setOnClickListener {
            if(result.text.toString() == "0") {
                vr1 = result.text.toString()
            }
            else{
                vr1 = result.text.toString().plus(0)
                result.setText(vr1)
            }


        }
        clearbtn.setOnClickListener{
            vr1 = "0"
            result.setText(vr1)
        }
        delbtn.setOnClickListener{
            if(vr1.length < 2){
                vr1 = "0"
                result.setText(vr1)
            }
            else if(vr1.isNotEmpty()) {
                vr1 = vr1.dropLast(1)
                result.text = vr1
            }
        }
    }
}