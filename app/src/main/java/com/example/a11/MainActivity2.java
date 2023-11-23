package com.example.a11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textView);

        Bundle b = getIntent().getExtras();
        String name = b.getString("nameSET");
        String id = b.getString("idSET");
        String spin = b.getString("spin");

        textView.setText(name + "   xxx   "+id+"  -->  "+spin);
    }
}