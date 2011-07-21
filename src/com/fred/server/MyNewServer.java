package com.fred.server;

/**
 * Created by IntelliJ IDEA.
 * User: nrla
 * Date: 7/20/11
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyNewServer {

    static float ff = 0 ;
    float f = 0 ;

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public static void main(String[] args) {
        System.out.println("MyNewServer");
        System.out.println("The value of ff is " + ff);
    }
}
