package com.example.levutantuan.demomvp.Login;

import com.example.levutantuan.demomvp.R;

/**
 * Created by levutantuan on 3/22/17.
 */
public class PresenterLogicXulyLogin implements PresenterImpXuLyLogin {
   private ViewXulyLogin mViewXulyLogin;
    public PresenterLogicXulyLogin(ViewXulyLogin viewXulyLogin){
        this.mViewXulyLogin = viewXulyLogin;
   }
    @Override
    public void KiemtraLogin(String id, String password) {
        //Gọi tới model de lay du lieu

        if(id.equals("Tuan") && password.equals("123")){
            //Login OK
            mViewXulyLogin.LoginOk(id);
        } else {
            //Login Erro !
            mViewXulyLogin.LoginError();
        }
    }
}
