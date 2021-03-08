package com.example.experiment1_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button click = findViewById(R.id.click);
        Button clicklong = findViewById(R.id.clicklong);
        Button showname = findViewById(R.id.showname);
        final EditText name = findViewById(R.id.name);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This is a toast Message",Toast.LENGTH_SHORT).show();
            }
        });

        clicklong.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "You clicked me for so long!", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        showname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name.getText().toString();
                Toast.makeText(getApplicationContext(),"Hello "+username,Toast.LENGTH_SHORT).show();
            }
        });
   }
}