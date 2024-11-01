
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author han99
 */
public class QLMayTinh {

    private ArrayList<MayTinh> ListMayTinh;

    public QLMayTinh(ArrayList<MayTinh> ListMayTinh) {
        this.ListMayTinh = ListMayTinh;
    }

    public void themMayTinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Moi nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Moi nhap hang: ");
        String hang = sc.nextLine();
        System.out.println("Moi nhap bo nho: ");
        int boNho = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap gia: ");
        float gia = Float.parseFloat(sc.nextLine());
        System.out.println("Moi nhap trang thai(true: Dang kinh doanh, false: Ngung kinh doanh) :  ");
        boolean trangThai = sc.nextBoolean();

        System.out.println("Ban co muon them tiep khong? (Y/N): ");

        MayTinh mt = new MayTinh(ma, ten, hang, boNho, gia, trangThai);
        ListMayTinh.add(mt);

    }

    public void dsMayTinh() {
        for (MayTinh mt : ListMayTinh) {
            mt.inThongTin();
        }
    }

    public void timKiemTenBDChuA() {
        for (MayTinh mt : ListMayTinh) {
            if (mt.getTen().toLowerCase().startsWith("a")) {
                mt.inThongTin();
            }
        }
    }

    public void dsOViTriLe() {
        for (int i = 0; i < ListMayTinh.size(); i++) {
            if (i % 2 == 0) {
                ListMayTinh.get(i).inThongTin();
            }
        }
    }

    public void sxTangDanTheoGia() {

    }

    public void sxGiamTheoBoNho() {
        ListMayTinh.sort((o1, o2) -> {
            return o2.getBoNho() - o1.getBoNho();
        });
    }

    public void giaNhapTrongKhoang(float min, float max) {
        for (MayTinh mt : ListMayTinh) {
            if (mt.getGia() > min && mt.getGia() < max) {
                System.out.println("Gia nhap trong khoang la: ");
                mt.inThongTin();
            }
        }
    }

    public void tenKetThucChuE() {
        for (MayTinh mt : ListMayTinh) {
            if (mt.getTen().toLowerCase().endsWith("e")) {
                mt.inThongTin();
            }
        }
    }

    public void trongTenChuaChuA() {
        for (MayTinh mt : ListMayTinh) {
            if (mt.getTen().toLowerCase().contains("a")) {
                mt.inThongTin();
            }
        }
    }

    public MayTinh timKiemTheoMaNhapTuBanPhim(String maCanTim) {
        for (MayTinh mt : ListMayTinh) {
            if (mt.getMa().equalsIgnoreCase(maCanTim)) {
                return mt;
            }
        }
        return null;
    }

    public void xoaTheoMaNhapTuBanPhim(String maCanXoa) {
        ListMayTinh.removeIf(s -> s.getMa() == maCanXoa);
    }

    public void viTriCoGiaCaoNhat() {
        if (!ListMayTinh.isEmpty()) {
            MayTinh maxGia = Collections.max(ListMayTinh, Comparator.comparingDouble(MayTinh::getGia));
            System.out.println("may tinh co gia cao nhat:");
            maxGia.inThongTin();
        }
    }

    public void dsTrangThaiDangKinhDoanh() {
        for (MayTinh mt : ListMayTinh) {
            if (mt.isTrangThai() == true) {
                mt.inThongTin();
            }
        }
    }

    public void dsTrangThaiNgungKinhDoanh() {
        for (MayTinh mt : ListMayTinh) {
            if (mt.isTrangThai() == false) {
                mt.inThongTin();
            }
        }
    }

    public void dsTheoHang(String hang) {
        for (MayTinh mt : ListMayTinh) {
            if (mt.getHang().equalsIgnoreCase(hang)) {
                mt.inThongTin();
            }
        }
    }
}
