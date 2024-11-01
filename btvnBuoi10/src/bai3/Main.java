/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author han99
 */
public class Main {
     public static void main(String[] args) {

        NguoiService ns = new NguoiService();
         Scanner sc = new Scanner(System.in);

        int menu;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Nhap thong tin Nguoi");
            System.out.println("2. In thong tin ra man hinh");
            System.out.println("3. Liet ke tat ca Nguoi co gioi tinh la Nu");
            System.out.println("4. Liet ke tat ca Nguoi co tuoi trong khoang min, max");
            System.out.println("5. Sap xep tang dan theo tuoi cua nguoi");
            System.out.println("6. Xoa nguoi voi vi tri nhap tu ban phim");
            System.out.println("7. Sap xep giam dan theo ten cua nguoi");
            System.out.println("11. fake danh sach");
            System.out.println("0. Thoat");
            System.out.println("-----------------");

            System.out.print("Chon chuc nang: ");
            menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 0 -> {
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0);
                }
                
                case 1 ->{
                    ns.NhapNguoi();
                }
                
                case 2->{
                    ns.InThongTin();
                }
                
                case 3 ->{
                    ns.lietKeNu();
                }
                
                case 4->{
                    ns.LietKeTuoi();
                }
                
                case 5 ->{
                    System.out.println("Dang cap nhat");
                }
                
                case 6->{
                    ns.XoaNguoi();
                }
                
                case 7 -> {
                    System.out.println("Dang cap nhat");
                }
                case 11->{
                    ns.fake();
                }

                default ->
                    System.out.println("Lua chon khong hop le.");
            }
        } while (true);

    }
}
