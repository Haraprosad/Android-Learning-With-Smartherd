package org.LingJ.msgshareapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import org.LingJ.msgshareapp.AppConstants
import org.LingJ.msgshareapp.R

class SecondActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        /*To store  bundle of Intent Extras value(viz:putExtra's value)
        in a variable : getIntent.getExtras--> intent.extras*/
        val bundle:Bundle? =intent.extras

        /*To store specific value in a variable from the bundle of
        putExtra value: getString(key_name) method is used*/
        val msg = bundle!!.getString(AppConstants.USER_MSG_KEY)

        /*To show text in a textView id: .text = text_value*/
        txv_pass_user_msg.text = msg
    }

}