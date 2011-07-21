package com.fred.client;

/**
 * Created by IntelliJ IDEA.
 * User: nrla
 * Date: 7/20/11
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyClient extends MyClientBase {
    static int iii = 0 ;
    double j = 0 ;

    public double getJ() {
        return j;
    }

    public void setJ(double j) {
        this.j = j;
    }

    public static void main(String[] args) {
        System.out.println("MyClient");
        System.out.println("The value of iii is " + iii);
    }
}
