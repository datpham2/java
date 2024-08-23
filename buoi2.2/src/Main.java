import oop.DanhSachKhachHang;
import oop.GoiDichVu;

public class Main {
    public static void main(String[] args) {
        DanhSachKhachHang.nhapDanhSachKhachHang();
        // why the danhSachKhachHang keep its value after the method ends?
        // because danhSachKhachHang is a static field
        // so it belongs to the class, not to the object
        // so it keeps its value after the method ends
        // so we can access it in the main method

        // why the danhSachKhachHang is a static field?
        // because we want to keep the list of customers
        // so we can access it in other methods
        // so we can access it in the main method
        DanhSachKhachHang.inDanhSachKhachHang();
        DanhSachKhachHang.xuatDanhSachKhachHang();
    }
}