package org.LingJ.msgshareapp
import android.content.Intent
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

            /*To Show Text Message following code is needed.*/
            Toast.makeText(this,"Toast button is clicked.",Toast.LENGTH_SHORT).show()
        }

        btnSendMTAA.setOnClickListener {
            /*To get text from edit text -->input and convert edit text to String*/

            val message:String = etWriteMessage.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

            /*Shift from one activity to another activity.*/
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }

}
