package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button bt;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt=(Button) findViewById(R.id.button);
        txt=(TextView) findViewById(R.id.textView5);
        ImageView myImage = findViewById(R.id.imageView2);
        ImageView popupButton = findViewById(R.id.imageView3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("https://www.cisa.gov/emergency-services-sector");
            }
        });
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),optionmenu.class);
                startActivity(in);
            }
        });

        popupButton.setOnClickListener(view -> {
            PopupMenu popupMenu = new PopupMenu(MainActivity2.this, view);
            popupMenu.getMenuInflater().inflate(R.menu.activity_popupmenu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    switch (menuItem.getItemId()) {
                        case R.id.menu_item1:
                            return true;
                        case R.id.menu_item2:
                            return true;
                        case R.id.menu_item3:
                            return true;
                        default:
                            return false;
                    }
                }
            });
            popupMenu.show();
        });

    }
}