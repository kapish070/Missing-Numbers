/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

 
public class missingTest {
    
    public missingTest() {
        System.out.println("test");
        String d1 = "2010-06-10";
        int b1 = 5;
        String d2 = "2010-06-12";
        int b2 = 15;
        String d3 = "1970-01-01";
        String d4 = "2100-01-01";
        int a = 0;
        String exresult="2010-06-12 5 2010-06-13 10 2010-06-14 15";
        missing instance = new missing();
        instance.test(d1, b1, d2, b2, d3, d4, a);
        assertEquals(exresult,exresult);
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of test method, of class missing.
     */
    @Test
    public void testTest() {
        System.out.println("test");
        String d1 = "2010-06-10";
        int b1 = 5;
        String d2 = "2010-06-12";
        int b2 = 15;
        String d3 = "1970-01-01";
        String d4 = "2100-01-01";
        int a = 0;
        String exresult="2010-06-12 5 2010-06-13 10 2010-06-14 15";
        missing instance = new missing();
        instance.test(d1, b1, d2, b2, d3, d4, a);
        assertEquals(exresult,exresult);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
