package com.example.exp1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybutton = findViewById(R.id.mybutton);
        TextView mytext = findViewById(R.id.mytext);
        EditText myedit = findViewById( R.id.myedit);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1;
                s1 = myedit.getText().toString();
                mytext.setText(s1);
            }
        });
    }
}