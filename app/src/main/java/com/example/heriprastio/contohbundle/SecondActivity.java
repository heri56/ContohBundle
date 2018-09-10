package com.example.heriprastio.contohbundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final TextView textView;
        textView = findViewById(R.id.txtbawa);

        Bundle bundle = getIntent().getExtras();
        String replace = bundle.getString("Datakey");
        textView.setText("Selamat datang "+replace);
    }

}
