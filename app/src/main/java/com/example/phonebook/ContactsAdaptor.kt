package com.example.phonebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdaptor (var contactList:List<Contacts>):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var data=LayoutInflater.from(parent.context).inflate(R.layout.contact_resourcefile,parent,false)
        return ContactsViewHolder(data)

    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var detail=contactList[position]
        holder.name.text=detail.names
        holder.phone.text=detail.phoneNumbers
        holder.email.text=detail.emails
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

}

class ContactsViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
    var name=itemView.findViewById<TextView>(R.id.tvName)
    var phone=itemView.findViewById<TextView>(R.id.tvPhone)
    var email=itemView.findViewById<TextView>(R.id.tvEmail)
}