package com.example.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // B2: Khai báo và ánh xạ view
        TextView tvTitle = findViewById(R.id.tv_Title);
        // B3: xử lí sự kien
        tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "i love u", Toast.LENGTH_SHORT).show();
            }
        });
    }
}