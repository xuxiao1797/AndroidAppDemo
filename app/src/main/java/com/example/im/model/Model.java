package com.example.im.model;

import android.content.Context;

import com.example.im.model.bean.UserInfo;
import com.example.im.model.dao.UserAccountDao;
import com.example.im.model.db.DBManager;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//数据模型层全局类
public class Model {
    private Context mContext;
    private ExecutorService executors = Executors.newCachedThreadPool();


    private static Model model = new Model();

    //私有化构造
    private Model(){

    }

    //获取单例对象
    public static Model getInstance(){
        return model;
    }

    public void init(Context context){
        mContext = context;
    }

    //获取全局线程池对象
    public ExecutorService getGlobalThreadPool(){
        return executors;
    }
}

