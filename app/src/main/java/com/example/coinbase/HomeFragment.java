package com.example.coinbase;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Crypto> listCrypto;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =inflater.inflate(R.layout.fragment_home, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.homeRecyclerView);
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter(getContext(),listCrypto);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recycleViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listCrypto = new ArrayList<>();
        listCrypto.add(new Crypto("Bitcoin",0,R.drawable.bitcoin));
        listCrypto.add(new Crypto("Ethereum",0,R.drawable.ethereum));
        listCrypto.add(new Crypto("Ripple",0,R.drawable.ripple));
        listCrypto.add(new Crypto("Litecoin",0,R.drawable.litecoin));
        listCrypto.add(new Crypto("Bitcoin Cash",0,R.drawable.bitcoin_cash));
        listCrypto.add(new Crypto("EOS",0,R.drawable.eos));
        listCrypto.add(new Crypto("Binance",0,R.drawable.binance));
        listCrypto.add(new Crypto("Stellar",0,R.drawable.stellar));
        listCrypto.add(new Crypto("Cardano",0,R.drawable.cardano));
        listCrypto.add(new Crypto("Tether",0,R.drawable.tether));
    }

}
