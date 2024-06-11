/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dangto.math.core;

/**
 *
 * @author DANG TO
 */
public class MathUtility {
//Quy đặc tên package trong Java
//- Chữ thường toàn tập
//- ghi tên miền công ty đảo ngược
//com.tên-cty.tên-dự-án.tên-module-nhóm-chức-năng
//com.microsoft.sqlserver.jdbc. Tên Class import vào để dùng
//đây là kĩ thuật giúp code của nhiều dự án trong 1 cty có thể
//ở chung folder mà không bị lẫn lộn
//giúp thư viện của các cty 

    public static long getFactorial(int n) {
        long product = 1; //tích - kết quả phép nhân
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * getFactorial(n - 1);
    }
    
}
