package com.blue.componentapp;

import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.blue.common.BaseActivity;

/**
 * Created by blue on 2021/03/29.
 * (*^▽^*)
 * 描述:
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //通过路由直接打开home组件的HomeActivity，
        ARouter.getInstance().build("/home/HomeActivity").navigation();
        finish();
    }

}