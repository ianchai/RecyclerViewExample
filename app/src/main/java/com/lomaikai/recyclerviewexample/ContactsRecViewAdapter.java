package com.lomaikai.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsRecViewAdapter extends RecyclerView.Adapter<ContactsRecViewAdapter.ViewHolder> {

    private Context context;

    // Create an arrayList of contacts using the Contact class
    private ArrayList<Contact> contacts = new ArrayList();

    // Add constructor for RecyclerView.Adapter
    public ContactsRecViewAdapter(Context context) {
        this.context = context;
    }

    // Must implement these methods for the adapter
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Place to generate our view holder, using a layout inflater
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts_list_item,parent, false);
        // Create a new ViewHolder object.
        ViewHolder holder = new ViewHolder(view);
        // Pass holder to onBindViewHolder method to use it to change theproperties of UI element;
        return holder;
    }

    // This method will link the data to the UI element (most important method in your adapter class)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(contacts.get(position).getName());
        holder.txtPhone.setText(contacts.get(position).getPhoneNumber());
        // Setting onClickListener for objects in the recycler view
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, contacts.get(position).getName()+" selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // Create inner class, ViewHolder
    public class ViewHolder  extends RecyclerView.ViewHolder{
        //Declaring class for objects in contacts_list_item xml
        private TextView txtName, txtPhone;
        private CardView parent;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.name);
            txtPhone=itemView.findViewById(R.id.phoneNumber);
            parent= itemView.findViewById(R.id.parent);
            image=itemView.findViewById(R.id.imageView);
        }
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }
}
