package com.design.pattern.singleton;

/**
 * 单例模式涉及一个类，它负责创建一个对象，同时确保只创建一个对象。这个类提供了一种方法来访问它的唯一对象，可以直接访问，而不需要实例化类的对象。
 * 懒汉模式，起到lazy loading的作用，需要加锁处理线程安全的问题
 */
public class SingleObject2 {
    //create an object of SingleObject
    private static SingleObject2 instance = null;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject2() {
    }

    //Get the only object available
    public static synchronized SingleObject2 getInstance() {
        if (instance == null) {
            instance = new SingleObject2();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
