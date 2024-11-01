/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author han99
 */
public class Laptop extends MayTinh {

    public Laptop() {
    }
    private String hang;

    public Laptop(String hang) {
        this.hang = hang;
    }

    public Laptop(String hang, String maMayTinh, String tenMayTinh, int trongLuong, String noiBan) {
        super(maMayTinh, tenMayTinh, trongLuong, noiBan);
        this.hang = hang;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Hang: " + hang);
    }
}
