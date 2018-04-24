package com.design.pattern.singleton;

/**
 * 单例模式涉及一个类，它负责创建一个对象，同时确保只创建一个对象。这个类提供了一种方法来访问它的唯一对象，可以直接访问，而不需要实例化类的对象。
 * 饿汉模式，常驻内存，没有起到lazy loading的作用，不存在线程安全的问题
 */
public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
