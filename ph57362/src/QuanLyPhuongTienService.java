
import java.util.Scanner;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author han99
 */
public class QuanLyPhuongTienService {

    private ArrayList<PhuongTien> listPhuongTien;

    public QuanLyPhuongTienService(ArrayList<PhuongTien> listPhuongTien) {
        this.listPhuongTien = listPhuongTien;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Moi nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Moi nhap gia: ");
        float gia = Float.parseFloat(sc.nextLine());
        PhuongTien pt = new PhuongTien(ma, ten, gia);
        listPhuongTien.add(pt);
    }

    public void xuatThongTin() {
        for (PhuongTien pt : listPhuongTien) {
            pt.inThongTin();
        }
    }

    public void dsXeGiaLonHon100000() {

    }

    public void sxGiamDanTheoTen() {
        listPhuongTien.sort((o1, o2) -> {
            return o2.getTen().compareTo(o1.getTen());
        });
    }

    public void xoaTheoKhoang(float min, float max) {
        for (PhuongTien pt : listPhuongTien) {
            if (pt.getGia() >= min && pt.getGia() <= max) {
                listPhuongTien.remove(pt.getGia());
            }
        }
    }

    public void hienThiPTCoGiaCaoThu2() {
        for (PhuongTien pt : listPhuongTien) {
            
        }
    }

}
