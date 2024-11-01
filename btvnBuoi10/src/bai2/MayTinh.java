/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author han99
 */
public class MayTinh {
     private String ma;
    private String ten;
    private String dongMay;
    private float gia;

    public MayTinh() {
    }

    public MayTinh(String ma, String ten, String dongMay, float gia) {
        this.ma = ma;
        this.ten = ten;
        this.dongMay = dongMay;
        this.gia = gia;
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

    public void InThongTin() {
        System.out.println("ma may tinh la: " + ma);
        System.out.println("ten may tinh la: " + ten);
        System.out.println("dong may: " + dongMay);
        System.out.println("gia tien la: " + gia + " trieu dong");
    }
}
