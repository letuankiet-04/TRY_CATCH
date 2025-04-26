package Bai;

public class NhanVienThuong extends NhanVien {
    private TruongPhong truongPhong;

    public NhanVienThuong(String ma, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(ma, hoTen, soDienThoai, soNgayLamViec);
    }

    public void setTruongPhong(TruongPhong tp) {
        this.truongPhong = tp;
    }

    @Override
    public double tinhLuong() {
        return getSoNgayLamViec() * 100;
    }

    @Override
    public String toString() {
        return "Nhan Vien Thuong: " + super.toString() + ", Luong: " + tinhLuong();
    }
}
