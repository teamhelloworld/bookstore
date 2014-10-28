/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author loint
 */
public class TestCase {
    
    public TestCase() {
    }
    
    public static void out(String str) {
        System.out.println(str + "\n");
    }
    
    
    @BeforeClass
    public static void setUpClass() {
        out("Setup class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        out("Teardown class");
    }
    
    @Before
    public void setUp() {
        out("Setup");
    }
    
    @After
    public void tearDown() {
        out("Setup");
    }
}
