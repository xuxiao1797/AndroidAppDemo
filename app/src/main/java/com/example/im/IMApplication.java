package com.example.im;

import android.app.Application;
import android.content.Context;
import android.view.Display;

import com.example.im.model.Model;
import com.hyphenate.chat.EMClient;
import com.hyphenate.chat.EMOptions;
import com.hyphenate.easeui.EaseIM;

public class IMApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //initialize
        EMOptions options = new EMOptions();
        options.setAcceptInvitationAlways(false); //同意后才能接受邀请
        options.setAutoAcceptGroupInvitation(false); // 同意后才能加群
        EaseIM.getInstance().init(this,options);

        Model.getInstance().init(this);
    }
}
