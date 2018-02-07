package com.service.testgit.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestFortest {

        FortestDelegate fortestDelegate = new FortestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = fortestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}