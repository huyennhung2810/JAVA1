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
public class bai6Buoi3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Nhap nam sinh
        System.out.print("moi nhap nam sinh cua ban: ");
        int nam = Integer.parseInt(scan.nextLine());
        
        System.out.println("tuoi cua ban la: " + (2024-nam));
        
        scan.close();
    }
}
