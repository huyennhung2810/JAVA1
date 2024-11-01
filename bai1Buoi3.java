/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvnbuoi3;

import java.util.Scanner;

/**
 *
 * @author han99
 */
public class bai1Buoi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       //Nhap MSSV
        System.out.println("Moi nhap mssv :");
        String maSo = scan.nextLine();
        
        //Nhap ten
        System.out.println("Moi nhap ten :");
        String ten = scan.nextLine();
       
        //QUe quan
        System.out.println("Moi nhap que quan : ");
        String queQuan = scan.nextLine();
                
        //in ra man hinh
        System.out.println("Thong tin ca nhan cua ban :");
        System.out.println("MSSV la : " + maSo);
        System.out.println("Ten la : " + ten);
        System.out.println("Que quan : " + queQuan);
    }
    
}
