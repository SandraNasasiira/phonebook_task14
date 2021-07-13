package com.example.phonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var info:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        info=findViewById(R.id.rvDetails)
        var me= listOf(Contacts("Sandra","078438694","sandranasasiira@gmail.com"),
        Contacts("vicky","0798744489","vicky@gmail.com"),
        Contacts("Stella","0704958605","stella@gmail34.com"),
            Contacts("Stella","0704958605","stella@gmail34.com"),
            Contacts("Stella","0704958605","stella@gmail34.com"),
            Contacts("Stella","0704958605","stella@gmail34.com"),
            Contacts("Stella","0704958605","stella@gmail34.com"),
            Contacts("Stella","0704958605","stella@gmail34.com"),)
        var adaptor=ContactsAdaptor(me)
        info.layoutManager=LinearLayoutManager(baseContext)
        info.adapter=adaptor
    }
}