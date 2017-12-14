package com.bawie.mybinder;

/**
 *创建代理对象，即“代购”，
 * 并通过代理类创建真实对象实例并访问其方法（想法）
 *
 */

public class Proxy implements Subject {

    @Override
    public void buyMac() {

        //引用并创建真实对象实例，即“我”
        RealSubject realSubject = new RealSubject();

        //调用真实对象的方法，进行代理购买Mac
        realSubject.buyMac();
        //代理对象额外做的操作
        WrapMac();

    }

    public void WrapMac() {
        System.out.println("用盒子包装好的Mac");
    }
}
