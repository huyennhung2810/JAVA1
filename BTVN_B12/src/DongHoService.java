
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author han99
 */
public class DongHoService {
     private ArrayList<DongHo> listDongHo;

    public DongHoService(ArrayList<DongHo> listDongHo) {
        this.listDongHo = listDongHo;
    }
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma dong ho: ");
        int maDongHo = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap the loai dong ho: ");
        String theLoai = sc.nextLine();
        System.out.println("Moi nhap mau sac cua dong ho: ");
        String mauSac = sc.nextLine();
        System.out.println("Moi nhap kich thuoc cua dong ho: ");
        int kichThuoc = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap chat lieu cua dong ho: ");
        String chatLieu = sc.nextLine();
        System.out.println("Moi nhap gia cua dong ho: ");
        int gia = Integer.valueOf(sc.nextLine());
        DongHo dh = new DongHo(maDongHo, theLoai, mauSac, kichThuoc, chatLieu, gia);
        listDongHo.add(dh);
    }
    
    public void inDanhSachDongHo(){
        for (DongHo dh : listDongHo) {
            dh.inThongTin();
        }
    }
    
    public void timKiemDongHoTheoGia(int giaMin, int giaMax){
         for (DongHo dongHo : listDongHo) {
            if (dongHo.getGia() >= giaMin && dongHo.getGia() <= giaMax) {
                dongHo.inThongTin();
                System.out.println("----------------------------");
            }
        }
    }
    
    public void xoaDongHoTheoMa(int maDongHo){
         DongHo dongHoCanXoa = null;
        for (DongHo dongHo : listDongHo) {
            if (dongHo.getMaDongHo() == maDongHo) {
                dongHoCanXoa = dongHo;
                break;
            }
        }
        if (dongHoCanXoa != null) {
            listDongHo.remove(dongHoCanXoa);
            System.out.println("Đong ho da duoc xoa.");
        } else {
            System.out.println("Khong tim thay dong ho co ma : " + maDongHo);
        }
    }
    
    public void sapXepTheoKichThuocTangDan(){
        Collections.sort(listDongHo, Comparator.comparingInt(DongHo::getKichThuoc));
    }
    
    public void sapXepTheoKichThuocGiamDan(){
        Collections.sort(listDongHo, Comparator.comparingInt(DongHo::getKichThuoc).reversed());
    }
    
    public void lietKeTop3DatNhat(){
        listDongHo.sort(Comparator.comparingInt(DongHo::getGia).reversed());
        int count = Math.min(3, listDongHo.size());
        for (int i = 0; i < count; i++) {
            listDongHo.get(i).inThongTin();
            System.out.println("----------------------------");
        }
    }
}
