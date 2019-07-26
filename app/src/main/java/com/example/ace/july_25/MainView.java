package com.example.ace.july_25;

import com.example.ace.july_25.beans.DatasEntity;

import java.util.List;

/**
 * Created by ACE on 2019/7/25.
 */

public interface MainView {
    void addData(List<DatasEntity> datas);
    void onError(Throwable e);
}
