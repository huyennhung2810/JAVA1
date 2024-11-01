/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnBuoi6;

import java.util.Scanner;

/**
 *
 * @author han99
 */
public class btvn {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        do {
            System.out.println("-----------------MENU CHUC NANG NHU SAU---------------------");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Nhap 2 so nguyen tu ban phim. Tinh tong, tich, thuong.");
            System.out.println("2. Nhap ten, tuoi, dia chi, ky hoc cua ban than va in ra man hinh.");
            System.out.println("3. Nhap vao so nguyen duong n. Tinh tong cacs so tu 0 -> n.");
            System.out.println("4. Nhap vao so nguyen duong n. Tinh tich cac so le tu 1 -> n.");
            System.out.println("5. Nhap vao mang so nguyen tu ban phim voi size nhap tu ban phim. In ra cac phan tu trong mang theo chieu nguoc lai. ");
            System.out.println("6. ... . Tinh tich cac so chan ow vi tri le.");
            System.out.println("7. ... . Liet ke vi tri so le dau tien trong mang.");
            System.out.println("8. ... . Liet ke cac vi tri so co gia tri lon nhat trong mang.");
            System.out.println("9. ... . Liet ke cac vi tri so le cuoi cung trong mang.");
            System.out.println("10. ... . Tinh tong cua cac vi tri co gia tri nho nhat trong mang");
            System.out.println("11. ... . In ra so nguyen duong cuoi cung trong mang.");
            System.out.println("12. ... . Liet ke cac vi tri co gia tri nho nhat.");
            System.out.println("13. Tinh tong, hieu, tich, thuong cua 2 so thuc tu ban phim.");
            System.out.println("14. In ra tuoi cua ban than khi biet nam sinh.");
            System.out.println("15. Tinh diem trung binh cua 3 diem toan, ly, hoa voi he so: toan*2, hoa*2, ly*3.");
            System.out.println("-------------------------------------------------------------");

            System.out.print("moi ban nhap chuc nang: ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 0 -> {
                    System.out.println("Chuong trinh ket thuc tai day!!!");
                    run = false;
                }

                case 1 -> {
                    System.out.print("Moi nhap so nguyen thu 1: ");
                    int so1 = Integer.parseInt(sc.nextLine());
                    System.out.print("Moi nhap so nguyen thu 2: ");
                    int so2 = Integer.parseInt(sc.nextLine());

                    System.out.println("Tong cua 2 so la: " + (so1 + so2));
                    System.out.println("Tich cua 2 so la: " + (so1 * so2));

                    if (so2 == 0) {
                        System.out.println("Khong ton tai tich 2 so. so nguyen thu 2 phai khac 0");
                    } else {
                        System.out.println("Thuong cua 2 so la: " + ((float) so1 / so2));
                    }
                }

                case 2 -> {
                    System.out.print("moi ban nhap ten: ");
                    String ten = sc.nextLine();
                    System.out.print("moi ban nhap tuoi: ");
                    int tuoi = Integer.parseInt(sc.nextLine());
                    System.out.print("moi ban nhap dia chi: ");
                    String diaChi = sc.nextLine();
                    System.out.print("moi ban nhap ki hoc cua ban: ");
                    String kiHoc = sc.nextLine();

                    System.out.println("ten ban la: " + ten);
                    System.out.println("tuoi cua ban la: " + tuoi);
                    System.out.println("dia chi cua ban la: " + diaChi);
                    System.out.println("ban dang hoc ki: " + kiHoc);
                }

                case 3 -> {
                    System.out.print("Moi nhap so nguyen duong n: ");
                    int soN = Integer.parseInt(sc.nextLine());

                    int tong = 0;

                    for (int i = 0; i <= soN; i++) {
                        tong += i;
                    }
                    System.out.println("Tong cac so tu 0 -> n la: " + tong);
                }

                case 4 -> {
                    System.out.print("Moi nhap so nguyen duong n: ");
                    int soN = Integer.parseInt(sc.nextLine());

                    int tich = 1;
                    for (int i = 1; i <= soN; i += 2) {
                        tich *= i;
                    }
                    System.out.println("Tich cac so tu 1 -> n la: " + tich);
                }

                case 5 -> {
                    System.out.print("moi nhap do lon cua mang: ");
                    int size = Integer.parseInt(sc.nextLine());

                    int[] arr = new int[size];
                    System.out.println("Nhap cac phan tu cua mang:");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Phan tu " + (i + 1) + ": ");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }

                    System.out.println("Cac phan tu cua mang theo chieu nguoc lai la:");
                    for (int i = size - 1; i >= 0; i--) {
                        System.out.print(arr[i] + " ");
                    }

                }

                case 6 -> {
                    System.out.print("moi nhap do lon cua mang: ");
                    int size = Integer.parseInt(sc.nextLine());

                    int[] arr = new int[size];
                    System.out.println("Nhap cac phan tu cua mang:");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Phan tu " + (i + 1) + ": ");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    int tich = 1;
                    for (int i = 1; i < size; i += 2) {
                        if (arr[i] % 2 == 0) {
                            tich *= arr[i];
                        }
                    }
                    System.out.println("tich cac so chan o vi tri le la: " + tich);

                }

                case 7 -> {
                    System.out.print("moi nhap do lon cua mang: ");
                    int size = Integer.parseInt(sc.nextLine());

                    int arr[] = new int[size];

                    System.out.println("nhap gia tri cua cac phan tu cua mang!");
                    for (int i = 0; i < size; i++) {
                        System.out.print("phan tu thu " + (i + 1) + " la: ");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }

                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 != 0) {
                            System.out.println("vi tri so le dau tien la: " + i);
                            break;
                        }
                    }

                }

                case 8 -> {
                    System.out.print("moi nhap do lon cua mang: ");
                    int size = Integer.parseInt(sc.nextLine());

                    int arr[] = new int[size];

                    System.out.println("nhap gia tri cua cac phan tu trong mang!");
                    for (int i = 0; i < size; i++) {
                        System.out.print("phan tu " + (i + 1) + " la: ");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    int max = arr[0];
                    for (int i = 0; i < size; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Giá tri lon nhat la: " + max);
                    System.out.print("vi tri cua cac so co gia tri lon nhat la: ");
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == max) {
                            System.out.print(" " + i);
                        }
                    }
                    System.out.println(" ");

                }

                case 9 -> {
                    System.out.print("moi nhap do lon cua mang: ");
                    int size = Integer.parseInt(sc.nextLine());
                    int arr[] = new int[size];

                    System.out.println("nhap gia tri cua cac phan tu trong mang!");
                    for (int i = 0; i < size; i++) {
                        System.out.print("phan tu " + (i + 1) + " : ");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    int viTri = -1;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 != 0) {
                            viTri = i;
                        }
                    }
                    if (viTri == -1) {
                        System.out.println("Mang khong co so le!!!");
                    } else {
                        System.out.println("vi tri so le cuoi cung la: " + viTri);
                    }

                }

                case 10 -> {
                    System.out.print("Nhap do lon cua mang: ");
                    int size = Integer.parseInt(sc.nextLine());
                    int arr[] = new int[size];

                    System.out.println("Nhap gia tri cua cac phan tu!");
                    for (int i = 0; i < size; i++) {
                        System.out.print("phan tu " + (i + 1) + " : ");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    int min = arr[0];
                    for (int i = 0; i < size; i++) {
                        if (min > arr[i]) {
                            min = arr[i];
                        }
                    }
                    int sum = 0;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == min) {
                            sum += i;
                        }
                    }
                    System.out.println("tong cac vi tri cua cac phan tu co gia tri nho nhat la: " + sum);
                }

                case 11 -> {
                    System.out.print("Moi nhap do lon cua mang: ");
                    int size = Integer.parseInt(sc.nextLine());

                    int arr[] = new int[size];
                    System.out.println("Nhap gia tri cua cac phan tu trong mang!");
                    for (int i = 0; i < size; i++) {
                        System.out.print("phan tu " + (i + 1) + " : ");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    int viTri = -1;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] > 0) {
                            viTri = i;
                        }
                    }
                    if (viTri == -1) {
                        System.out.println("Mang khong co so nguyen duong!!");
                    } else {
                        System.out.println("so nguyen duong cuoi cung trong mang la: " + arr[viTri]);
                    }
                }

                case 12 -> {
                    System.out.print("Moi nhap do lon cua mang: ");
                    int size = Integer.parseInt(sc.nextLine());

                    int arr[] = new int[size];

                    System.out.println("Nhap gia tri cua cac phan tu trong mang!!!");
                    for (int i = 0; i < size; i++) {
                        System.out.print("phan tu " + (i + 1) + " : ");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }

                    int min = arr[0];
                    for (int i = 0; i < size; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }

                    System.out.print("vi tri co gia tri nho nhat la: ");
                    for (int i = 0; i < size; i++) {
                        if (min == arr[i]) {
                            System.out.print(" " + i);
                        }
                    }
                    System.out.println(" ");
                }

                case 13 -> {
                    System.out.print("Moi nhap so thuc thu 1: ");
                    float so1 = Float.parseFloat(sc.nextLine());
                    System.out.print("Moi nhap so thuc thu 2: ");
                    float so2 = Float.parseFloat(sc.nextLine());

                    System.out.println("Tong cua 2 so la: " + (so1 + so2));
                    System.out.println("Hieu cua 2 so la: " + (so1 - so2));
                    System.out.println("Tich cua 2 so la: " + (so1 * so2));
                    System.out.println("Thuong cua 2 so la: " + (so1 / so2));
                }

                case 14 -> {
                    System.out.print("Moi nhap vao nam sinh cua ban: ");
                    int nam = Integer.parseInt(sc.nextLine());

                    System.out.println("Tuoi cua ban la: " + (2024 - nam));
                }

                case 15 -> {
                    System.out.print("Moi ban nhap diem mon toan: ");
                    float toan = Float.parseFloat(sc.nextLine());
                    System.out.print("Moi ban nhap diem mon ly: ");
                    float ly = Float.parseFloat(sc.nextLine());
                    System.out.print("Moi ban nhap diem mon hoa: ");
                    float hoa = Float.parseFloat(sc.nextLine());

                    float diemTB = ((toan + hoa) * 2 + ly * 3) / 7;
                    System.out.printf("Diem trung binh la: %.1f\n", diemTB);
                }

                default -> {
                    System.out.println("menu chuc nang ban nhap sai roi! ");
                }
            }

        } while (run);

    }

}