package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Feedback extends AppCompatActivity {

    private Button submitFeedbackButton;
    EditText editTextfeedback_name,editTextfeedback_edittext , editTextfeedback_comments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        String radiovalue;
        editTextfeedback_name = findViewById(R.id.feedback_name);
        editTextfeedback_edittext = findViewById(R.id.feedback_edittext);
        editTextfeedback_comments = findViewById(R.id.feedback_comments);
        submitFeedbackButton = findViewById(R.id.submit_feedback_button);
        final DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Feed");

        submitFeedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatabaseReference db = databaseReference.push();
                RatingBar ratingbar = findViewById(R.id.feedback_rating);
                float rating = ratingbar.getRating();
                String temp=Float.toString(rating);
                RadioGroup radioGroup = findViewById(R.id.contact_radiogroup);
                int sel = radioGroup.getCheckedRadioButtonId();
                String radiovalue = null;
                if(sel!=-1){
                    RadioButton radioButton = findViewById(sel);
                    radiovalue = radioButton.getText().toString();
                }
                Feed feedback=new Feed(editTextfeedback_name.getText().toString(),editTextfeedback_edittext.getText().toString(),editTextfeedback_comments.getText().toString(),temp,radiovalue);
                db.setValue(feedback);
                // Send feedback to your feedback system
            }
        });
    }
}
