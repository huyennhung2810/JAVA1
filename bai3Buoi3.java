/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnbuoi3;

import java.util.Scanner;

/**
 *
 * @author han99
 */
public class bai3Buoi3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //So nguyen 1
        System.out.println("Nhap so nguyen thu nhat : ");
        int soNguyen1 = scan.nextInt();
        
        //So nguyen 2
        System.out.println("Nhap so nguyen thu hai : ");
        int soNguyen2 = scan.nextInt();
        
        //Tim max
        int max = Math.max(soNguyen1, soNguyen2);
        
        //in ra man hinh
        System.out.println("So lon nhat la : " + max);
    }
}
