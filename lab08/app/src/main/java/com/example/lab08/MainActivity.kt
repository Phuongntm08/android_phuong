package com.example.lab08

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_thanks.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var slider:SeekBar
        lateinit var value:TextView

        slider=myPizzaSeekBar
        value=myPizzaSize

        val pizzaSize= arrayListOf<String>("Please Select","Small ($5)","Medium ($8)","Large ($11)","Extra-Large ($14)")

        slider.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                value.text = pizzaSize[progress]
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        } )

        dateBtn.setOnClickListener{
            val c = Calendar.getInstance()
            val day= c.get(Calendar.DAY_OF_MONTH)
            val month =c.get(Calendar.MONTH)
            val year =c.get(Calendar.YEAR)
            val myDatePicker =
                DatePickerDialog(this,android.R.style.
                ThemeOverlay,DatePickerDialog.OnDateSetListener {DatePicker,
                                                                 Year,Month,Day ->
                    dateText.text="$Day/ ${Month+1} /$Year"},year,month,day)
            myDatePicker.show()
        }

        timerBtn.setOnClickListener{
            val c = Calendar.getInstance()
            val hour =c.get(Calendar.HOUR_OF_DAY)
            val minutes =c.get(Calendar.MINUTE)
            val myTimePicker= TimePickerDialog(this,TimePickerDialog.
            OnTimeSetListener { TimePicker, hourOfDay, minute -> timerText.
            text="$hourOfDay : $minute"},hour,minutes,true)
            myTimePicker.show()
        }

        scheduleBtn.setOnClickListener() {
            var intent = Intent(this, Thanks::class.java)

            intent.putExtra("name", myName.text.toString())
            intent.putExtra("phone", myPhoneNumber.text.toString())
            intent.putExtra("size", myPizzaSize.text.toString())
            intent.putExtra("date", dateText.text.toString())
            intent.putExtra("time", timerText.text.toString())

            startActivity(intent)
        }

    }
}