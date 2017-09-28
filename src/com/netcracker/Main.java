package com.netcracker;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        print(args);
    }
    public static void print(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}
