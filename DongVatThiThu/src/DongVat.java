/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author han99
 */
public class DongVat {

    public DongVat() {

    }
    private String maDongVat;
    private String tenDongVat;
    private int canNang;
    private String noiSong;

    public DongVat(String maDongVat, String tenDongVat, int canNang, String noiSong) {
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.canNang = canNang;
        this.noiSong = noiSong;
    }

    public String getMaDongVat() {
        return maDongVat;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public int getCanNang() {
        return canNang;
    }

    public String getNoiSong() {
        return noiSong;
    }

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public void setCanNang(int canNang) {
       if(canNang > 0){
           this.canNang= canNang;
       }else{
           System.out.println("Can nang phai lon hon 0!");
       }
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

    public void inThongTin() {
        System.out.println("Ma: " + maDongVat + "; Ten: " + tenDongVat + "; Can nang: " + canNang + "; Noi song: " + noiSong);
    }

}
