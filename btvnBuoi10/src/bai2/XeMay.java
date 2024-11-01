/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author han99
 */
public class XeMay {
       private String ma;
    private String ten;
    private String dongMay;
    private float gia;
    private String mauSac;

    public XeMay() {
    }

    public XeMay(String ma, String ten, String dongMay, float gia, String mauSac) {
        this.ma = ma;
        this.ten = ten;
        this.dongMay = dongMay;
        this.gia = gia;
        this.mauSac = mauSac;
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

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public void InThongTin() {
        System.out.println("ma xe may la: " + ma);
        System.out.println("ten cua xe may la: " + ten);
        System.out.println("dong cua xe may la: " + dongMay);
        System.out.println("gia cua xe may la: " + gia + " trieu dong");
        System.out.println("mau sac cua xe may la: " + mauSac);
    }
}
