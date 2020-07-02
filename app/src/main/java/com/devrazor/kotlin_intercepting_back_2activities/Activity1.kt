package com.devrazor.kotlin_intercepting_back_2activities



import android.app.PendingIntent.getActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity


class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)


    }

    override fun onBackPressed() {

        //Display the name of our current Activity/class as it was declared in the source code
        val text = "Hello from " + this.javaClass.simpleName

        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

    }


    /** Called when the user taps the 'Go To Activity 2' button */
    fun onButton1Click(view: View) {
        // open the second activity in response to button1 being pressed

        //Here we are using an explicit intent where we specify the component/activity to start by name.
        //myIntent.putExtra("key", value); //we can use this to pass optional parameters
        val intent = Intent(this, Activity2::class.java).apply {

        }

        startActivity(intent)

    }

}