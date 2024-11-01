/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author han99
 */
public class GiangVien {
     private String ma;
    private String ten;
    private String diaChi;
    private float canNang;
    private double chieuCao;
    private int bac;

    public GiangVien() {
    }

//    public GiangVien(String ma, String ten, String diaChi, float canNang, double chieuCao, int bac) {
//        this.ma = ma;
//        this.ten = ten;
//        this.diaChi = diaChi;
//        this.canNang = canNang;
//        this.chieuCao = chieuCao;
//        this.bac = bac;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public void InThongTin() {
        System.out.println("ma giang vien la: " + ma);
        System.out.println("ten cua giang vien la: " + ten);
        System.out.println("dia chi cua giang vien la: " + diaChi);
        System.out.println("can nang cua giang vien la: " + canNang + " Kg");
        System.out.println("chieu cao cua giang vien la: " + chieuCao + " cm");
        System.out.println("bac cua giang vien: " + bac);
    }
}
