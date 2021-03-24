package com.example.calaulaters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var check = 0
        var operator = ""
        var now = 0
        var sum = 0
        var vr1 = ""

        onebtn.setOnClickListener {
            if (result.text.toString() == "0" || check == 1) {
                result.setText("")
                vr1 = result.text.toString().plus(1)
                result.setText(vr1)
            } else {
                vr1 = result.text.toString().plus(1)
                result.setText(vr1)
                check = 0
            }
        }

        twobtn.setOnClickListener {
            if (result.text.toString() == "0" || check == 1) {
                result.setText("")
                vr1 = result.text.toString().plus(2)
                result.setText(vr1)
                check = 0

            } else {
                vr1 = result.text.toString().plus(2)
                result.setText(vr1)
            }
        }

        threebtn.setOnClickListener {
            if (result.text.toString() == "0" || check == 1) {
                result.setText("")
                vr1 = result.text.toString().plus(3)
                result.setText(vr1)
                check = 0
            } else {
                vr1 = result.text.toString().plus(3)
                result.setText(vr1)
            }
        }

        fourbtn.setOnClickListener {
            if (result.text.toString() == "0" || check == 1) {
                result.setText("")
                vr1 = result.text.toString().plus(4)
                result.setText(vr1)
                check = 0
            } else {
                vr1 = result.text.toString().plus(4)
                result.setText(vr1)
            }
        }


        fivebtn.setOnClickListener {
            if (result.text.toString() == "0" || check == 1) {
                result.setText("")
                vr1 = result.text.toString().plus(5)
                result.setText(vr1)
                check = 0
            } else {
                vr1 = result.text.toString().plus(5)
                result.setText(vr1)
            }
        }

        sixbtn.setOnClickListener {
            if (result.text.toString() == "0" || check == 1) {
                result.setText("")
                vr1 = result.text.toString().plus(6)
                result.setText(vr1)
                check = 0
            } else {
                vr1 = result.text.toString().plus(6)
                result.setText(vr1)
            }
        }

        sevenbtn.setOnClickListener {
            if (result.text.toString() == "0" || check == 1) {
                result.setText("")
                vr1 = result.text.toString().plus(7)
                result.setText(vr1)
                check = 0
            } else {
                vr1 = result.text.toString().plus(7)
                result.setText(vr1)
            }
        }

        eightbtn.setOnClickListener {
            if (result.text.toString() == "0" || check == 1) {
                result.setText("")
                vr1 = result.text.toString().plus(8)
                result.setText(vr1)
                check = 0
            } else {
                vr1 = result.text.toString().plus(8)
                result.setText(vr1)
            }
        }

        ninebtn.setOnClickListener {
            if (result.text.toString() == "0" || check == 1) {
                result.setText("")
                vr1 = result.text.toString().plus(9)
                result.setText(vr1)
                check = 0
            } else {
                vr1 = result.text.toString().plus(9)
                result.setText(vr1)
            }
        }

        zerobtn.setOnClickListener {
            if (result.text.toString() == "0" || check == 1) {
                vr1 = result.text.toString()
                check = 0
            } else {
                vr1 = result.text.toString().plus(0)
                result.setText(vr1)
            }




        }
        multiplied.setOnClickListener {  //คูณ *
            check = 1
            now = result.text.toString().toInt()
            operator = "mul"
        }

        minus.setOnClickListener { // -
            check = 1
            now = result.text.toString().toInt()
            operator = "min"
        }

        plus.setOnClickListener { // +
            check = 1
            now = result.text.toString().toInt()
            operator = "plu"
        }

        divide.setOnClickListener {  // หาร /
            check = 1
            now = result.text.toString().toInt()
            operator = "div"
        }

        modulo.setOnClickListener {
            check = 1
            now = result.text.toString().toInt()
            operator = "mod"
        }

        calcullatebtn.setOnClickListener {
            if (operator == "mul") { // *
                sum = now * result.text.toString().toInt()
                result.text = sum.toString()
            } else if (operator == "min") { // -
                sum = now - result.text.toString().toInt()
                result.text = sum.toString()
            } else if (operator == "plu") { //+
                sum = now + result.text.toString().toInt()
                result.text = sum.toString()
            } else if (operator == "div") { // หาร /
                sum = now / result.text.toString().toInt()
                result.text = sum.toString()
            } else if (operator == "mod") {
                sum = now % result.text.toString().toInt()
                result.text = sum.toString()
            }
        }
        delbtn.setOnClickListener {
            if (vr1.length < 2) {
                vr1 = "0"
                result.setText(vr1)
            } else if (vr1.isNotEmpty()) {
                vr1 = vr1.dropLast(1)
                result.text = vr1
            }
        }
        clearbtn.setOnClickListener {
            vr1 = "0"
            result.setText(vr1)
        }
    }
}
