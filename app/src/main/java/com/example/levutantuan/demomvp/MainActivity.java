package com.example.levutantuan.demomvp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.levutantuan.demomvp.Login.PresenterLogicXulyLogin;
import com.example.levutantuan.demomvp.Login.ViewXulyLogin;

public class MainActivity extends AppCompatActivity implements ViewXulyLogin,
    View.OnClickListener {
   private PresenterLogicXulyLogin logicXulyLogin = new PresenterLogicXulyLogin(this);
   private Button mButtonOK;
   private EditText mEditTextName, mEditTextPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonOK = (Button) findViewById(R.id.button_login);
        mEditTextName = (EditText) findViewById(R.id.text_id);
        mEditTextPass = (EditText) findViewById(R.id.text_pass);
        mButtonOK.setOnClickListener(this);
    }

    @Override
    public void LoginOk(String thongbao) {
        Toast.makeText(this, getString(R.string.msg_loginok) + thongbao, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void LoginError() {
        Toast.makeText(this, R.string.msg_loginerror, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        String name, pass;
        name = mEditTextName.getText().toString();
        pass = mEditTextPass.getText().toString();

        logicXulyLogin.KiemtraLogin(name, pass);
    }
}
