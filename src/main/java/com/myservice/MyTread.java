package com.myservice;

/**
 * @author version
 * @version 1.0
 * @date 2020/2/20 17:26
 */
public class MyTread extends Thread {
    public void run(){
        service wx=new service();
        wx.service1();
    }

    public static void main(String[] args) {
        MyTread thread=new MyTread();
        thread.start();
    }
}
