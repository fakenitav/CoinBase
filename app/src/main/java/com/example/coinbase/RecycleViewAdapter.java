package com.example.coinbase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {


    Context mContext;
    List<Crypto> mData;

    public RecycleViewAdapter(Context mContext, List<Crypto> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.crypto_item,viewGroup,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.cryptoName.setText(String.valueOf(mData.get(i).getName()));
        myViewHolder.cryptoPrice.setText(String.valueOf(mData.get(i).getPrice()));
        myViewHolder.cryptoImage.setImageResource(mData.get(i).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView cryptoName;
        private TextView cryptoPrice;
        private ImageView cryptoImage;

        public MyViewHolder(View itemView) {
            super(itemView);

        cryptoName = (TextView) itemView.findViewById(R.id.cryptoName);
        cryptoPrice = (TextView) itemView.findViewById(R.id.cryptoPrice);
        cryptoImage = (ImageView) itemView.findViewById(R.id.cryptoImage);


        }
    }
}
