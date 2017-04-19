package com.ditclear.app;

import com.ditclear.app.base.BaseBindActivity;
import com.ditclear.app.bean.MyHandler;
import com.ditclear.app.bean.MyTask;
import com.ditclear.app.bean.UserEntity;
import com.ditclear.app.databinding.ActivityMainBinding;

public class MainActivity extends BaseBindActivity<ActivityMainBinding> {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        mBinding.contentTv.setText("this is bindText");
        UserEntity userEntity = new UserEntity();
        userEntity.firstName = "Victor";
        userEntity.lastName = "Fang";
        userEntity.phone = "13333333333";
        userEntity.isShowPhone = true;
        mBinding.setUser(userEntity);
        mBinding.toolbarLayout.setUser(userEntity);
        mBinding.toolbarLayout.titleTv.setText("你好");

        // 绑定方法和监听
        MyHandler handler = new MyHandler();
        MyTask task = new MyTask(this);
        mBinding.setHandler(handler);
        mBinding.setTask(task);
    }


    @Override
    protected void initEventHandler() {

    }

    @Override
    protected void loadData(boolean isRefresh) {

    }
}
