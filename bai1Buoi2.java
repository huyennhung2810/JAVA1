/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnBuoi2;

import java.util.Scanner;

/**
 *
 * @author han99
 */
public class bai1Buoi2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Nhap ten
        System.out.println("Moi nhap ten:");
        String ten = scan.nextLine();
        
        //Nhap dia chi
        System.out.println("Moi nhap dia chi:");
        String diaChi = scan.nextLine();
       
        //Nganh hoc
        System.out.println("Moi nhap nganh hoc: ");
        String nganhHoc = scan.nextLine();
                
        //in ra man hinh
        System.out.println("Thong tin ca nhan cua ban:");
        System.out.println("Ten la: " + ten);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Nganh hoc: " + nganhHoc);
    }
}
