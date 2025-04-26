package Bai;

public class TruongPhong extends NhanVien {
    private int soNhanVienDuoiQuyen = 0;

    public TruongPhong(String ma, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(ma, hoTen, soDienThoai, soNgayLamViec);
    }

    public void tangNhanVienDuoiQuyen() {
        soNhanVienDuoiQuyen++;
    }

    public int getSoNhanVienDuoiQuyen() {
        return soNhanVienDuoiQuyen;
    }

    public void setSoNhanVienDuoiQuyen(int soNhanVienDuoiQuyen) {
        this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
    }

    @Override
    public double tinhLuong() {
        return getSoNgayLamViec() * (200 + 100 * soNhanVienDuoiQuyen);
    }

    @Override
    public String toString() {
        return "Truong Phong: " + super.toString() + ", Nhan vien duoi quyen: " + soNhanVienDuoiQuyen + ", Luong: " + tinhLuong();
    }
}
