package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn;

        btn = findViewById(R.id.order);

        btn.setOnClickListener(new View.OnClickListener() {
            /**
             * this is a run time method which is called when the button is clicked
             * length long means messege will be wait for 4 sec in short only 2 sec
             * @param view
             */

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "order cant be taken now", Toast.LENGTH_LONG).show();
            }
        });
    }
}