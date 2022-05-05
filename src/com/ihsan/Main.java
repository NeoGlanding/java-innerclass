package com.ihsan;

public class Main {
    public static void main(String[] args) {
//        Normal Inner Class
        OuterClass inner = new OuterClass();
        OuterClass.InnerClass innerInstance = inner.new InnerClass(20);
    }
//    Static Innerclass
    OuterClass.InnerClass2 inner2 = new OuterClass.InnerClass2("2020");
}
