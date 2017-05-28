/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import unitest.AddNumber;

/**
 *
 * @author yokukuma
 */
public class UnitTest1 {

    public UnitTest1() {
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

    @Test
    public void test1() {
        AddNumber add = new AddNumber();
        int out = add.addNumber(12, 23);
        assertEquals(35, out);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        AddNumber add = new AddNumber();
        add.throwError();
//        try {
//            add.throwError();
//            fail("thrown exsception is not IllegalArgumentException . ");
//        }catch(IllegalArgumentException e){
//            
//        }

    }

}
