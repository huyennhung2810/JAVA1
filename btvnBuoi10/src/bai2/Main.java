/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author han99
 */
public class Main {
     public static void main(String[] args) {
        Nguoi nguoi = new Nguoi("Ha Thi Huyen Nhung", 18, "Ninh Binh");
        nguoi.InThongTin();

        DongVat dv = new DongVat("PH11", "con meo", 3, 13);
        dv.InThongTin();

        ThucVat tv = new ThucVat("PH12", "cay xoai", 23, 6, "Ninh Binh");
        tv.Display();

        LopHoc lh = new LopHoc("SD20201", "P", "Kieu Mai", 30);
        lh.InThongTin();

        MayTinh mt = new MayTinh("M02", "MSI", "Windows", 23.5f);
        mt.InThongTin();

        DienThoai dt = new DienThoai("androi", "redmi", "AD", 9.5f, 120);
        dt.InTongTin();

        GiangVien gv = new GiangVien("HangNT169", "Nguyen Thi hang", "Ha Noi", 45, 156, 3);
        gv.InThongTin();

        CayCoi cc = new CayCoi("Cx12", "cay xoai", "Ninh Binh", 1.3f);
        cc.InThongTin();

        XeMay xm = new XeMay("lead", "lead 2022", "lead", 45.5f, "black");
        xm.InThongTin();

        ToaHoc th = new ToaHoc("P", "toa P", "Kieu Mai");
        th.InThongTin();

    }
}
