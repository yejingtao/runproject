package com.runner.maven;

import junit.framework.Assert;
import org.junit.Test;

public class ByeMavenTester {

    @Test
    public void testHello(){
        ByeMaven bye = new ByeMaven();
        String name = bye.byeHello("Tom");
        //判断 Hello 传入的参数是否是 "maven"
        Assert.assertEquals("Tom", name);
    }
}
