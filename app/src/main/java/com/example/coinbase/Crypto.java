package com.example.coinbase;

public class Crypto {

    private String name;
    private int price;
    private int photo;

    public Crypto() {
    }

    public Crypto(String Name, int Price, int Photo)
    {
        name=Name;
        price=Price;
        photo=Photo;
    }

    //Getter


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPhoto() {
        return photo;
    }

    //Setter


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
