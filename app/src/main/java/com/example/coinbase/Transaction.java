package com.example.coinbase;

public class Transaction {
    public int id;
    public String name;
    public String shortdesc;
    public String average;
    public String image;


    Transaction() {

    }

    public Transaction(int id, String name, String shortdesc, String average, String image) {
        this.id = id;
        this.name = name;
        this.shortdesc = shortdesc;
        this.average = average;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getAverage() {
        return average;
    }

    public String getImage() {
        return image;
    }
}
