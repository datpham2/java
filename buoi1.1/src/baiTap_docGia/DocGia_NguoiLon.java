package baiTap_docGia;

import java.util.Scanner;

public class DocGia_NguoiLon extends DocGia{
    private String so_CCCD;

    public DocGia_NguoiLon() {
        this.setGia(10000);
    }

    public String getSo_CCCD() {
        return so_CCCD;
    }

    public void setSo_CCCD(String so_CCCD) {
        this.so_CCCD = so_CCCD;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số căn cước công dân: ");
        this.so_CCCD = scanner.nextLine();
        super.nhap();
    }

    public void xuat() {
        System.out.println("Số căn cước công dân: " + this.so_CCCD);
        super.xuat();
        System.out.println("Tổng số tiền: " + tinhTien());
    }

    @Override
    public long tinhTien() {
        return this.getSoThang() * this.getGia();
    }
}
