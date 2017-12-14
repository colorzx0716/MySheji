package com.bawie.mybinder.dan;

/**
 * 搬货工人类
 */

public class Carrier {

    public StoreHouse mStoreHouse;
    public Carrier(StoreHouse storeHouse){
        mStoreHouse = storeHouse;
    }
    //搬货进仓库
    public void MoveIn(int i){
        mStoreHouse.setQuantity(mStoreHouse.getQuantity()+i);
    }
    //搬货出仓库
    public void MoveOut(int i){
        mStoreHouse.setQuantity(mStoreHouse.getQuantity()-i);
    }

}
