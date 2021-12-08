package DanhSachHocVien;


import java.util.Scanner;

public class HocVien {
   static Scanner sc = new Scanner(System.in);
    private String MSV;
    private String TSV;
    private int namSinh;
    private float DTK1;
    private float DTK2;
    private float DTCK;

    public HocVien(String MSV, String TSV, int namSinh, float DTK1, float DTK2, float DTCK) {
        this.MSV = MSV;
        this.TSV = TSV;
        this.namSinh = namSinh;
        this.DTK1 = DTK1;
        this.DTK2 = DTK2;
        this.DTCK = DTCK;
    }

    public HocVien() {
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getTSV() {
        return TSV;
    }

    public void setTSV(String TSV) {
        this.TSV = TSV;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDTK1() {
        return DTK1;
    }

    public void setDTK1(float DTK1) {
        this.DTK1 = DTK1;
    }

    public float getDTK2() {
        return DTK2;
    }

    public void setDTK2(float DTK2) {
        this.DTK2 = DTK2;
    }

    public float getDTCK() {
        return DTCK;
    }

    public void setDTCK(float DTCK) {
        this.DTCK = DTCK;
    }

    public float DTB(float dkt1, float dkt2, float dck) {
        dkt1 = DTK1;
        dkt2 = DTK2;
        dck = DTCK;
        float dtb = ((dkt1 + dkt2) / 2 + dck * 2) / 3;
        return dtb;
    }

    public  void input(){
        System.out.println("Nhập Mã Sinh Viên");
         MSV = sc.nextLine();
        System.out.println("Nhập Tên Sinh viên:");
        TSV = sc.nextLine();
        System.out.println("Nhập năm Sinh ");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Điểm Kiểm Tra 1:");
        DTK1 = sc.nextFloat();
        System.out.println("Nhập Điểm Kiểm Tra 2:");
        DTK2 = sc.nextFloat();
        System.out.println("Nhập Điểm Cuối Kì:");
        DTCK = sc.nextFloat();
        sc.nextLine();
    }


    public String xepLoai(float dtb) {
        if (dtb < 5)
            return "Không Đạt";
        if (dtb >= 5 && dtb < 7)
            return "Trung Bình";
        if (dtb >= 7 && dtb < 8)
            return "Khá";
        else
            return "giỏi";
    }

    @Override
    public String toString() {
       return  "[ MSV: " +  MSV + ";" +
               " HỌ TÊN: " + TSV + ";" +
               "Năm Sinh: " + namSinh + ";" +
               " Điểm KT 1: " + DTK1 + ";" +
               " Điểm KT 2: " + DTK2  + ";" +
               " Điểm KT CK: " + DTCK + ";" +
               " DTB: "  + DTB(DTK1,DTK2,DTCK) + ";" +
               "Xếp Loại: " + xepLoai(DTB(DTK1,DTK2,DTCK)) + "]";
    }
}
