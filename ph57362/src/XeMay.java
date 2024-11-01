/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author han99
 */
public class XeMay extends PhuongTien{
    public XeMay(){
        
    }
    
    private String hang;
    private String mauSac;

    public XeMay(String hang, String mauSac, String ma, String ten, float gia) {
        super(ma, ten, gia);
        this.hang = hang;
        this.mauSac = mauSac;
    }

    public String getHang() {
        return hang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public void inXeMay(){
        System.out.println("Hang: " + hang);
        System.out.println("Mau sac: " + mauSac);
    }
}
