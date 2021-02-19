package com.lomaikai.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
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
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("John Avery Whitaker", "013-124-5540", "https://static.wikia.nocookie.net/the-imagination-station/images/d/d1/John_Whittaker_001.jpg"));
        contacts.add(new Contact("Connie Kendall", "011-123-5432", "https://static.wikia.nocookie.net/the-imagination-station/images/3/3d/Connie_Kendall_001.jpg"));
        contacts.add(new Contact("Eugene Meltzner", "010-324-5230", "https://static.wikia.nocookie.net/the-imagination-station/images/a/a8/Eugene_Meltsner_001.jpg"));
        contacts.add(new Contact("Katrina Shanks", "019-434-2354", "https://www.adventuresinodyssey.com/wp-content/uploads/23_Katrina-Meltsner-1.png"));
        contacts.add(new Contact("Aubrey Shepherd", "014-484-3454", "https://www.adventuresinodyssey.com/wp-content/uploads/Aubrey-Shepard-Clipped.png"));
        contacts.add(new Contact("Bernard Walton", "015-555-5354", "https://static.wikia.nocookie.net/adventuresinodyssey/images/4/43/255px-Bernardwalton.png"));
        contacts.add(new Contact("Rodney Rathbone", "012-123-5354", "https://www.aiowiki.com/w/images/thumb/8/80/Rodneyrathbone.png/170px-Rodneyrathbone.png"));
        contacts.add(new Contact("Mandy Straussberg", "016-432-7833", "https://odysseynerds.files.wordpress.com/2017/02/mandy_in_the_great_wishy_woz.jpg"));
        contacts.add(new Contact("Liz Horton", "018-942-7343", "https://www.aiowiki.com/w/images/thumb/8/8a/Lizhorton-site.png/170px-Lizhorton-site.png"));

        // Create ContactsRecViewAdapter class
        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        // Pass the adapter to the RecyclerView Object
        contextRecView.setAdapter(adapter);

        // Display display = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        // int rotation = display.getRotation();
        // https://stackoverflow.com/questions/5112118/how-to-detect-orientation-of-android-device#:~:text=getDefaultDisplay()%3B%20int%20rotation%20%3D%20display,from%20its%20%22natural%22%20orientation.

        // Set layout manager for the recycler view

        // If we want linear layout vertical
        // contextRecView.setLayoutManager(new LinearLayoutManager(this));

        // if we want linear layout horizontal
        contextRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // For grid layout
        // contextRecView.setLayoutManager(new GridLayoutManager(this, 3));
    }
}