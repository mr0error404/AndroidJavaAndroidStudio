package com.example.a11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText name,id;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);
        name=findViewById(R.id.editTextText2);
        id=findViewById(R.id.editTextText);
        spinner=findViewById(R.id.spinner);

        String [] spiner={"DOG","CAT","CAR","ANIMAL"};

       ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.lan));
        // ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,spiner);

        spinner.setAdapter(adapter);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String nameSet = name.getText().toString();
                String idSet=id.getText().toString();
                String spin=spinner.getTransitionName();

                Bundle bundle= new Bundle();
                bundle.putString("nameSET",nameSet);
                bundle.putString("idSET",idSet);
                bundle.putString("spin",spin);

                intent.putExtras(bundle);



                startActivity(intent);
            }
        });

    }
}