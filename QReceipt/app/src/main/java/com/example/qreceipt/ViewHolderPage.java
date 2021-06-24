package com.example.qreceipt;

import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewHolderPage extends RecyclerView.ViewHolder {

    ArrayList<SampleData> movieDataList;

    private TextView tv_title;
    private RelativeLayout rl_layout;
    ListView listView;
    ListAdapter listAdapter;

    DataPage data;

    ViewHolderPage(View itemView) {
        super(itemView);
        tv_title = itemView.findViewById(R.id.tv_title);
        rl_layout = itemView.findViewById(R.id.rl_layout);
        listView = itemView.findViewById(R.id.listview1);
        InitializeMovieData();
        listAdapter = new ListAdapter(itemView.getContext(), movieDataList);
        listView.setAdapter(listAdapter);
    }

    public void onBind(DataPage data){
        this.data = data;

        tv_title.setText(data.getTitle());
        rl_layout.setBackgroundResource(data.getColor());
    }

    public void InitializeMovieData()
    {
        movieDataList = new ArrayList<SampleData>();

        movieDataList.add(new SampleData(R.drawable.ic_launcher_background, "t1","a"));
        movieDataList.add(new SampleData(R.drawable.ic_launcher_background, "t2","b"));
        movieDataList.add(new SampleData(R.drawable.ic_launcher_background, "t3","c"));
    }
}