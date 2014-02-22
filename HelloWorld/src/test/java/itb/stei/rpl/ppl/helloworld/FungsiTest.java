/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itb.stei.rpl.ppl.helloworld;

import junit.framework.TestCase;

/**
 *
 * @author TOSHIBA
 */
public class FungsiTest extends TestCase {
    
    public FungsiTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of main method, of class HelloWorld2.
     */
    /*public void testMain() {
        System.out.println("main");
        String[] args = null;
        Fungsi.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
    public void testKali(){
        Fungsi obj = new Fungsi();
        assertEquals(0, obj.kali(0, 0));
        assertEquals(4, obj.kali(2, 2));
    }
    
    public void testKali2(){
        Fungsi obj = new Fungsi();
        assertEquals(1, obj.kali(1, 1));
        assertEquals(6, obj.kali(2, 3));
        assertEquals(9, obj.kali(3, 3));
    }
    
    public void testKali3(){
        Fungsi obj = new Fungsi();
        assertEquals(6, obj.kali(3, 3));
        assertEquals(8, obj.kali(4, 4));
        
    }
}
