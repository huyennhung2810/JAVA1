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
public class bai2Buoi2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Diem toan
        System.out.println("Moi nhap diem toan:");
        String diemToan = scan.nextLine();
        
        //Diem ly
        System.out.println("Moi nhap diem ly:");
        String diemLy = scan.nextLine();
        
        //Diem hoa
        System.out.println("Moi nhap diem hoa:");
        String diemHoa = scan.nextLine();
        
        
        //in ra man hinh
        System.out.println("Diem Toan, Ly, Hoa cua ban:");
        System.out.println("Diem Toan: " + diemToan);
        System.out.println("Diem Ly: " + diemLy);
        System.out.println("Diem Hoa: " + diemHoa);
     }
}
