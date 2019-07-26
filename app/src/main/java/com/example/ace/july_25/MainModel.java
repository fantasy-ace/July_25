package com.example.ace.july_25;

import com.example.ace.july_25.beans.ArtBean;
import com.example.ace.july_25.beans.DatasEntity;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ACE on 2019/7/25.
 */

public class MainModel {
    public void loadData(final DataCallBack dataCallBack,int page){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Observable<ArtBean> observable = retrofit.create(ApiService.class).getData(page);
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ArtBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ArtBean artBean) {
                        List<DatasEntity> datas = artBean.getData().getDatas();
                        dataCallBack.onSuccess(datas);
                    }

                    @Override
                    public void onError(Throwable e) {
                        dataCallBack.onFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    interface DataCallBack{
        void onSuccess(List<DatasEntity> datas);
        void onFailure(Throwable e);
    }
}
