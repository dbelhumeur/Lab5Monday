/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vendinglab5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
/**
 *
 * @author Dominique
 */
public class VendingTest {
  // public VendingItem vendingI;
    public class VendingLab5Test extends TestCase{
    public void test1(){
        assertTrue(3==3);
}
    public void test2(){
        assertFalse(3!=3);
    }
   /* public void test3(){
        assertSame(balance,price);
    }
    */
     public class VendTest extends TestCase {   
         /*static*/Vending v = new Vending(5,5);      
         public void setUp() {     
             v.addMoney(1.5);    }      
         public void test2() {     
             v.select("Gum");      
             assertTrue(v.getBalance()==1);    }
        
         public void test3() {      
             v.select("Candy");      
             assertTrue(v.getBalance()==.25);    }  
     }

}
    public VendingTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        //vendingI=new VendingItem(1,10);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of resetBalance method, of class Vending.
     */
    @Test
    public void testResetBalance() {
        System.out.println("resetBalance");
        Vending instance = null;
        //instance.resetBalance();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class Vending.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
         Vending instance = null;
         double result=instance.getBalance();
        /*VendingItem vendingI;
        vendingI=new VendingItem(1,10);
        vendingI.price=1;
        vendingI.numPieces=10;
        double expResult = 0.0;
        double result = vendingI.getBalance();
       */
         double expResult = 0.0;
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addMoney method, of class Vending.
     */
    @Test
    public void testAddMoney() {
        System.out.println("addMoney");
        double amt = 0.0;
        Vending instance = null;
        //instance.addMoney(amt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class Vending.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        String name = "";
        Vending instance = null;
        //instance.select(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
