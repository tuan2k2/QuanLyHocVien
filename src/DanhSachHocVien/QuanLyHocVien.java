package DanhSachHocVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHocVien {
    static  Scanner sc = new Scanner(System.in);
    HocVien hocVien = new HocVien();
    private List<HocVien> hv = new ArrayList<>();
    public static boolean k = false;

    public  List nhap(int n) {
        List<HocVien> listHocVien = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            HocVien hocVien = new HocVien();
            hocVien.input();
            listHocVien.add(hocVien);
        }
        return listHocVien;
    }

    public  List addOne(List<HocVien> listHocVien, int n) {
        HocVien hocVien = new HocVien();
        hocVien.input();
        listHocVien.add(n, hocVien);
        return listHocVien;
    }

    public  void displayHocViendat(List<HocVien> listHocVien, int n) {
        for (int i = 0; i < n; i++) {
            if (listHocVien.get(i).DTB(hocVien.getDTK1(),hocVien.getDTK2(),hocVien.getDTCK()) >= 7 ) {
                System.out.println(listHocVien.get(i));
            }
        }
    }

    public  int coutDat(List<HocVien> listHocVien, int n) {
        int cout = 0;
        for (int i = 0; i < n; i++) {
            if (listHocVien.get(i).DTB(hocVien.getDTK1(),hocVien.getDTK2(),hocVien.getDTCK()) >= 7 ) {
                cout++;
            }
        }
        return cout;
    }

    public void findProMax(List<HocVien> listHocVien, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (listHocVien.get(j).DTB(hocVien.getDTK1(),hocVien.getDTK2(),hocVien.getDTCK()) > listHocVien.get(i).DTB(hocVien.getDTK1(),hocVien.getDTK2(),hocVien.getDTCK())) {
                    max = i;
                }
            }
        }
        System.out.println("Học Viên Có Điểm Trung Bình Cao Nhất :");
        System.out.println(listHocVien.get(max));

    }

    public  void displayHocVien(List<HocVien> listHocVien, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(listHocVien.get(i));
        }
    }

    public  void findStudentID(List<HocVien> listHocVien, int n) {
        String id;
        boolean k = false;
        System.out.println("Nhập Mã Học Viên Bạn Muốn Tìm :");
        id = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (listHocVien.get(i).getMSV().equals(id)) {
                System.out.println(listHocVien.get(i));
                k = true;
            }
        }
        if (!k) {
            System.out.println("KHÔNG CÓ Học Viên Trong Mảng");
        }
    }

    public void deleteStudentID(List<HocVien> listHocVien, int n) {
        String MaSV;

        int xy;
        xy = 0;
        System.out.println("Nhập Mã Học Viên  Bạn Xóa :");
        MaSV = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (listHocVien.get(i).getMSV()==MaSV) {
                xy = i;
                k = true;
            }
            if (xy != 0) {
                listHocVien.remove(xy);
            }
        }
    }
}
