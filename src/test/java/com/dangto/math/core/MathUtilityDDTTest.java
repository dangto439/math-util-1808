/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dangto.math.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author DANG TO
 */
public class MathUtilityDDTTest {
    
    //chuẩn bị bộ data đưa vào hàm getFactorial()
    //chuẩn bị bộ data kết quả trả về của hàm
    //0! => 1; 1! => 1; 2! = 2 => 3! => 6 , .....
    // {0, 1} ; {1, 1}; {2, 2}; {3, 6}; {4, 24}; {5, 120} , ...
    
    
    public static Object[][] initData () {
        
        
        return new Object[][]
        {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgReturnsWell (int n, long expected) {
            assertEquals(expected, MathUtility.getFactorial(n));
}
    
}
