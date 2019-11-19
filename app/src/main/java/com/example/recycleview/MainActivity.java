package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView rvNumber;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvNumber = findViewById(R.id.recycle_number);
        rvNumber.setLayoutManager(new LinearLayoutManager(this));

        final List<String> data1=new ArrayList<>();
        for(int i = 0;i<100;i++){
            data1.add(String.valueOf(i));
        }
        final NumberAdapter adapter=new NumberAdapter();
        adapter.data=data1;

        rvNumber.setAdapter(adapter);
        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
