/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author han99
 */
public class Nguoi {
     private String ten;
    private int tuoi;
    private String diaChi;

    public Nguoi() {
    }
    

//    public Nguoi(String ten, int tuoi, String diaChi) {
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.diaChi = diaChi;
//    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi > 0) {
            this.tuoi = tuoi;
        } else {
            System.out.println("Tuổi không hợp lệ");
        }
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void InThongTin() {
        System.out.println("ten cua ban la: " + ten);
        System.out.println("ban : " + tuoi + " tuoi");
        System.out.println("ban song o: " + diaChi);
    }

}
