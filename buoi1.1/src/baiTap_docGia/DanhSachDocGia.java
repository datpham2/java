package baiTap_docGia;

import java.util.ArrayList;
import java.util.List;

public class DanhSachDocGia {
    private List<DocGia> arr;

    public DanhSachDocGia() {
        this.arr = new ArrayList<>();
    }

    public void nhap() {
        DocGia a = new DocGia_TreEm();
        a.nhap();
        arr.add(a);

        DocGia b = new DocGia_NguoiLon();
        b.nhap();
        arr.add(b);
    }

    public void xuat() {
        for (DocGia d : arr) {
            d.xuat();
        }
    }
}
