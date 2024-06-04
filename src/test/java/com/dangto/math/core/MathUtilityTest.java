/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dangto.math.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DANG TO
 */
public class MathUtilityTest {
    int n ;
    long actual;

    //Test case #1: check/test getF() with n= 0
    //Input n= 0
    //step/procedure (buoc test)
    //call method getFactorial (n)
    // Expected Result: 1 ( hy vong 0!=1)
    //Actual Result: ? cho chay ham moi biet
    // Status: passed | failed
    @Test //framework ép ta phải viết code theo 1 quy tắc nào đó
    //framework là thư viện, nhưng thư viện không hẳn là framework
    public void testFactorialGivenRightArg0ReturnsWell() {
        n = 0;
        actual = 1;
        assertEquals(actual, MathUtility.getFactorial(n));
    }
    
    //Test case #2: check/test getF() with n = 1
    //Input n= 1
    //step/procedure (buoc test)
    //call method getFactorial (n)
    // Expected Result: 1 ( hy vong 1!=1)
    //Actual Result: ? cho chay ham moi biet
    // Status: passed | failed
    @Test //framework ép ta phải viết code theo 1 quy tắc nào đó
    //framework là thư viện, nhưng thư viện không hẳn là framework
    public void testFactorialGivenRightArg1ReturnsWell() {
        n = 1;
        actual = 1;
        assertEquals(actual, MathUtility.getFactorial(n));
    }
    
    //Test case #3: check/test getF() with n = 5
    //Input n= 5
    //step/procedure (buoc test)
    //call method getFactorial (n)
    // Expected Result: 1 ( hy vong 5!=120)
    //Actual Result: ? cho chay ham moi biet
    // Status: passed | failed
    @Test //framework ép ta phải viết code theo 1 quy tắc nào đó
    //framework là thư viện, nhưng thư viện không hẳn là framework
    public void testFactorialGivenRightArg5ReturnsWell() {
        n = 5;
        actual = 120 ;
        assertEquals(actual, MathUtility.getFactorial(n));
    }
    
    @Test
    public void testFactorialGivenRightArg12345ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    
    //Thấy ngoại lệ mừng rơi nước mắt
    // Test case 5: check getF() with n = -1, the method throw Exception
    @Test
    public void testFactorialGivenWrongArg_1ThrowsException () {
        //MathUtility.getFactorial(-1);
        assertThrows(IllegalArgumentException.class, 
                () -> {MathUtility.getFactorial(-1);});
    }
    

}
