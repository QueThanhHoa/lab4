package com.example.lab4ex1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Food_Main_Activity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Food_Item> items;
    private FoodActivity adapter;
    private Button addItem;  // Declare the addItem button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        // Find ListView and Button by their IDs
        listView = findViewById(R.id.food_list_view);

        // Initialize ArrayList and add items
        items = new ArrayList<>();
        items.add(new Food_Item("Phở", "Phở bò nước", R.drawable.pho_nuoc, "$12.00"));
        items.add(new Food_Item("Gỏi cuốn", "Gỏi cuốn Thanh Hóa", R.drawable.cha_gio, "$15.00"));
        items.add(new Food_Item("Cơm sườn", "Cơm sườn đặc biệt", R.drawable.com_suon, "$20.00"));

        // Set up the custom adapter
        adapter = new FoodActivity(this, items);
        listView.setAdapter(adapter);

        // Set item click listener to show options for Edit/Delete
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showEditOrDeleteDialog(position);
            }
        });

        // Set add item button listener to show dialog
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAddItemDialog();
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
