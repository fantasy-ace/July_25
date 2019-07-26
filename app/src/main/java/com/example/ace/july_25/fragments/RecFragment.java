package com.example.ace.july_25.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ace.july_25.MainPresenter;
import com.example.ace.july_25.MainView;
import com.example.ace.july_25.R;
import com.example.ace.july_25.adapters.RecAdapter;
import com.example.ace.july_25.beans.DatasEntity;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecFragment extends Fragment implements MainView {


    private View view;
    private int page=1;
    private RecyclerView mMyRec;
    private SmartRefreshLayout mMySmart;
    private MainPresenter mainPresenter;
    private ArrayList<DatasEntity> datasEntities;
    private RecAdapter recAdapter;

    public RecFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rec, container, false);
        initView(view);
        mainPresenter = new MainPresenter(this);
        initRec();
        return view;
    }

    @Override
    public void onDestroy() {
        mainPresenter.destroy();
        super.onDestroy();
    }

    private void initRec() {
        mMyRec.setLayoutManager(new LinearLayoutManager(getContext()));
        mMyRec.addItemDecoration(new DividerItemDecoration(getContext(),1));
        datasEntities = new ArrayList<>();
        recAdapter = new RecAdapter(datasEntities, getContext());
        mMyRec.setAdapter(recAdapter);
        mainPresenter.loadData(page);
        mMySmart.setOnLoadmoreListener(new OnLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                page++;
                mainPresenter.loadData(page);
            }
        });
        mMySmart.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                page=1;
                datasEntities.clear();
                mainPresenter.loadData(page);
            }
        });
    }

    private void initView(View view) {
        mMyRec = (RecyclerView) view.findViewById(R.id.myRec);
        mMySmart = (SmartRefreshLayout) view.findViewById(R.id.mySmart);
    }

    @Override
    public void addData(List<DatasEntity> datas) {
        datasEntities.addAll(datas);
        recAdapter.notifyDataSetChanged();
        mMySmart.finishRefresh();
        mMySmart.finishLoadmore();
    }

    @Override
    public void onError(Throwable e) {

    }
}
