package com.example.ace.july_25.utils;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.example.ace.july_25.beans.DatasEntity;
import com.example.ace.july_25.db.DaoMaster;
import com.example.ace.july_25.db.DaoSession;
import com.example.ace.july_25.db.DatasEntityDao;

import java.util.List;

/**
 * Created by ACE on 2019/7/26.
 */

public class BeanDaoUtil extends Application {
    private static BeanDaoUtil sInstance;
    private DaoMaster.DevOpenHelper mHelper;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;
    private DatasEntityDao datasEntityDao;

    public BeanDaoUtil(DatasEntityDao datasEntityDao) {
        if (datasEntityDao==null){
            synchronized (DatasEntityDao.class){
                if (datasEntityDao==null){
                    this.datasEntityDao = datasEntityDao;
                }
            }
        }
    }

    public long insert(DatasEntity datasEntity){
        long insert = datasEntityDao.insert(datasEntity);
        return insert;
    }

    public List<DatasEntity> loadAll(){
        List<DatasEntity> datasEntities = datasEntityDao.loadAll();
        return datasEntities;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        setDatabase();
    }
    /**
     * 设置greenDao
     */
    private void setDatabase() {
        mHelper = new DaoMaster.DevOpenHelper(this, "MyDb", null);    // MyDb是数据库的名字，更具自己的情况修改
        SQLiteDatabase db = mHelper.getWritableDatabase();
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();
    }
    public static BeanDaoUtil getInstance(){
        return sInstance;
    }
    public DaoSession getDaoSession(){
        return mDaoSession;
    }
}
