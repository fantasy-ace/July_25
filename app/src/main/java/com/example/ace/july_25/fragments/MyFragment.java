package com.example.ace.july_25.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ace.july_25.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {


    private View view;
    private RecyclerView mRec;

    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        initView(view);
        initRec();
        return view;
    }

    private void initRec() {
        mRec.setLayoutManager(new LinearLayoutManager(getContext()));
        mRec.addItemDecoration(new DividerItemDecoration(getContext(),1));

    }

    private void initView(View view) {
        mRec = (RecyclerView) view.findViewById(R.id.rec);
    }
}
