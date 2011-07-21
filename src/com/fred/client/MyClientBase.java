package com.fred.client;

/**
 * Created by IntelliJ IDEA.
 * User: nrla
 * Date: 7/21/11
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyClientBase implements MyClientBaseInterface {
    int i = 0 ;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
