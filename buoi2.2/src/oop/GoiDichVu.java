package oop;

public class GoiDichVu {
    // The class for gym membership



    private String tenGoi;
    private int phiCoBan;
    private int chiPhiLopHoc;
    private int dichVuXongHoi;
    private int hoTroPT;

    public GoiDichVu(String tenGoi, int phiCoBan, int chiPhiLopHoc, int dichVuXongHoi, int hoTroPT) {
        this.tenGoi = tenGoi;
        this.phiCoBan = phiCoBan;
        this.chiPhiLopHoc = chiPhiLopHoc;
        this.dichVuXongHoi = dichVuXongHoi;
        this.hoTroPT = hoTroPT;
    }

    public String getTenGoi() {
        return tenGoi;
    }

    public int getPhiCoBan() {
        return phiCoBan;
    }

    public int getChiPhiLopHoc() {
        return chiPhiLopHoc;
    }

    public int getDichVuXongHoi() {
        return dichVuXongHoi;
    }

    public int getHoTroPT() {
        return hoTroPT;
    }

    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
    }

    public void setPhiCoBan(int phiCoBan) {
        this.phiCoBan = phiCoBan;
    }

    public void setChiPhiLopHoc(int chiPhiLopHoc) {
        this.chiPhiLopHoc = chiPhiLopHoc;
    }

    public void setDichVuXongHoi(int dichVuXongHoi) {
        this.dichVuXongHoi = dichVuXongHoi;
    }

    public void setHoTroPT(int hoTroPT) {
        this.hoTroPT = hoTroPT;
    }

    public String toString() {
        return "GoiDichVu [tenGoi=" + tenGoi + ", phiCoBan=" + phiCoBan + ", chiPhiLopHoc=" + chiPhiLopHoc + ", dichVuXongHoi=" + dichVuXongHoi + ", hoTroPT=" + hoTroPT + "]";
    }

    public int getGia() {
        return phiCoBan + chiPhiLopHoc + dichVuXongHoi + hoTroPT;
    }

    public int getGia(int thang) {
        return thang * (phiCoBan + chiPhiLopHoc + dichVuXongHoi + hoTroPT);
    }

    public int getGia(int thang, int giamGia) {
        return thang * (phiCoBan + chiPhiLopHoc + dichVuXongHoi + hoTroPT) * (100 - giamGia) / 100;
    }

    public int getGia(int thang, int giamGia, int giamGia2) {
        return thang * (phiCoBan + chiPhiLopHoc + dichVuXongHoi + hoTroPT) * (100 - giamGia) / 100 * (100 - giamGia2) / 100;
    }

    public int getGia(int thang, int giamGia, int giamGia2, int giamGia3) {
        return thang * (phiCoBan + chiPhiLopHoc + dichVuXongHoi + hoTroPT) * (100 - giamGia) / 100 * (100 - giamGia2) / 100 * (100 - giamGia3) / 100;
    }
}
