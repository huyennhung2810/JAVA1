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
public class bai7Buoi3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Thang hien tai
        System.out.print("hien tai la thang: ");
        int thang = Integer.parseInt(scan.nextLine());

        //quy thang
        if (thang > 0 && thang <= 4) {
            System.out.println("thang hien tai thuoc quy 1");
        } else if (thang > 4 && thang <= 8) {
            System.out.println("thang hien tai thuoc quy 2");
        } else if (thang > 8 && thang <= 12) {
            System.out.println("thang hien tai thuoc quy 3");
        } else {
            System.out.println("khong ton tai thang nay!!!");

        }

        scan.close();
    }
}
