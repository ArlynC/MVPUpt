package com.example.mvpupt.Model;

import android.os.Handler;
import android.text.TextUtils;

public class LoginInteractorImpl  implements LoginInteractor{
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if(TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    return;
                }
                listener.onSuccess();
            }
        }, 1000);
    }
}
