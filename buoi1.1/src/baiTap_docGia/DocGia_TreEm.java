package baiTap_docGia;

import java.util.Scanner;

public class DocGia_TreEm extends DocGia {
    private String ten_NBH;

    public DocGia_TreEm() {
        this.setGia(5000);
    }

    public String getTen_NBH() {
        return ten_NBH;
    }

    public void setTen_NBH(String ten_NBH) {
        this.ten_NBH = ten_NBH;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên người bảo hộ: ");
        this.ten_NBH = scanner.nextLine();
        super.nhap();
    }

    public void xuat() {
        System.out.println("Tên người bảo hộ: " + this.ten_NBH);
        super.xuat();
        System.out.println("Tổng số tiền: " + tinhTien());
    }

    @Override
    public long tinhTien() {
        return this.getGia() * this.getSoThang();
    }
}
