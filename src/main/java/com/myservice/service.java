package com.myservice;

import java.sql.SQLOutput;

/**
 * @author version
 * @version 1.0
 * @date 2020/2/20 17:23
 */
public class service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }
    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }
    synchronized public void service3(){
        System.out.println("service3");
    }
}
