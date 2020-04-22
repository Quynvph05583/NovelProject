package com.example.novelsproject.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.novelsproject.R;
import com.example.novelsproject.dao.UsersDao;
import com.example.novelsproject.db.ConnectionDB;

public class LoginActivity extends AppCompatActivity {
    ConnectionDB connectionDB;
    EditText editText, editText2;
    CheckBox checkRemember;
    Button btnLogin;
    UsersDao usersDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        connectionDB= new ConnectionDB();
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        checkRemember = (CheckBox) findViewById(R.id.checkRemember);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editText.getText().toString();
                String password = editText2.getText().toString();
                boolean check = checkRemember.isChecked();
                UsersDao userDao = new UsersDao();
                String z = userDao.Login(username, password);
                Toast.makeText(LoginActivity.this,z,Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
            }
        });
    }
}
