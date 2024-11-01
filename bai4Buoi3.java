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
public class bai4Buoi3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //So nguyen 1
        System.out.println("Nhap so nguyen 1 : ");
        int soNguyen1 = scan.nextInt();
        
        //So nguyen 2
        System.out.println("Nhap so nguyen 2 : ");
        int soNguyen2 = scan.nextInt();
        
        //Tinh tong , hieu , tich , thuong
        int tong = soNguyen1 + soNguyen2;
        int hieu = soNguyen1 - soNguyen2;
        int tich = soNguyen1 * soNguyen2;
        float thuong = (float)soNguyen1 / soNguyen2;
        
        //In ra man hinh
        System.out.println("Tong la : " + tong);
        System.out.println("Hieu la : " + hieu);
        System.out.println("Tich la : " + tich);
        System.out.println("Thuong la : " + thuong);
    }
}
