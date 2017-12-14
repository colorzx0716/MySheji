package com.bawie.mybinder.dan;

/**
 * 单例仓库类
 */

public class StoreHouse {
    //仓库商品数量
    private int quantity = 100;
    //自己在内部实例化
    private static StoreHouse ourInstance  = new StoreHouse();;
    //让外部通过调用getInstance()方法来返回唯一的实例。
    public static StoreHouse getInstance() {
        return ourInstance;
    }

    //封闭构造函数
    private StoreHouse() {
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

}
