package com.example.lab4ex1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Drink_Main_Activity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Drink_Item> items;
    private DrinkActivity adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // Find ListView and Button by their IDs
        listView = findViewById(R.id.drink_list_view);

        // Initialize ArrayList and add items
        items = new ArrayList<>();
        items.add(new Drink_Item("Fanta Cam", "Nước uống giải khát", R.drawable.fanta_cam, "$5.00"));
        items.add(new Drink_Item("Hồng Trà vị Chanh Dây", "Trà trái cây thanh nhiệt", R.drawable.hong_tra_chanh, "$10.00"));
        items.add(new Drink_Item("Cam Ép", "Trà trái cây thanh nhiệt", R.drawable.nuoc_cam, "$8.00"));

        // Set up the custom adapter
        adapter = new DrinkActivity(this, items);
        listView.setAdapter(adapter);

        // Set item click listener to show options for Edit/Delete
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showEditOrDeleteDialog(position);
            }
        });
    }

    private void showEditOrDeleteDialog(int position) {
        // Logic to show edit or delete dialog
    }
    private void showAddItemDialog() {
        // Logic to show add item dialog
    }
}
