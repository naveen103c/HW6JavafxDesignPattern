/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author brkgb
 */
public class PrimaryControllerTest {

    public PrimaryControllerTest() {
    }

    /**
     * Test of sum method, of class PrimaryController.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int a = 0;
        int b = 0;
        PrimaryController instance = new PrimaryController();
        int expResult = 0;
        int result = instance.sum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of multiply method, of class PrimaryController.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 0;
        int b = 0;
        PrimaryController instance = new PrimaryController();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of divide method, of class PrimaryController.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 1;
        int b = 1;
        PrimaryController instance = new PrimaryController();
        int expResult = 1;
        int result = instance.divide(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of compare method, of class PrimaryController.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        String a = "abc";
        String b = "abc";
        PrimaryController instance = new PrimaryController();
        String expResult = "Equal";
        String result = instance.compare(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
