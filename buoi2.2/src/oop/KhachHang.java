package oop;

public class KhachHang {
    private String ten;
    private String cccd;
    private String thang;
    private GoiDichVu goiDichVu;

    public KhachHang(String ten, String cccd, String thang, GoiDichVu goiDichVu) {
        this.ten = ten;
        this.cccd = cccd;
        this.thang = thang;
        this.goiDichVu = goiDichVu;
    }

    public String getTen() {
        return ten;
    }

    public String getCccd() {
        return cccd;
    }

    public String getThang() {
        return thang;
    }

    public GoiDichVu getGoiDichVu() {
        return goiDichVu;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public void setGoiDichVu(GoiDichVu goiDichVu) {
        this.goiDichVu = goiDichVu;
    }

    public String toString() {
        return "KhachHang [ten=" + ten + ", cccd=" + cccd + ", thang=" + thang + ", goiDichVu=" + goiDichVu + "]";
    }

    public int tinhTien() {
        return goiDichVu.getGia();
    }
}
