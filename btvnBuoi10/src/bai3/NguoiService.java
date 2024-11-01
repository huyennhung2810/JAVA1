/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author han99
 */
public class NguoiService {
    private ArrayList<Nguoi> danhSach = new ArrayList<>();
   
    private Scanner sc = new Scanner(System.in);
    public void fake() {
        danhSach.add(new Nguoi("Tai", 27, 1, "Ha Noi", "Sinh vien"));
        danhSach.add(new Nguoi("Nhi", 21, 1, "Vinh Phuc", "Sinh vien"));
        danhSach.add(new Nguoi("Trang", 23, 0, "Quang Ninh", "Sinh vien"));
        danhSach.add(new Nguoi("Khanh", 21, 1, "Hai Duong", "Sinh vien"));
        danhSach.add(new Nguoi("Hieu", 23, 1, "Thanh Hoa", "Sinh vien"));
        danhSach.add(new Nguoi("Tuan", 21, 1, "Thai Binh", "Sinh vien"));
    }

    //1. nhap thong tin
    public void NhapNguoi() {
        while (true) {
            Nguoi nguoi = new Nguoi();
            nguoi.them();
            danhSach.add(nguoi);
            String tl;
            System.out.print("ban co muon nhap tiep khong (Y/N)?: ");
            tl = sc.nextLine();
            if (tl.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    //2. In thong tin
    public void InThongTin() {
        for (Nguoi ng : danhSach) {
            ng.InThongTin();
        }
    }

    //3. Liet ke nguoi co gioi tinh nu
    public void lietKeNu() {
        for (Nguoi ng : danhSach) {
            if (ng.getGioiTinh() == 0) {
                ng.InThongTin();
            }
        }
    }

    //4.Liet ke Nguoi co tuoi trong khoang min max nhap tu ban phim.
    public void LietKeTuoi() {

        System.out.println("Moi nhap khoang tuoi");
        System.out.print("tuoi min la: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.print("tuoi max la: ");
        int max = Integer.parseInt(sc.nextLine());

        for (Nguoi ng : danhSach) {
            if (ng.getTuoi() >= min && ng.getTuoi() <= max) {
                ng.InThongTin();
            }
        }
    }

    //5. Sap xep tang dan theo tuoi
//    public void SapXepTuoi(){
//        for(Nguoi ng : danhSach){
//            ng = danhSach.sort(ng.getTuoi());
//            ng.InThongTin();
//        }
//    }
    //6. Xoa nguoi voi vi tri  nhap tu ban phim.
    public void XoaNguoi() {
        int viTri;
        while (true) {
            System.out.print("Nhap vi tri muon xoa: ");
            viTri = Integer.parseInt(sc.nextLine());

            if (viTri >= 0 && viTri <= danhSach.size()) {
                danhSach.remove(viTri);
            } else {
                System.out.println("Vi tri xoa khong hop le!");
            }
            System.out.println("DANH SACH MOI LA: \n");
            for (Nguoi x : danhSach) {
                x.InThongTin();
            }
            System.out.println("Ban co muon tiep tuc xoa(Y/N)?: ");
            String tl = sc.nextLine();
            if (tl.equalsIgnoreCase("N")) {
                break;
            }

        }
    }

    //7. Sap xep giam dan theo ten nguoi
    public void SapXepTen() {

    }
}
