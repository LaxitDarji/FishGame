
package content;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arsh Gabbi
 */
public class Player {
    
    public Player() {
    }

   
    public void setUp() throws Exception {
    }
    
  

    /**
     * Test of hasGiven method, of class Player.
     */
  
    public void testHasGiven() {
        System.out.println("hasGiven");
        Card cType = null;
        Player instance = new PlayerImpl();
        boolean expResult = false;
        boolean result = instance.hasGiven(cType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveAll method, of class Player.
     */
    public void testGiveAll() {
        System.out.println("giveAll");
        Card cType = null;
        Player instance = new PlayerImpl();
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.giveAll(cType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumBooks method, of class Player.
     */
  
    public void testGetNumBooks() {
        System.out.println("getNumBooks");
        Player instance = new PlayerImpl();
        int expResult = 0;
        int result = instance.getNumBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of haveTurn method, of class Player.
     */
  
    public void testHaveTurn() {
        System.out.println("haveTurn");
        Player instance = new PlayerImpl();
        instance.haveTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void assertEquals(ArrayList<Card> expResult, ArrayList<Card> result) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int getNumBooks() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void haveTurn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean hasGiven(Card cType) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(boolean expResult, boolean result) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private ArrayList<Card> giveAll(Card cType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void assertEquals(int expResult, int result) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public class PlayerImpl extends Player {

        public void haveTurn() {
            
            
            
            
        }
    }
    
}