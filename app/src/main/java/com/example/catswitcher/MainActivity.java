package com.example.catswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=(ImageView) findViewById(R.id.cat1ImageView);
    }
    public void catSwitcher(View view){

        switch(view.getId()) {
            case R.id.submitButton: {
                if (flag) {
                    image.setImageResource(R.drawable.cat1);
                    Toast.makeText(this, "Happy me!", Toast.LENGTH_SHORT).show();
                    flag = false;
                } else {
                    image.setImageResource(R.drawable.cat2);
                    Toast.makeText(this, "Lonely me!", Toast.LENGTH_SHORT).show();
                    flag = true;
                }
                return;
            }
        }

    }
}