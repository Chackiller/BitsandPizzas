package com.bignerdranch.android.bitsandpizzas;

import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;


public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void onClickDone(View view) {
        int duration = Snackbar.LENGTH_LONG;
        String text = "Your order has been updated";
        Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinatore),text,duration);
        snackbar.setAction("Undo", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(OrderActivity.this,"Undone!",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        snackbar.show();
    }
}
