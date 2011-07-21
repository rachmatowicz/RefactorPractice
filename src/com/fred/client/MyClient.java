package com.fred.client;

/**
 * Created by IntelliJ IDEA.
 * User: nrla
 * Date: 7/20/11
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyClient {
    static int iii = 0 ;
    int i = 0 ;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        System.out.println("MyClient");
        System.out.println("The value of iii is " + iii);
    }
}
