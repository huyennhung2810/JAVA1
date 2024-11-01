
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
        DongHoService service = new DongHoService(new ArrayList<>());
        int chon;
        while (true) {
            System.out.println("-----------------------");
            System.out.println("|1. Chuc nang 1        |");
            System.out.println("|2. Chuc nang 2        |");
            System.out.println("|3. Chuc nang 3        |");
            System.out.println("|4. Chuc nang 4        |");
            System.out.println("|5. Chuc nang 5        |");
            System.out.println("|6. Chuc nang 6        |");
            System.out.println("|7. Chuc nang 7        |");
            System.out.println("|0. Chuc nang 0        |");
            System.out.println("-----------------------");
            System.out.println("Moi ban chon chuc nang: ");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1 -> {
                    System.out.println("Chuc nang 1:");
                    service.nhapThongTin();
                }
                case 2 -> {
                    System.out.println("Chuc nang 2:");
                    service.inDanhSachDongHo();
                    break;
                }
                case 3 -> {
                    System.out.println("Chuc nang 3:");
                     System.out.print("Nhap gia toi thieu: ");
                    int giaMin = sc.nextInt();
                    System.out.print("Nhap gia toi da: ");
                    int giaMax = sc.nextInt();
                    service.timKiemDongHoTheoGia(giaMin, giaMax);
                    break;
                }
                case 4 -> {
                    System.out.println("Chuc nang 4:");
                    System.out.print("Nhap ma dong ho can xoa: ");
                    int maDongHo = sc.nextInt();
                    service.xoaDongHoTheoMa(maDongHo);
                    break;
                }
                case 5 -> {
                    System.out.println("Chuc nang 5:");
                    service.sapXepTheoKichThuocTangDan();
                   service.inDanhSachDongHo();
                    break;
                }
                case 6 -> {
                    System.out.println("Chuc nang 6:");
                    service.sapXepTheoKichThuocGiamDan();
                    service.inDanhSachDongHo();
                    break;
                }
                case 7 -> {
                    System.out.println("Chuc nang 7:");
                    service.lietKeTop3DatNhat();
                    break;
                }
                case 0 -> {
                    System.out.println("Thoat");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Chuc nang khong ton tai.");
                    break;
                }
            }

        }
    }
}
