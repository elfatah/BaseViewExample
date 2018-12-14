package com.hilmanfatah.baseviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.hilmanfatah.baselistadapter.BaseRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listAdapter = ListAdapter(this)

        listAdapter.addData(UserModel("Ahmad", "Subang"))
        listAdapter.addData(UserModel2("Waluyo", "Bandung"))
        listAdapter.addData(UserModel("Bambang", "Cicaheum"))
        listAdapter.addData(UserModel2("Mahmud", "Jakarta"))
        listAdapter.addData(UserModel("Pahmud", "Cileduk"))

        listAdapter.mItemClickListener = object : BaseRecyclerViewAdapter.OnItemClickListener {
            override fun onItemClick(view: View, position: Int) {
                Toast.makeText(this@MainActivity, "Klik " /*+ listAdapter.mDatas[position].name*/, Toast.LENGTH_SHORT).show()
            }

        }

        listAdapter.mLongItemClickListener = object : BaseRecyclerViewAdapter.OnLongItemClickListener {
            override fun onLongItemClick(view: View, position: Int) {
                Toast.makeText(this@MainActivity, "Long klik " /*+ listAdapter.mDatas[position].name*/, Toast.LENGTH_SHORT).show()
            }


        }

        rvUser.adapter = listAdapter
        rvUser.layoutManager = LinearLayoutManager(this)
    }
}
