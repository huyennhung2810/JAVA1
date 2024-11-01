/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author han99
 */
public class ToaHoc {
     private String ma;
    private String ten;
    private String khuVuc;

    public ToaHoc() {
    }

//    public ToaHoc(String ma, String ten, String khuVuc) {
//        this.ma = ma;
//        this.ten = ten;
//        this.khuVuc = khuVuc;
//    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    public void InThongTin() {
        System.out.println("ma toa hoc la: " + ma);
        System.out.println("ten toa hoc la: " + ten);
        System.out.println("khu vua toa hoc la: " + khuVuc);
    }
}
