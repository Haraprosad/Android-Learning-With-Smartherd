package org.LingJ.msgshareapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_hobbies.*
import org.LingJ.msgshareapp.adapters.HobbiesAdapter
import org.LingJ.msgshareapp.R
import org.LingJ.msgshareapp.models.supplier

class HobbiesActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setUpRecyclerView()

    }

    private fun setUpRecyclerView() {
        //Layout Managing and link it to recyclerview
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerview.layoutManager = layoutManager

        /* pass value to custom adapter and store that value in a
        variable and link that with recyclerview*/
        val adapter =
            HobbiesAdapter(this, supplier.hobbies)
        recyclerview.adapter = adapter
    }
}
