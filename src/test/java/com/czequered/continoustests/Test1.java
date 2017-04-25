package com.czequered.continoustests;

import org.junit.Test;

import java.util.Date;

/**
 * @author Martin Varga
 */
public class Test1 {
    @Test
    public void test1() {
        System.out.println("test1 changed" + new Date());
    }
}
