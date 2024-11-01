
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author han99
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLMayTinh service = new QLMayTinh(new ArrayList<>());
        int chon;

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Chuc nang 1.");
            System.out.println("2. Chuc nang 2.");
            System.out.println("3. Chuc nang 3.");
            System.out.println("4. Chuc nang 4.");
            System.out.println("5. Chuc nang 5.");
            System.out.println("6. Chuc nang 6.");
            System.out.println("7. Chuc nang 7.");
            System.out.println("8. Chuc nang 8.");
            System.out.println("9. Chuc nang 9.");
            System.out.println("10. Chuc nang 10.");
            System.out.println("11. Chuc nang 11.");
            System.out.println("12. Chuc nang 12.");
            System.out.println("13. Chuc nang 13.");
            System.out.println("14. Chuc nang 14.");
            System.out.println("15. Chuc nang 15.");
            System.out.println("16. Chuc nang 16.");
            System.out.println("0. Thoat.");
            System.out.println("Moi ban chon chuc nang: ");

            chon = Integer.valueOf(sc.nextLine());

            switch (chon) {
                case 1 -> {
                    System.out.println("Chuc nang 1");
                    service.themMayTinh();
                    break;
                }
                case 2 -> {
                    System.out.println("Chuc nang 2");
                    service.dsMayTinh();
                    break;
                }
                case 3 -> {
                    System.out.println("Chuc nang 3");
                    service.timKiemTenBDChuA();
                    break;
                }
                case 4 -> {
                    System.out.println("Chuc nang 4");
                    service.dsOViTriLe();
                    break;
                }
                case 5 -> {
                    System.out.println("Chuc nang 5");
                    service.sxTangDanTheoGia();
                    service.dsMayTinh();
                    break;
                }
                case 6 -> {
                    System.out.println("Chuc nang 6");
                    service.sxGiamTheoBoNho();
                    service.dsMayTinh();
                    break;
                }
                case 7 -> {
                    System.out.println("Chuc nang 7");
                    System.out.println("Moi nhap min: ");
                    float min = Float.parseFloat(sc.nextLine());
                    System.out.println("Moi nhap max: ");
                    float max = Float.parseFloat(sc.nextLine());
                    service.giaNhapTrongKhoang(min, max);
                    break;
                }
                case 8 -> {
                    System.out.println("Chuc nang 8");
                    service.tenKetThucChuE();
                    break;
                }
                case 9 -> {
                    System.out.println("Chuc nang 9");
                    service.trongTenChuaChuA();
                    break;
                }
                case 10 -> {
                    System.out.println("Chuc nang 10");
                    System.out.println("Moi nhap ma can tim: ");
                    String maCanTim = sc.nextLine();
                    MayTinh mtTim = service.timKiemTheoMaNhapTuBanPhim(maCanTim);
                    if (mtTim != null) {
                        mtTim.inThongTin();
                    } else {
                        System.out.println("Khong tim thay may tinh");
                    }
                    break;
                }
                case 11 -> {
                    System.out.println("Chuc nang 11");
                    System.out.println("Moi nhap ma can xoa: ");
                    String maCanXoa = sc.nextLine();
                    service.xoaTheoMaNhapTuBanPhim(maCanXoa);
                    System.out.println("Danh sach sau khi xoa : ");
                    service.dsMayTinh();
                    break;
                }
                case 12 -> {
                    System.out.println("Chuc nang 12");
                    service.viTriCoGiaCaoNhat();
                    break;
                }
                case 13 -> {
                    System.out.println("Chuc nang 13");
                    service.dsTrangThaiDangKinhDoanh();
                    break;
                }
                case 14 -> {
                    System.out.println("Chuc nang 14");
                    service.dsTrangThaiNgungKinhDoanh();
                    break;
                }
                case 15 -> {
                    System.out.println("Chuc nang 15");
                    System.out.println("Nhap hang may tinh: ");
                    String hang = sc.nextLine();
                    service.dsTheoHang(hang);
                    break;
                }
                case 16 -> {
                    System.out.println("MayTinhMSI");
                    MayTinhMSI msi = new MayTinhMSI("May Tinh msi", "1242", "msii", "MSI", 259, 421, true);
                    msi.inThongTin();
                    break;
                }
                case 0 -> {
                    System.out.println("Thoat chuong trinh");
                    break;
                }
                default -> {
                    System.out.println("Lua chon khong hop le. Moi chon lai.");
                }
            }
        }
    }
}
