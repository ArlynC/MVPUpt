package com.example.mvpupt.Model;

public interface LoginInteractor {
    interface OnLoginFinishedListener {
        void onUsernameError();
        void onPasswordError();
        void onSuccess();
        void onerrorincorrectpass();
    }
    void login(String username, String password, OnLoginFinishedListener listener);
}
