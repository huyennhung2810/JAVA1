/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author han99
 */
public class MayTinhMSI extends MayTinh{
    public MayTinhMSI(){
        
    }
    private String moTa;

    public MayTinhMSI(String moTa) {
        this.moTa = moTa;
    }

    public MayTinhMSI(String moTa, String ma, String ten, String hang, int boNho, float gia, boolean trangThai) {
        super(ma, ten, hang, boNho, gia, trangThai);
        this.moTa = moTa;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Mo ta: " + moTa);
    }
}
