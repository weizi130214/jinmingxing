package com.service.service.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestJinmingxing {

    JinmingxingDelegate jinmingxingDelegate = new JinmingxingDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = jinmingxingDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
