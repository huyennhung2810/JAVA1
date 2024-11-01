/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author han99
 */
public class LopHoc {
    
    private String ten;
    private String toa;
    private String diaChi;
    private int dienTich;

    public LopHoc() {
    }

//    public LopHoc(String ten, String toa, String diaChi, int dienTich) {
//        this.ten = ten;
//        this.toa = toa;
//        this.diaChi = diaChi;
//        this.dienTich = dienTich;
//    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getToa() {
        return toa;
    }

    public void setToa(String toa) {
        this.toa = toa;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public void InThongTin() {
        System.out.println("ten lop hoc la: " + ten);
        System.out.println("toa nha la: " + toa);
        System.out.println("dia chi lop hoc la: " + diaChi);
        System.out.println("dien tich lop hoc: " + dienTich);
    }
}
