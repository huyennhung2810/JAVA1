/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author han99
 */
public class Main {
    public static void main(String[] args) {
        Nguoi nguoi = new Nguoi();
        DongVat dv = new DongVat();
        ThucVat tv = new ThucVat();
        LopHoc lh = new LopHoc();
        MayTinh mt = new MayTinh();
        DienThoai dt = new DienThoai();
        GiangVien gv = new GiangVien();
        CayCoi cc = new CayCoi();
        XeMay xm = new XeMay();
        ToaHoc th = new ToaHoc();

        nguoi.setTen("Ha Thi Huyen Nhung");
        nguoi.setTuoi(18);
        nguoi.setDiaChi("Ninh Binh ");
        
        dv.setTen("con meo");
        dv.setMaDV("PH11");
        dv.setTuoi(3);
        dv.setCanNang(13);
        
        tv.setMaTV("PH12");
        tv.setTen("cay xoai");
        tv.setChieuCao(23);
        tv.setTuoi(06);
        tv.setKhuVucSong("Ninh Binh");
        
        lh.setDiaChi("Kieu Mai");
        lh.setDienTich(30);
        lh.setTen("SD20201");
        lh.setToa("P");
        
        mt.setDongMay("Windows");
        mt.setGia(23.5f);
        mt.setMa("M02");
        mt.setTen("MSI");
        
        dt.setDongMay("androi");
        dt.setDungLuong(120);
        dt.setGia(9.5f);
        dt.setMa("AD");
        dt.setTen("redmi");
        
        gv.setBac(3);
        gv.setCanNang(45);
        gv.setChieuCao(156);
        gv.setDiaChi("Ha Noi");
        gv.setMa("HangNT169");
        gv.setTen("Nguyen Thi Hang");
        
        cc.setGia(1.3f);
        cc.setKhuVucSong("Ninh Binh");
        cc.setMa("Cx12");
        cc.setTen("cay xoai");
        
        xm.setDongMay("lead");
        xm.setGia(45.5f);
        xm.setMa("le12");
        xm.setMauSac("black");
        xm.setTen("lead 2022");
        
        th.setKhuVuc("Kieu Mai");
        th.setMa("P");
        th.setTen("toa P");
        
        nguoi.InThongTin();
        dv.InThongTin();
        tv.Display();
        lh.InThongTin();
        mt.InThongTin();
        dt.InTongTin();
        gv.InThongTin();
        cc.InThongTin();
        xm.InThongTin();
        th.InThongTin();
    }
}
