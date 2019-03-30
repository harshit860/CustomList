package com.example.harshitgakhar.recyleroffline;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by harshit gakhar on 30-03-2019.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHoler> {

private Context mContext;
private List<Book> mData;

    public RecyclerViewAdapter(Context context, List<Book> data) {
        mContext = context;
        mData = data;
    }

    @Override
    public MyViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflator = LayoutInflater.from(mContext);
        view=mInflator.inflate(R.layout.cardview_item_book,parent,false);
        return new MyViewHoler(view);
    }

    @Override
    public void onBindViewHolder(MyViewHoler holder, int position) {

        holder.tv_book_title.setText(mData.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHoler extends RecyclerView.ViewHolder{


        TextView tv_book_title;
        ImageView img_book_thumbnail;
        public MyViewHoler(View itemView) {
            super(itemView);

            tv_book_title = (TextView)itemView.findViewById(R.id.book_title_id);
            img_book_thumbnail=(ImageView)itemView.findViewById(R.id.book_img_id);
        }
    }
}
