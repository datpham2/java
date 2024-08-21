package baiTap_docGia;

import java.util.Scanner;

public abstract class DocGia {
    private int soThang;
    private long gia;

    public DocGia() {
    }

    public DocGia(int soThang) {
        this.soThang = soThang;
    }

    public int getSoThang() {
        return soThang;
    }

    public void setSoThang(int soThang) {
        this.soThang = soThang;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thang: ");
        this.soThang = scanner.nextInt();
    }

    public void xuat() {
        System.out.println("Số tháng: " + this.soThang);
    }

    public abstract long tinhTien();
}
