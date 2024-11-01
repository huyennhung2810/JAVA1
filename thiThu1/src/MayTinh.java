/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author han99
 */
public class MayTinh {

    public MayTinh() {

    }

    private String ma;
    private String ten;
    private String hang;
    private int boNho;
    private float gia;
    private boolean trangThai;

    public MayTinh(String ma, String ten, String hang, int boNho, float gia, boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.boNho = boNho;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getHang() {
        return hang;
    }

    public int getBoNho() {
        return boNho;
    }

    public float getGia() {
        return gia;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setBoNho(int boNho) {
        this.boNho = boNho;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void inThongTin() {
        System.out.println("Ma:" + ma + " Ten:" + ten + " Hang:" + hang + " Bo nho: " + boNho + " Gia: " + gia + " Trang thai: " + trangThai);
    }
}
