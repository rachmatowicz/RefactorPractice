package com.fred.test;

import com.fred.client.MyClient;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: nrla
 * Date: 7/20/11
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyClientTest {
    MyClient c = new MyClient() ;

    @Test
    public void testGetI() throws Exception {
        c.getI() ;
    }

    @Test
    public void testSetI() throws Exception {
        c.setI(1);
    }

    @Test
    public void testMain() throws Exception {
        System.out.println("blah");
    }
}
