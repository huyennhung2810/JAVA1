
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
public class MayTinhService {

    private ArrayList<MayTinh> ListMayTinh;

    public MayTinhService(ArrayList<MayTinh> ListMayTinh) {
        this.ListMayTinh = ListMayTinh;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma may tinh: ");
        String maMayTinh = sc.nextLine();
        System.out.println("Nhap ten may tinh: ");
        String tenMayTinh = sc.nextLine();
        int trongLuong;
        do {
            System.out.println("Moi nhap trong luong: ");
            trongLuong = Integer.valueOf(sc.nextLine());
            if (trongLuong <= 0) {
                System.out.println("Trong luong phai > 0, Moi nhap lai: ");
            }
        } while (trongLuong <= 0);

        System.out.println("Moi nhap noi ban: ");
        String noiBan = sc.nextLine();

        MayTinh mt = new MayTinh(maMayTinh, tenMayTinh, trongLuong, noiBan);
        ListMayTinh.add(mt);
    }

    public void dsMayTinh() {
        for (MayTinh mt : ListMayTinh) {
            mt.inThongTin();
        }
    }

    public void dsTangDanTheoTrongLuong() {
        ListMayTinh.sort((o1, o2) -> {
            return o1.getTrongLuong() - o2.getTrongLuong();
        });
    }

    public void timKiemTheoTenMT(String tenCanTim) {
        for (MayTinh mt : ListMayTinh) {
            if (mt.getTenMayTinh().contains(tenCanTim)) {
                mt.inThongTin();
            }
        }
    }
}
