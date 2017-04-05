package com.example.hanheedo.a20170404;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.example.hanheedo.a20170404.R;
import java.util.ArrayList;
import static android.R.id.list;


/**
 * Created by Han Heedo on 2017-03-17.
 */

public class MyItemsList extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myitemslist);


        ListView listView = (ListView) findViewById(R.id.listView);

        String[] listVal = new String[] {
                "감자",
                "사과",
                "배",
                "양파",
                "호박"
        };

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < listVal.length; ++i) {
            list.add(listVal[i]);
        }


        final ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(mAdapter);

        Intent intent = getIntent();
        String data = intent.getStringExtra("Login_List");
    }

    public void addClick(View view)
    {
        Intent intent = new Intent(this, AddItem.class);
        intent.putExtra("List_Add","data_3");
        startActivity(intent);
    }
}

