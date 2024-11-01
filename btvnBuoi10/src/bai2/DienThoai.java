/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author han99
 */
public class DienThoai {
    private String ma;
    private String ten;
    private String dongMay;
    private float gia;
    private int dungLuong;

    public DienThoai() {
    }

    public DienThoai(String ma, String ten, String dongMay, float gia, int dungLuong) {
        this.ma = ma;
        this.ten = ten;
        this.dongMay = dongMay;
        this.gia = gia;
        this.dungLuong = dungLuong;
    }

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

    public String getDongMay() {
        return dongMay;
    }

    public void setDongMay(String dongMay) {
        this.dongMay = dongMay;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public void InTongTin() {
        System.out.println("ma dien thoai la: " + ma);
        System.out.println("ten dien thoai la: " + ten);
        System.out.println("dong may la: " + dongMay);
        System.out.println("gia cua may dien thoai la: " + gia + " trieu dong");
        System.out.println("dung luong may la: " + dungLuong + " Gb");
    }
}
