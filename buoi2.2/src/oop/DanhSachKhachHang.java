package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DanhSachKhachHang {
    private static List<KhachHang> danhSachKhachHang;
    private int soLuongKhachHang;

    private static final List<GoiDichVu> GOIDICHVU = Arrays.asList(
            new GoiDichVu("Premium", 1000, 0, 0, 0),
            new GoiDichVu("Basic", 500, 100, -1, 100),
            new GoiDichVu("Non-member", 200, -1, -1, 200)
    );

    public DanhSachKhachHang() {
        danhSachKhachHang = new ArrayList<>();
    }

    public static List<KhachHang> getDanhSachKhachHang() {
        return danhSachKhachHang;
    }

    public static void setDanhSachKhachHang(List<KhachHang> danhSachKhachHang) {
        DanhSachKhachHang.danhSachKhachHang = danhSachKhachHang;
    }

    public static void inDanhSachKhachHang() {
        System.out.println("Danh sach khach hang:");
        for (KhachHang khachHang : danhSachKhachHang) {
            System.out.println(khachHang);
        }
    }

    // Keep prompting the user to enter the information of the customers
    public static void nhapDanhSachKhachHang() {
        danhSachKhachHang = new ArrayList<>();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int option;
        while (true) {
            System.out.println("1. Premium");
            System.out.println("2. Basic");
            System.out.println("3. Non-member");
            System.out.println("0. Exit");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 0) {
                break;
            }
            System.out.print("Enter the name of the customer: ");
            String ten = scanner.nextLine();
            System.out.print("Enter the ID of the customer: ");
            String cccd = scanner.nextLine();
            System.out.print("Enter the month: ");
            String thang = scanner.nextLine();
            GoiDichVu goiDichVu = GOIDICHVU.get(option - 1);
            KhachHang khachHang = new KhachHang(ten, cccd, thang, goiDichVu);
            danhSachKhachHang.add(khachHang);
        }
    }

    public static void xuatDanhSachKhachHang() {
        for (KhachHang khachHang : danhSachKhachHang) {
            System.out.println(khachHang);
        }
    }

    public int tinhTongTien() {
        int tongTien = 0;
        for (KhachHang khachHang : danhSachKhachHang) {
            tongTien += khachHang.tinhTien();
        }
        return tongTien;
    }
}
