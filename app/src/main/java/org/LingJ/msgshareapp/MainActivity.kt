package org.LingJ.msgshareapp
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToastButton.setOnClickListener {

            /*To show log information Log.i is used*/

            Log.i("MainActivity","Toast Button Clicked.")
            Toast.makeText(this,"Toast button is clicked.",Toast.LENGTH_SHORT).show()
        }
    }

}
