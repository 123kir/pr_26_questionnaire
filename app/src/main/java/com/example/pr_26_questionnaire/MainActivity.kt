package com.example.pr_26_questionnaire

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radiogroup_)
        val salaryBox = findViewById<LinearLayout>(R.id.salaryBox)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.rbForMoney) {
                salaryBox.visibility = View.VISIBLE
            } else {
                salaryBox.visibility = View.GONE
            }
        }
    }
}
