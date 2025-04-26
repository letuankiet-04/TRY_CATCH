package Bai;

public class GiamDoc extends NhanVien {
    private double tiLeCoPhan;

    public GiamDoc(String ma, String hoTen, String soDienThoai, int soNgayLamViec, double tiLeCoPhan) {
        super(ma, hoTen, soDienThoai, soNgayLamViec);
        this.tiLeCoPhan = tiLeCoPhan;
    }

    public double getTiLeCoPhan() {
        return tiLeCoPhan;
    }

    public void setTiLeCoPhan(double tiLeCoPhan) {
        this.tiLeCoPhan = tiLeCoPhan;
    }

    @Override
    public double tinhLuong() {
        return getSoNgayLamViec() * 300;
    }

    public double tinhThuNhap(double loiNhuanCongTy) {
        return tinhLuong() + (tiLeCoPhan / 100.0) * loiNhuanCongTy;
    }

    @Override
    public String toString() {
        return "Giam Doc: " + super.toString() + ", Co phan: " + tiLeCoPhan + "%, Luong: " + tinhLuong();
    }
}
