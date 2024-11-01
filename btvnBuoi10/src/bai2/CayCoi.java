/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author han99
 */
public class CayCoi {
     private String ma;
    private String ten;
    private String khuVucSong;
    private float gia;

    public CayCoi() {
    }

    public CayCoi(String ma, String ten, String khuVucSong, float gia) {
        this.ma = ma;
        this.ten = ten;
        this.khuVucSong = khuVucSong;
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

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public void InThongTin() {
        System.out.println("ma cay la: " + ma);
        System.out.println("ten cay la: " + ten);
        System.out.println("khu vuc cay song la: " + khuVucSong);
        System.out.println("gia cua cay la: " + gia + " trieu dong");
    }
}
