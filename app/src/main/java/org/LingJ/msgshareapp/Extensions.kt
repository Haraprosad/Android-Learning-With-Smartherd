package org.LingJ.msgshareapp

import android.app.Activity
import android.widget.Toast

fun Activity.showToast(message:String,duration:Int=Toast.LENGTH_SHORT){

    Toast.makeText(this,message,duration).show()
}