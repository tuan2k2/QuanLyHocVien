package DanhSachHocVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        QuanLyHocVien quanLyHocVien = new QuanLyHocVien();
        int n;
        n=0;
        List<HocVien> hocViens = new ArrayList<>();
        while (true) {
            showMenu();
            System.out.println("choose:");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("nhập số Học viên:");
                    n = sc.nextInt();
                    hocViens = quanLyHocVien.nhap(n);
                    break;
                case 2:
                    quanLyHocVien.displayHocVien(hocViens,n);
                    break;
                case 3:
                   hocViens = quanLyHocVien.addOne(hocViens,n);
                   n= n+1;
                   break;
                case 4:
                    quanLyHocVien.displayHocViendat(hocViens, n);
                    break;
                case 5:
                    System.out.println("Số Học Viên Đạt :" + quanLyHocVien.coutDat(hocViens, n));
                    break;
                case 6:
                    quanLyHocVien.findStudentID(hocViens, n);
                    break;
                case 7:
                    quanLyHocVien.deleteStudentID(hocViens, n);
                        n = n-1;
                    break;
                case 8:
                    quanLyHocVien.findProMax(hocViens, n);
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Nhap 1 - 8");
            }
        }
    }

    public static void showMenu(){
        System.out.println("1. Nhập Học Viên");
        System.out.println("2. In Học viên:");
        System.out.println("3. Thêm Học Viên ở cuối:");
        System.out.println("4. in ra Học Viên Đạt:");
        System.out.println("5. sort by grade point average:");
        System.out.println("6. Tìm Học Viên Theo Id:");
        System.out.println("7. Xóa Học viên Theo Id:");
        System.out.println("8. Tìm Học Viên Có Điểm Tb Lớn Nhất:");
        System.out.println("9. Thoát Chương Trình:");
    }

}
