package com.fred.test;

import com.fred.server.MyNewServer;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: nrla
 * Date: 7/20/11
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyServerTest {
    MyNewServer s = new MyNewServer() ;

    @Test
    public void testGetF() throws Exception {
        s.getF() ;
    }

    @Test
    public void testSetF() throws Exception {
        s.setF((float) 1.0);
    }
}
