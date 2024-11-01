/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author han99
 */
public class Nguoi {
    private String ten;
    private int tuoi;
    private int gioiTinh;
    private String queQuan;
    private String ngheNghiep;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, int gioiTinh, String queQuan, String ngheNghiep) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngheNghiep = ngheNghiep;
    }

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
        this.tuoi = tuoi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", queQuan=" + queQuan + ", ngheNghiep=" + ngheNghiep + '}';
    }
    public void them(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap thong tin nguoi!");
        System.out.print("Moi nhap ten: ");
        this.ten = sc.nextLine();
        System.out.print("Moi nhap tuoi: ");
        this.tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Moi nhap gioi tinh: ");
        this.gioiTinh = Integer.parseInt(sc.nextLine());
        System.out.print("Moi nhap que quan: ");
        this.queQuan = sc.nextLine();
        System.out.print("Moi nhap nghe nghiep: ");
        this.ngheNghiep = sc.nextLine();
        
    }

    public void InThongTin() {
        System.out.println("Ten ban la: " + ten);
        System.out.println("nam nay ban: " + tuoi + " tuoi");

        if (gioiTinh == 0) {
            System.out.println("Gioi tinh cua ban la: Nu");
        } else if (gioiTinh == 1) {
            System.out.println("Gioi tinh cua ban la: Nam");
        }
        
        System.out.println("que quan cua ban la: " + queQuan);
        System.out.println("Nghe nghiep cua ban la: " + ngheNghiep + "\n");
    }
}
