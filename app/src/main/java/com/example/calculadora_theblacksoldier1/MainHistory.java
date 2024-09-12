package com.example.calculadora_theblacksoldier1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainHistory extends AppCompatActivity {
    private ListView historyListView;
    private ArrayList<String> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_history);

        historyListView = findViewById(R.id.history_list);
        Button backButton = findViewById(R.id.btn_back_to_main);

        // Obtener los resultados de la intención
        results = getIntent().getStringArrayListExtra("results");

        // Configurar el adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, results);
        historyListView.setAdapter(adapter);

        backButton.setOnClickListener(v -> finish());
    }
}
