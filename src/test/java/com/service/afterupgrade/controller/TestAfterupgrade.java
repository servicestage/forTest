package com.service.afterupgrade.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestAfterupgrade {

        AfterupgradeDelegate afterupgradeDelegate = new AfterupgradeDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = afterupgradeDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}