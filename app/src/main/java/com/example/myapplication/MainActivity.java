package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button popupButton = findViewById(R.id.viewbut);
        drawerLayout = findViewById(R.id.drawer_Layout);
        navigationView=findViewById(R.id.nav_view);
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerToggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId())
            {
                case R.id.Reqam:
                {
                    Intent i=new Intent(getApplicationContext(),map.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this,"Ambulance Booked",Toast.LENGTH_SHORT).show();
                    break;

                }
                case R.id.About_us:
                {
                    Intent in = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(in);
                    break;

                }
                case R.id.feedback:
                {
                    Intent i = new Intent(getApplicationContext(),Feedback.class);
                    startActivity(i);
                    break;
                }
                case R.id.troubleshoot:
                {
                    Intent i = new Intent(getApplicationContext(),Troubleshoot.class);
                    startActivity(i);
                    break;
                }
                case R.id.reqfs:
                {
                    Intent i = new Intent(getApplicationContext(),Fireservice.class);
                    startActivity(i);
                    break;
                }
                case R.id.police:
                {
                    Intent i = new Intent(getApplicationContext(),Policeinform.class);
                    startActivity(i);
                    break;
                }
                case R.id.all:
                {
                    Intent i = new Intent(getApplicationContext(),notification.class);
                    startActivity(i);
                    break;
                }

            }
            return false;
        });


    }
    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }

}