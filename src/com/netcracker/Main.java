package com.netcracker;

public class Main {

    public static void main(String[] args) {
        sort(args);
        print(args);
    }
    public static void print(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void sort(String[] args){
        if(args.length==0)return;
        String buf;
        String min;
        int k=0;
        int minIndex;
        boolean needExchange;
        do {
            needExchange=false;
            min=args[k];
            minIndex=k;
            for (int j = k+1; j <args.length ; j++) {
                if(min.compareTo(args[j])>0){
                    min= args[j];
                    minIndex=j;
                }
                if(!needExchange && args[j-1].compareTo(args[j])>0)
                    needExchange=true;
            }
            if(minIndex!=k) {
                buf = args[minIndex];
                args[minIndex] = args[k];
                args[k] = buf;
            }
            k++;
            if(k==args.length)return;
        }while(needExchange);
    }
}
