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
public class bai2Buoi3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Nhap ten
        System.out.println("Nhap ten : ");
        String ten = scan.nextLine();
        
        //Nhap tuoi
        System.out.println("Nhap tuoi : ");
        int tuoi = scan.nextInt();
        
        //Nhap dia chi
        System.out.println("Nhap dia chi : ");
        String diaChi = scan.nextLine();
        
        scan.nextLine();
        //Nhap gioi tinh
        System.out.println("Nhap gioi tinh : ");
        String gioiTinh = scan.nextLine();
        
        //Nhap ky hoc
        System.out.println("Nhap ky hoc : ");
        int kyHoc = scan.nextInt();
        
        scan.nextLine();
        //Nhap que quan
        System.out.println("Nhap que quan : ");
        String queQuan = scan.nextLine();
        
        
        System.out.println("Ten la : " + ten);
        System.out.println("Tuoi la : " + tuoi);
        System.out.println("Dia chi : " + diaChi);
        System.out.println("Gioi tinh : " + gioiTinh);
        System.out.println("Ky hoc : " + kyHoc);
        System.out.println("Que quan : " + queQuan);
    }
}
