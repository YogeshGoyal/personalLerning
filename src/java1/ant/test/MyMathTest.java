/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ant.test;

import java1.ant.src.MyMath;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yokukuma
 */
public class MyMathTest {
    @Test
    public void testMulti() {
        MyMath math = new MyMath();
        assertEquals(50, math.multi(5, 10));
    }
}
