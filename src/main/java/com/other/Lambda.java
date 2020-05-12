package com.other;

/**
 * @author version
 * @version 1.0
 * @date 2020/5/12 17:32
 */
public class Lambda {
    final static String salutation = "Hello! ";

    public static void main(String args[]){
        GreetingService greetService1 = message -> System.out.println(salutation + message);
        greetService1.sayMessage("Runoob");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
