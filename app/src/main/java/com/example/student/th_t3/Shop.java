package com.example.student.th_t3;

/**
 * Created by Student on 10/8/2020.
 */

public class Shop {
    private String Name;
    private String ShopName;
    private int img;

    public Shop(String name, String shopName, int img) {
        Name = name;
        ShopName = shopName;
        this.img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
