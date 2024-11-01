
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
        DongVatService service = new DongVatService(new ArrayList<>());
        int chon;

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Chuc nang 1.");
            System.out.println("2. Chuc nang 2.");
            System.out.println("3. Chuc nang 3.");
            System.out.println("4. Thoat chuong trinh.");
            System.out.println("5. Dong Vat Meo.");
            System.out.println("Moi chon chuc nang: ");

            chon = Integer.valueOf(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.println("Chuc nang 1");
                    service.nhapThongTin();
                    break;
                case 2:
                    System.out.println("Chuc nang 2");
                    service.xuatDanhSach();
                    break;
                case 3:
                    System.out.println("Chuc nang 3");
                    System.out.println("Moi chon can nang toi thieu: ");
                    int canNangToiThieu = Integer.valueOf(sc.nextLine());
                    service.timKiemTheoKhoangCanNang(canNangToiThieu);
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    break;
                case 5:
                    System.out.println("Chuc nang 5: Dong vat meo");
                    Meo meo = new Meo("Meo...meo..", "DV01", "Meo anh long dai", 07, "Trong nha");
                    meo.inThongTin();
                    break;
                default:
                    System.out.println("Chuc nang khong hop le.");
            }
        }
    }
}
