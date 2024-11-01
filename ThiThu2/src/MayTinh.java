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

    private String maMayTinh;
    private String tenMayTinh;
    private int trongLuong;
    private String noiBan;

    public MayTinh(String maMayTinh, String tenMayTinh, int trongLuong, String noiBan) {
        this.maMayTinh = maMayTinh;
        this.tenMayTinh = tenMayTinh;
        this.trongLuong = trongLuong;
        this.noiBan = noiBan;
    }

    public String getMaMayTinh() {
        return maMayTinh;
    }

    public String getTenMayTinh() {
        return tenMayTinh;
    }

    public int getTrongLuong() {
        return trongLuong;
    }

    public String getNoiBan() {
        return noiBan;
    }

    public void setMaMayTinh(String maMayTinh) {
        this.maMayTinh = maMayTinh;
    }

    public void setTenMayTinh(String tenMayTinh) {
        this.tenMayTinh = tenMayTinh;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }

    public void setNoiBan(String noiBan) {
        this.noiBan = noiBan;
    }

    public void inThongTin() {
        System.out.println("Ma: " + maMayTinh + " Ten: " + tenMayTinh + " Trong luong: " + trongLuong + " Noi ban: " + noiBan);
    }
}
