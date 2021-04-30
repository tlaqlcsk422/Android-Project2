package com.example.androidproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.main_menu, menu);
            return super.onCreateOptionsMenu(menu);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.quick_action1:
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.main_container, new MonthviewFragment());
                fragmentTransaction.commit();
                Toast.makeText(getApplicationContext(), "action_quick", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.main_container, new MonthviewFragment());
                fragmentTransaction.commit();
                Toast.makeText(getApplicationContext(), "action_settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_subactivity:
                startActivity(new Intent(this,SubActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}