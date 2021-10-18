package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginbutton;
    private TextView textitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginbutton = findViewById(R.id.clickbutton);

        textitem = findViewById(R.id.toasttext);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.toasttext){
                    Toast.makeText(MainActivity.this,"here",Toast.LENGTH_SHORT).show();
                    textitem.setText("this is my love");
                }
                LayoutInflater inflater =  getLayoutInflater() ;

             View customView  = inflater.inflate(R.layout.customtoast_layout, (ViewGroup) findViewById(R.id.customToastid));

                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.setView(customView);
                toast.show();

            }
        });

    }
}