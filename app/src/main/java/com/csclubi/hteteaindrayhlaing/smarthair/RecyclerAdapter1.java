package com.csclubi.hteteaindrayhlaing.smarthair;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static com.csclubi.hteteaindrayhlaing.smarthair.R.layout.list_item1;

/**
 * Created by Dell on 6/7/2017.
 */

public class RecyclerAdapter1 extends RecyclerView.Adapter<RecyclerAdapter1.MyViewHolder> {
    int[] images;
    RecyclerAdapter.OnClickHandler clickHandler;

    public RecyclerAdapter1(int[] images, RecyclerAdapter.OnClickHandler clickHandler) {
        this.images = images;
        this.clickHandler = clickHandler;
    }

    public interface OnClickHandler {
        void onClick(int id);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(list_item1, parent, false);
        return new RecyclerAdapter1.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.imageView.setImageResource(images[position]);
    }


    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image_view1);
            imageView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickHandler.onClick(getAdapterPosition());
        }
    }
}
