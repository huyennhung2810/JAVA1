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
public class bai5Buoi3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Nhap diem toan
        System.out.println("Nhap diem toan : ");
        float toan = scan.nextFloat();
        
        //Nhap diem ly
        System.out.println("Nhap diem ly : ");
        float ly = scan.nextFloat();
        
        //Nhap diem hoa
        System.out.println("Nhap diem hoa : ");
        float hoa = scan.nextFloat();
        
        //Tinh diem tb
        float diemTB = (toan + ly + hoa)/3;
        
        //In ra mh
        System.out.println("Diem trung binh : " + diemTB);
    }
}
