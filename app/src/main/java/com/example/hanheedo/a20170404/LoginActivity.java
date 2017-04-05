package com.example.hanheedo.a20170404;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.facebook.FacebookSdk;

public class LoginActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText edit_id = (EditText) findViewById(R.id.edit_id); //edit_id
        edit_id.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if(keyCode==event.KEYCODE_ENTER) {
                        return true;
                    }
                    return false;
                }
            });

            final EditText edit_password = (EditText) findViewById(R.id.edit_password); //edit_password
        edit_password.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if(keyCode==event.KEYCODE_ENTER) {
                        return true;
                    }
                    return false;
                }
        });

        LinearLayout MainLayout1 = (LinearLayout) findViewById(R.id.login1); //edit_id
        MainLayout1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edit_id.getWindowToken(),0);
            }
        });

        LinearLayout MainLayout2 = (LinearLayout) findViewById(R.id.login1); //edit_password
        MainLayout2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edit_password.getWindowToken(),0);
            }
        });
    }

    public void loginClick(View view)
    {
        Intent intent = new Intent(this, MyItemsList.class);
        intent.putExtra("Login_List","data_1"); // "DataKey" , "Data"
        startActivity(intent);
    }

    public void signUpClick(View view)
    {
        Intent intent = new Intent(this, SignUp.class);
        intent.putExtra("Login_SignUp","data_2");
        startActivity(intent);

    }
}
