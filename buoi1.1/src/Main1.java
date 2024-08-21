import baiTap_docGia.DocGia_NguoiLon;
import baiTap_docGia.DocGia_TreEm;
import oop.SinhVien;
import oop.SinhVienNN;
import oop.SinhVienVN;

public class Main1 {
    public static void main(String[] args) {

//        SinhVien a = new SinhVien("Tan", 7.2f, 7.3f);
//        SinhVien b = new SinhVien("Phuong", 9.2f, 9.3f);
//        SinhVien c = new SinhVien("Kim", 3.0f, 4.0f);
//
//        System.out.println("Sinh vien a ten la: " + a.getTen() + " -- toan: "
//            + a.getToan() + " -- van: " + a.getVan());
//
//        System.out.println("DTB: " + a.dtb());
//        System.out.println("DTB của 2 bạn: " + a.dtb(b));
//        System.out.println("DTB của 3 bạn: " + a.dtb(b, c));

//        SinhVienVN sv1 = new SinhVienVN();
//        sv1.xuat();
//
//        SinhVienNN sv2 = new SinhVienNN();
//        sv2.noiNhieu();

        DocGia_NguoiLon dg0 = new DocGia_NguoiLon();
        dg0.nhap();
        dg0.xuat();

        DocGia_TreEm dg1 = new DocGia_TreEm();
        dg1.nhap();
        dg1.xuat();
    }
}
