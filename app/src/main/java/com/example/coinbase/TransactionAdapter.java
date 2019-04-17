package com.example.coinbase;

import android.app.Dialog;
import android.content.Context;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.bumptech.glide.Glide;


import java.util.List;
import java.util.Map;


/* Recycler Adapter
    Recycler ViewHolder
 */
public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {

    private Context mCtx;
    private List<Transaction> transactionList;


    public TransactionAdapter(Context mCtx, List<Transaction> transactionList) {
        this.mCtx = mCtx;
        this.transactionList = transactionList;
    }

    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View v = inflater.inflate(R.layout.transaction_item, null);
        final TransactionViewHolder vHolder = new TransactionViewHolder(v);
        //Dialog Ini
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder transactionViewHolder, int i) {
        Transaction transaction = transactionList.get(i);

        transactionViewHolder.transactionName.setText(transaction.getName());
        transactionViewHolder.transactionShortDesc.setText(transaction.getShortdesc());
        transactionViewHolder.transactionAverage.setText(transaction.getAverage()+" $");

        //loading the image
        Glide.with(mCtx)
                .load(transaction.getImage())
                .into(transactionViewHolder.transactionImageView);


    }

    @Override
    public int getItemCount() {
        return transactionList.size();
    }

    class TransactionViewHolder extends RecycleViewAdapter.MyViewHolder {

 //       private RelativeLayout transactionItem;
        private TextView transactionName;
        private TextView transactionShortDesc;
        private TextView transactionAverage;
        private ImageView transactionImageView;

        public TransactionViewHolder(View itemView) {
            super(itemView);

//            transactionItem = (RelativeLayout) itemView.findViewById(R.id.transaction_item);
            transactionName = (TextView) itemView.findViewById(R.id.transactionName);
            transactionShortDesc = (TextView) itemView.findViewById(R.id.transactionShortDesc);
            transactionAverage = (TextView) itemView.findViewById(R.id.transactionAverage);
            transactionImageView = (ImageView) itemView.findViewById(R.id.transactionImage);

        }
    }

}
