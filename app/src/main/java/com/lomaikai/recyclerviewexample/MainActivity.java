package com.lomaikai.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Create object for Recycler View
    private RecyclerView contextRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the object to the UI element
        contextRecView=findViewById(R.id.contextRecView);
        // Create array list of contacts
        ArrayList<Contact> contacts = new ArrayList();
        contacts.add(new Contact("John Avery Whitaker", "013-124-5540", "https://static.wikia.nocookie.net/the-imagination-station/images/d/d1/John_Whittaker_001.jpg"));
        contacts.add(new Contact("Connie Kendall", "011-123-5432", "https://static.wikia.nocookie.net/the-imagination-station/images/3/3d/Connie_Kendall_001.jpg"));
        contacts.add(new Contact("Eugene Meltzner", "010-324-5230", "https://static.wikia.nocookie.net/p__/images/0/08/7CE66103-BCC3-487E-AC6A-AA2F68195C8C.png/revision/latest/scale-to-width-down/180?cb=20180914180349&path-prefix=protagonist"));
        contacts.add(new Contact("Katrina Shanks", "019-434-2354", "https://www.adventuresinodyssey.com/wp-content/uploads/23_Katrina-Meltsner-1.png"));
        contacts.add(new Contact("Aubrey Shepherd", "014-484-3454", "https://www.adventuresinodyssey.com/wp-content/uploads/Aubrey-Shepard-Clipped.png"));
        contacts.add(new Contact("Bernard Walton", "015-555-5354", "https://static.wikia.nocookie.net/adventuresinodyssey/images/4/43/255px-Bernardwalton.png"));
    }
}