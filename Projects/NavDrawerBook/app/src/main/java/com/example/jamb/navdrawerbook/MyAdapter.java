package com.example.jamb.navdrawerbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

/**
 * Created by jamb on 10/31/2017.
 */

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder> {
    private LayoutInflater inflater;
    List<DataSet> data= Collections.EMPTY_LIST;

    public MyAdapter (Context context, List<DataSet> data){
        inflater=LayoutInflater.from(context);
        this.data = data;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.row_layout, parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DataSet current = data.get(position);
        holder.listText.setText(current.chapters);
        holder.listImage.setImageResource(current.photoId);



    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
         ImageView listImage;
         TextView listText;

        public MyViewHolder(View itemView) {
            super(itemView);
        listImage= itemView.findViewById(R.id.list_image);
        listText= itemView.findViewById(R.id.list_text);


        }
    }
}
