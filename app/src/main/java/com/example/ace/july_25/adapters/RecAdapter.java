package com.example.ace.july_25.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.ace.july_25.R;
import com.example.ace.july_25.beans.DatasEntity;

import java.util.ArrayList;

/**
 * Created by ACE on 2019/7/25.
 */

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder> {

    private ArrayList<DatasEntity> datasEntities;

    public RecAdapter(ArrayList<DatasEntity> datasEntities, Context context) {
        this.datasEntities = datasEntities;
        this.context = context;
    }

    private Context context;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(View.inflate(context, R.layout.rec_item_layout,null));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv.setText(datasEntities.get(position).getTitle());
        Glide.with(context).load(datasEntities.get(position).getEnvelopePic()).placeholder(R.mipmap.ic_launcher).into(holder.iv);
        holder.cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(context, "选中", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return datasEntities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;
        CheckBox cb;
        public ViewHolder(View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
            tv=itemView.findViewById(R.id.tv);
            cb=itemView.findViewById(R.id.cb);
        }
    }
}
