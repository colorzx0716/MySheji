package com.bawie.mybinder;

/**
 * 创建真实对象类，即“我”
 */

public class RealSubject implements Subject {
    //我的需求，想让代购做的事情
    @Override
    public void buyMac() {
        System.out.println("买一台MAc");
    }
}
