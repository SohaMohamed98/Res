package com.example.res

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var myColor= resources.getColor( R.color.color2)

        butOne.setTextColor(myColor)
        butOne.visibility= View.VISIBLE

    butOne.setOnClickListener {
        var my_str = resources.getString(R.string.but1)
        Toast.makeText(this,my_str,Toast.LENGTH_LONG).show()

     }


    }
}
