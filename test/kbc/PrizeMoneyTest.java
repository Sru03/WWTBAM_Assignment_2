/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package kbc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sonu
 */
public class PrizeMoneyTest {
    
    public PrizeMoneyTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getQuestionNo method, of class PrizeMoney.
     */
    @Test
    public void testGetQuestionNo() {
        System.out.println("getQuestionNo");
        int n = 0;
        PrizeMoney instance = new PrizeMoney();
        int expResult = 0;
        int result = instance.getQuestionNo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrizeMoney method, of class PrizeMoney.
     */
    @Test
    public void testGetPrizeMoney() {
        System.out.println("getPrizeMoney");
        PrizeMoney instance = new PrizeMoney();
        int expResult = 0;
        int result = instance.getPrizeMoney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLostMoney method, of class PrizeMoney.
     */
    @Test
    public void testGetLostMoney() {
        System.out.println("getLostMoney");
        PrizeMoney instance = new PrizeMoney();
        int expResult = 0;
        int result = instance.getLostMoney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
