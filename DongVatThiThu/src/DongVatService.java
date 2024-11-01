
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
public class DongVatService {

    private ArrayList<DongVat> ListDongVat;

    public DongVatService(ArrayList<DongVat> ListDongVat) {
        this.ListDongVat = ListDongVat;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma dong vat: ");
        String maDongVat = sc.nextLine();
        System.out.println("Moi nhap ten dong vat: ");
        String tenDongVat = sc.nextLine();
         int canNang;
        do {
            System.out.println("Nhap Can nang (> 0): ");
            canNang = Integer.valueOf(sc.nextLine());
            if (canNang <= 0) {
                System.out.println("Can nang phai lon hon 0. Vui long chon lai.");
            }
        } while (canNang <= 0);
        System.out.println("Moi nhap noi song dong vat: ");
        String noiSong = sc.nextLine();

        DongVat dv = new DongVat(maDongVat, tenDongVat, canNang, noiSong);
        ListDongVat.add(dv);
    }

    public void xuatDanhSach() {
        for (DongVat dv : ListDongVat) {
            dv.inThongTin();
        }
    }

    public void timKiemTheoKhoangCanNang(int canNangToiThieu) {
        for (DongVat dv : ListDongVat) {
            if (dv.getCanNang() >= canNangToiThieu) {
                dv.inThongTin();
            } else {
                System.out.println("Khong có can nang nao lon hon can nang toi thieu.");
            }

        }
    }
}
