package com.example.ace.july_25;

import com.example.ace.july_25.beans.DatasEntity;

import java.util.List;

/**
 * Created by ACE on 2019/7/25.
 */

public class MainPresenter {
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void destroy(){
        mainView=null;
    }

    public void loadData(int page){
        new MainModel().loadData(new MainModel.DataCallBack() {
            @Override
            public void onSuccess(List<DatasEntity> datas) {
                mainView.addData(datas);
            }

            @Override
            public void onFailure(Throwable e) {
                mainView.onError(e);
            }
        },page);
    }
}
