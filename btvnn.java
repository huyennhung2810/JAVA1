/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnBuoi7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author han99
 */
public class btvnn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Nhap 3 so nguyen tu ban phim. Tinh tong, tich va so trung binh cua chung.");
            System.out.println("2. Nhap ho ten, tuoi, gioi tinh va nghe nghiep cua ban than, sau do in ra man hinh.");
            System.out.println("3. Nhap vao 1 so nguyen duong n. Tinh tong binh phuong cua cac so tu 1 den n.");
            System.out.println("4. Nhap vao so nguyen duong n. Tinh tich cac so chan tu 1 den n.");
            System.out.println("5. Nhap vao mang so thuc voi size nhap tu ban phim. In cac phan tu trong mang voi thu tu tang dan.");
            System.out.println("6. Nhap vao mang so nguyen tu ban phim voi size nhap tu ban phim. Tinh tong cac so le o vi tri chan.");
            System.out.println("7. Nhap vao mang so nguyen tu ban phim voi size nhap tu ban phim. Tim vi tri cua so lon nhat trong mang. ");
            System.out.println("8. Nhap vao mang so nguyen tu ban phim voi size nhap tu ban phim. Tim so chan dau tien trong mang.");
            System.out.println("9. Nhap vao mang so nguyen tu ban phim voi size nhap tu ban phim. Tim vi tri cua so le nho nhat trong mang.");
            System.out.println("10. Nhap vao mang so nguyen tu ban phim voi size nhap tu ban phim. Tinh tong cac so chan trong mang.");
            System.out.println("11. Nhap vao mang so nguyen tu ban phim voi size nhap tu ban phim. In ra phan tu co gia tri lon nhat trong mang.");
            System.out.println("12. Nhap vao mang so nguyen tu ban phim voi size nhap tu ban phim. Tim vi tri cua phan tu co gia tri lon thu hai trong mang.");
            System.out.println("13. Nhap vao so nguyen duong n. Tinh tong cac so nguyen to tu 1 den n. "
                    + "Nhap vao so nguyen duong n. Tinh tong cac so chia het cho 3 tu 1 toi n.");
            System.out.println("14. Nhap vao 2 so thuc tu ban phim. Tinh tong, hieu, tich, thuong cua 2 so nay.");
            System.out.println("15. Nhap vao mang so nguyen tu ban phim voi size nhap tu ban phim. In cac so nguyen to trong mang.");
            System.out.println("16. Nhap vao so nguyen duong n. In ra bang cuu chuong cua so do.");
            System.out.println("17. Nhap vao mang so nguyen tu ban phim voi size nhap tu ban phim. Dem so phan tu le trong mang. ");
            System.out.println("18. Nhap vao so nguyen duong n. Tinh n!.");
            System.out.println("19. Nhap vao mang so nguyen tu ban phim voi size nhap tu ban phim. Tim vi tri cua phan tu co gia tri nho thu hai trong mang.");
            System.out.println("0. Thoat.");
            System.out.println("Moi chon chuc nang: ");
            int chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1 -> {
                    System.out.println("Day la chuc nang 1: ");
                    System.out.println("Nhap so nguyen thu nhat: ");
                    int soNguyen1 = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap so nguyen thu nhat: ");
                    int soNguyen2 = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap so nguyen thu nhat: ");
                    int soNguyen3 = Integer.valueOf(sc.nextLine());

                    int tong = soNguyen1 + soNguyen2 + soNguyen3;
                    int tich = soNguyen1 * soNguyen2 * soNguyen3;
                    double tB = tong / 3;

                    System.out.println("Tong cua ba so la : " + tong);
                    System.out.println("Tich cua ba so la : " + tich);
                    System.out.println("So trung binh cua ba so la : " + tB);
                    break;
                }
                case 2 -> {
                    System.out.println("Day la chuc nang 2: ");
                    System.out.println("Moi nhap ho ten: ");
                    String hoTen = sc.nextLine();
                    System.out.println("Moi nhap tuoi: ");
                    int tuoi = Integer.valueOf(sc.nextLine());
                    System.out.println("Moi nhap gioi tinh: ");
                    String gioiTinh = sc.nextLine();
                    System.out.println("Moi nhap nghe nghiep: ");
                    String ngheNghiep = sc.nextLine();

                    System.out.println("Thong tin cua ban la: ");
                    System.out.println("Ho ten: " + hoTen);
                    System.out.println("Tuoi: " + tuoi);
                    System.out.println("Gioi tinh: " + gioiTinh);
                    System.out.println("Nghe nghiep: " + ngheNghiep);

                    break;
                }
                case 3 -> {
                    System.out.println("Day la chuc nang 3: ");
                    System.out.println("Moi nhap so nguyen duong n: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int tong = 0;
                    for (int i = 1; i < n + 1; i++) {
                        tong += i * i;
                    }
                    System.out.println("Tong binh phuong cua cac so tu 1 den " + n + " la: " + tong);

                    break;
                }
                case 4 -> {
                    System.out.println("Day la chuc nang 4: ");
                    System.out.println("Moi nhap so nguyen n: ");
                    int n = Integer.valueOf(sc.nextLine());
                    long tich = 1;
                    boolean soChan = false;

                    for (int i = 2; i < n + 1; i += 2) {
                        tich *= i;
                        soChan = true;
                    }
                    if (soChan) {
                        System.out.println("Tich cua cac so chan tu 1 den " + n + " la: " + tich);
                    } else {
                        System.out.println("Khong co so chan nao trong khoang tu 1 den " + n);
                    }

                    break;
                }
                case 5 -> {
                    System.out.println("Day la chuc nang 5: ");
                    System.out.println("Moi nhap size cua mang: ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];
                    System.out.println("Moi nhap cac phan tu trong mang: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    //sap xep
                    Arrays.sort(arr);

                    System.out.println("Cac phan tu trong mang theo thu tu tang dan la: ");
                    for (double num : arr) {
                        System.out.println(num + " ");
                    }
                    break;
                }
                case 6 -> {
                    System.out.println("Day la chuc nang 6: ");
                    System.out.println("Moi nhap size cua mang: ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];
                    System.out.println("Moi nhap cac phan tu trong mang: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    int tong = 0;
                    for (int i = 0; i < size; i += 2) {
                        if (arr[i] % 2 != 0) {
                            tong += arr[i];
                        }
                    }
                    System.out.println("Tong cac so le o vi tri chan la : " + tong);
                    break;
                }

                case 7 -> {
                    System.out.println("Day la chuc nang 7: ");
                    System.out.println("Moi nhap size cua mang: ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];
                    System.out.println("Moi nhap cac phan tu trong mang: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    int soLonNhat = arr[0];
                    int viTri = 0;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] > soLonNhat) {
                            soLonNhat = arr[i];
                            viTri = i;
                        }
                    }
                    System.out.println("So lon nhat trong mang la: " + soLonNhat);
                    System.out.println("Vi tri cua so lon nhat trong mang la: " + (viTri + 1));
                    break;
                }
                case 8 -> {
                    System.out.println("Day la chuc nang 8: ");
                    System.out.println("Moi nhap size cua mang: ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];

                    System.out.println("Moi nhap so phan tu cua mang: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }

                    Integer soChanDauTien = null;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 == 0) {
                            soChanDauTien = arr[i];
                            break;
                        }
                    }
                    if (soChanDauTien != null) {
                        System.out.println("So chan dau tien trong mang la: " + soChanDauTien);
                    } else {
                        System.out.println("Khong co so chan nao trong mang.");
                    }
                    break;
                }
                case 9 -> {
                    System.out.println("Day la chuc nang 9: ");
                    System.out.println("Moi nhap size cua mang: ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];

                    System.out.println("Moi nhap so phan tu cua mang: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }

                    Integer soLeNhoNhat = null;
                    int viTri = -1;

                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 != 0) {
                            if (soLeNhoNhat == null || arr[i] < soLeNhoNhat) {
                                soLeNhoNhat = arr[i];
                                viTri = i;
                            }
                        }
                    }
                    if (soLeNhoNhat != null) {
                        System.out.println("So le nho nhat trong mang la: " + soLeNhoNhat);
                        System.out.println("Vi tri cua so le nho nhat: " + (viTri + 1));
                    } else {
                        System.out.println("Khong co so le nao trong mang.");
                    }
                    break;
                }
                case 10 -> {
                    System.out.println("Day la chuc nang 10: ");
                    System.out.println("Moi nhap size cua mang: ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];

                    System.out.println("Moi nhap so phan tu cua mang: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    int tong = 0;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 == 0) {
                            tong += arr[i];
                        }
                    }
                    System.out.println("Tong cac so chan trong mang la: " + tong);
                    break;
                }
                case 11 -> {
                    System.out.println("Day la chuc nang 11: ");
                    System.out.println("Moi nhap size cua mang: ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];

                    System.out.println("Moi nhap so phan tu cua mang: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    int max = arr[0];
                    for (int i = 1; i < size; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Phan tu co gia tri lon nhat trong mang la: " + max);
                    break;
                }
                case 12 -> {
                    System.out.println("Day la chuc nang 12: ");
                    System.out.println("Moi nhap size cua mang: ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];

                    System.out.println("Moi nhap so phan tu cua mang: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    int max = Integer.MIN_VALUE;
                    int secondMax = Integer.MIN_VALUE;
                    int viTri = -1;

                    for (int i = 0; i < size; i++) {
                        if (arr[i] > max) {
                            secondMax = max;
                            max = arr[i];
                        } else if (arr[i] > secondMax && arr[i] != max) {
                            secondMax = arr[i];
                            viTri = i;
                        }
                    }
                    if (viTri != -1) {
                        System.out.println("Gia tri lon thu hai trong mang la: " + secondMax);
                        System.out.println("Vi tri cua gia tri lon thu hai trong mang la: " + (viTri + 1));
                    } else {
                        System.out.println("Khong co gia tri lon thu hai trong mang.");
                    }
                    break;
                }
                case 13 -> {
                    System.out.println("Day la chuc nang 13: ");
                    System.out.println("Moi nhap so nguyen duong n: ");
                    int n = Integer.valueOf(sc.nextLine());

                    int tongSoNguyenTo = 0;
                    int tongChiaHetCho3 = 0;

                    for (int i = 2; i < n + 1; i++) {
                        boolean soNguyenTo = true;
                        if (i <= 1) {
                            soNguyenTo = false;
                        } else {
                            for (int j = 2; j <= Math.sqrt(i); j++) {
                                if (i % j == 0) {
                                    soNguyenTo = false;
                                    break;
                                }
                            }
                        }
                        if (soNguyenTo) {
                            tongSoNguyenTo += i;

                        }
                    }
                    for (int i = 1; i < n + 1; i++) {
                        if (i % 3 == 0) {
                            tongChiaHetCho3 += i;
                        }
                    }

                    System.out.println("Tong cac so nguyen to tu 1 toi " + n + " la: " + tongSoNguyenTo);
                    System.out.println("Tong cac so chia het cho 3 tu 1 toi " + n + " la: " + tongChiaHetCho3);
                    break;
                }
                case 14 -> {
                    System.out.println("Day la chuc nang 14: ");
                    System.out.println("Moi nhap so thuc thu nhat: ");
                    double soThu1 = sc.nextDouble();
                    System.out.println("Moi nhap so thuc thu hai: ");
                    double soThu2 = sc.nextDouble();

                    double tong = soThu1 + soThu2;
                    double hieu = soThu1 - soThu2;
                    double tich = soThu1 * soThu2;
                    double thuong = soThu1 / soThu2;

                    System.out.println("Tong cua 2 so la: " + tong);
                    System.out.println("Hieu cua 2 so la: " + hieu);
                    System.out.println("Tich cua 2 so la: " + tich);
                    System.out.println("Thuong cua 2 so la: " + thuong);
                    break;
                }
                case 15 -> {
                    System.out.println("Day la chuc nang 15: ");
                    System.out.println("Moi nhap size cua mang: ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];

                    System.out.println("Moi nhap so phan tu cua mang: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }

                    System.out.println("Cac so nguyen to trong mang la: ");
                    for (int i = 0; i < size; i++) {
                        int num = arr[i];
                        boolean isPrime = true;
                        if (num <= 1) {
                            isPrime = false;
                        } else {
                            for (int j = 2; j <= Math.sqrt(num); j++) {
                                if (num % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        }
                        if (isPrime) {
                            System.out.println(num + "");
                        }
                    }

                    break;
                }
                case 16 -> {
                    System.out.println("Day la chuc nang 16: ");
                    System.out.println("Moi nhap so nguyen dương n: ");
                    int n = Integer.valueOf(sc.nextLine());

                    System.out.println("Bang cuu chuong cua " + n + "la: ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(n + " x " + i + " = " + (n * i));
                    }
                    break;
                }
                case 17 -> {
                    System.out.println("Day la chuc nang 17: ");
                    System.out.println("Moi nhap size cua mang: ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];

                    System.out.println("Moi nhap so phan tu cua mang: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    int soPhanTuLe = 0;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 != 0) {
                            soPhanTuLe++;
                        }
                    }
                    System.out.println("So phan tu le trong mang la: " + soPhanTuLe);
                    break;
                }
                case 18 -> {
                    System.out.println("Day la chuc nang 18: ");
                    System.out.println("Moi nhap so nguyen duong n: ");
                    int n = Integer.valueOf(sc.nextLine());

                    int giaiThua = 1;
                    for (int i = 1; i < n + 1; i++) {
                        giaiThua += 1;
                    }

                    System.out.println("Giai thua cua " + n + " la: " + giaiThua);
                    break;
                }
                case 19 -> {
                    System.out.println("Day la chuc nang 19: ");
                    System.out.println("Moi nhap size cua mang: ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];

                    System.out.println("Moi nhap so phan tu cua mang: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }

                    int min = Integer.MAX_VALUE;
                    int secondMin = Integer.MAX_VALUE;
                    int secondMinIndex = -1;

                    for (int i = 0; i < size; i++) {
                        if (arr[i] < min) {
                            secondMin = min;
                            min = arr[i];
                        } else if (arr[i] < secondMin && arr[i] != min) {
                            secondMin = arr[i];
                            secondMinIndex = -1;
                        }
                    }

                    if (secondMinIndex != -1) {
                        System.out.println("Gia tri nho thu hai trong mang la: " + secondMin);
                        System.out.println("Vi tri cua gia tri nho thu hai trong mang la: " + (secondMinIndex + 1));
                    } else {
                        System.out.println("Khong co gia tri nho thu hai trong mang.");
                    }
                    break;
                }
                case 0 -> {
                    System.out.println("Thoat chuong trinh. ");
                    break;
                }
                default -> {
                    System.out.println("Lua chon khong hop le.");
                }

            }
        }
    }
}
