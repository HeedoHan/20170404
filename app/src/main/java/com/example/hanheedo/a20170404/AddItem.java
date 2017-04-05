package com.example.hanheedo.a20170404;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Han Heedo on 2017-03-17.
 */

public class AddItem extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additem);

        Intent intent = getIntent();
        String data = intent.getStringExtra("List_Add");
    }

    public void cancelClick(View view)
    {
        finish();
    }
}
