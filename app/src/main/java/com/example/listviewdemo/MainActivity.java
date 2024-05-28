package com.example.listviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    AutoCompleteTextView autoCompleteTextView;
    ArrayList<String> arrIds = new ArrayList<>();
    ArrayList<String> arrLanguage = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView listView = findViewById(R.id.myListView);
        spinner = findViewById(R.id.spinner);
        autoCompleteTextView = findViewById(R.id.autoCompleteTxtView);
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Tomato");
        groceryList.add("Fish");
        groceryList.add("Banana");
        groceryList.add("Cold drink");
        groceryList.add("Tomato");
        groceryList.add("tea leaf");
        groceryList.add("Apple");
        groceryList.add("bread");
        groceryList.add("yogurt");
        groceryList.add("Rice");
        groceryList.add("Banana");
        groceryList.add("Cold drink");
        groceryList.add("tea leaf");
        groceryList.add("Apple");
        groceryList.add("bread");
        groceryList.add("yogurt");
        groceryList.add("Rice");
        groceryList.add("Banana");
        groceryList.add("Cold drink");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,groceryList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Item is : "+groceryList.get(position), Toast.LENGTH_LONG).show();
            }
        });


        arrIds.add("Aadhar card");
        arrIds.add("Pan card");
        arrIds.add("Voter card");
        arrIds.add("Passport card");
        arrIds.add("ration card");
        arrIds.add("Driving card");
        arrIds.add("Xth score card");
        arrIds.add("XIIth score card");
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIds);
        spinner.setAdapter(spinnerAdapter);

        arrLanguage.add("C");
        arrLanguage.add("C++");
        arrLanguage.add("java");
        arrLanguage.add("python");
        arrLanguage.add("c#");
        arrLanguage.add("Kotlin");
        arrLanguage.add("Flutter");
        arrLanguage.add("Swift");
        ArrayAdapter<String> autoComplete = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrLanguage);
        autoCompleteTextView.setAdapter(autoComplete);
        autoCompleteTextView.setThreshold(1);

    }
}