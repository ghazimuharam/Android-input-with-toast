package com.example.tugas1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button submit_btn;
    EditText nama, nim, prodi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit_btn = findViewById(R.id.submit_btn);
        nama = findViewById(R.id.editTextTextPersonName);
        nim = findViewById(R.id.editTextTextNPM);
        prodi = findViewById(R.id.editTextTextProdi);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nama.length() > 0 && nim.length() > 0 && prodi.length() > 0){
                    Toast.makeText(getApplicationContext(),nama.getText().toString() + " " + nim.getText().toString() + " " + prodi.getText().toString() ,Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Mohon isi semua field" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}