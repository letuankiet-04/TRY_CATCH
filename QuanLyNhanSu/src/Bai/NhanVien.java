package Bai;

public abstract class NhanVien {
    private String ma;
    private String hoTen;
    private String soDienThoai;
    private int soNgayLamViec;

    public NhanVien(String ma, String hoTen, String soDienThoai, int soNgayLamViec) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soNgayLamViec = soNgayLamViec;
    }

    public String getMa() {
        return ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public abstract double tinhLuong();

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %d ngày", ma, hoTen, soDienThoai, soNgayLamViec);
    }
}
