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
            /*Intent has 2 types. i)Explicit : share information to known activiry
           * ii)Implicit: share information to unknown activity*/

            /*Use of Explicit Intent */

            /*Transition from one activity to another activity.*/
            val i = Intent(this,SecondActivity::class.java)

            /*Use of Explicit Intent:
            * use putExtra(key_name,value) method to send information to
            * intent object*/
            i.putExtra("user_msg",message)
            startActivity(i)
        }
        btnShareMsgToAnotherApp.setOnClickListener {
            val message:String = etWriteMessage.text.toString()

            /****************************************************/

            /*Use of Explicit Intent:*/
            /*Step-1:Intent type object creation
            * Step-2: activities specification with object-
            *         (i)send action
            *          (ii)value assign
            *           (iii)Value's type
            * Step-3:Start activity */
            val i = Intent()   //as we don't know the exact send destination
            i.action = Intent.ACTION_SEND //To start send action
            i.putExtra(Intent.EXTRA_TEXT,message) // put msg in EXTRA_TEXT key

            /*EXTRA_TEXT key is the specific key name which will get called
            * by sharing app (viz:fb,whatsapp,gmail etc)*/

            i.type ="text/plain" //value's attribute
            /*To open sharing app list and show the title: viz: Send To*/
            startActivity(Intent.createChooser(i,"Send To:"))

            /****************************************************/
        }
    }

}
