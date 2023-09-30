package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Troubleshoot extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView txt;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troubleshoot);
        Button button;
        EditText editTextname,editTextsummary,editTextimage;
        Button buttonAdd;

        EditText editText;
        button = findViewById(R.id.btn);
        editText = (EditText) findViewById(R.id.editText);
        editTextname = findViewById(R.id.ed1);
        editTextsummary = findViewById(R.id.editText);
        editTextimage = findViewById(R.id.ed2);
        buttonAdd = findViewById(R.id.submit);
        final DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Users");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri a=Uri.parse("https://drive.google.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW,a);
                startActivity(intent);
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference db = databaseReference.push();
                Users users=new Users(editTextname.getText().toString(),editTextsummary.getText().toString(),editTextimage.getText().toString());
                db.setValue(users);
            }
        });
    }
}