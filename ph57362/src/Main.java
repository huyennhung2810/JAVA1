
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author han99
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyPhuongTienService pt = new QuanLyPhuongTienService(new ArrayList<>());
        int chon;

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Chuc nang 1.");
            System.out.println("2. Chuc nang 2.");
            System.out.println("3. Chuc nang 3.");
            System.out.println("4. Chuc nang 4.");
            System.out.println("5. Chuc nang 5.");
            System.out.println("6. Chuc nang 6.");
            System.out.println("0. Thoat");
            System.out.println("Moi chon chuc nang: ");
            chon = Integer.valueOf(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.println("Day la chuc nang 1: ");
                    pt.nhapThongTin();
                    break;
                case 2:
                    System.out.println("Day la chuc nang 2: ");
                    pt.xuatThongTin();
                    break;
                case 3:
                    System.out.println("Day la chuc nang 3: ");
                    pt.dsXeGiaLonHon100000();
                    break;
                case 4:
                    System.out.println("Day la chuc nang 4: ");
                    pt.sxGiamDanTheoTen();
                    break;
                case 5:
                    System.out.println("Day la chuc nang 5: ");

                    break;
                case 6:
                    System.out.println("Day la chuc nang 6: ");
                    break;
                case 7:
                    System.out.println("Day la chuc nang 6: ");
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Chuc nang khong ton tai.");
                    break;
            }
        }
    }
}
