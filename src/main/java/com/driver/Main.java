package com.driver;

public class Main {
    public static void main(String[] args) {

//        RWOnly obj = new RWOnly();
//        obj.name = "Ajay";

//        java: name has private access in com.driver.RWOnly
        RWOnly obj = new RWOnly();
        obj.setName("Ajay");
        System.out.println(obj.getName());
    }
  
}