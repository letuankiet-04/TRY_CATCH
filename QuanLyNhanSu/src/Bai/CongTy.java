package Bai;

import java.util.ArrayList;

public class CongTy {
    private String ten, maSoThue;
    private double doanhThuTang;
    public ArrayList<NhanVien> danhSachNhanSu = new ArrayList<>();

    public CongTy(String ten, String maSoThue, double doanhThuTang, ArrayList<NhanVien> danhSachNhanSu) {
        this.ten = ten;
        this.maSoThue = maSoThue;
        this.doanhThuTang = doanhThuTang;
        if (danhSachNhanSu != null)
            this.danhSachNhanSu = danhSachNhanSu;
    }

    public void nhapThongTin(String ten, String mst, double doanhThu) {
        this.ten = ten;
        this.maSoThue = mst;
        this.doanhThuTang = doanhThu;
    }

    public void themNhanSu(NhanVien nv) {
        danhSachNhanSu.add(nv);
    }

    public NhanVien timNhanVienTheoMa(String ma) {
        for (NhanVien nv : danhSachNhanSu) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
                return nv;
            }
        }
        return null;
    }

    public void xuatThongTinNhanSu() {
        for (NhanVien nv : danhSachNhanSu) {
            System.out.println(nv.getHoTen() + ", Luong: " + nv.tinhLuong());
        }
    }

    public double tinhTongLuong() {
        double tong = 0;
        for (NhanVien nv : danhSachNhanSu) {
            tong += nv.tinhLuong();
        }
        return tong;
    }

    public void timNhanVienThuongLuongCaoNhat() {
        double max = 0;
        NhanVienThuong ketQua = null;
        for (NhanVien nv : danhSachNhanSu) {
            if (nv instanceof NhanVienThuong) {
                double luong = nv.tinhLuong();
                if (luong > max) {
                    max = luong;
                    ketQua = (NhanVienThuong) nv;
                }
            }
        }
        if (ketQua != null) {
            System.out.println("Nhan vien thuong co luong cao nhat: " + ketQua.getHoTen() + ", " + max);
        }
    }

    public void timTruongPhongNhieuNhanVienNhat() {
        int max = 0;
        TruongPhong ketQua = null;
        for (NhanVien nv : danhSachNhanSu) {
            if (nv instanceof TruongPhong tp) {
                if (tp.getSoNhanVienDuoiQuyen() > max) {
                    max = tp.getSoNhanVienDuoiQuyen();
                    ketQua = tp;
                }
            }
        }
        if (ketQua != null) {
            System.out.println("Truong phong co nhieu nhan vien nhat: " + ketQua.getHoTen());
        }
    }
    public void sapXepTheoTenABC() {
        danhSachNhanSu.sort((nv1, nv2) -> nv1.getHoTen().compareToIgnoreCase(nv2.getHoTen()));
        System.out.println("Da sap xep nhan vien theo ten A -> Z:");
        for (NhanVien nv : danhSachNhanSu) {
            System.out.println(nv);
        }
    }
    public void sapXepTheoThuNhapGiamDan() {
        danhSachNhanSu.sort((nv1, nv2) -> {
            double tn1 = (nv1 instanceof GiamDoc) ? ((GiamDoc) nv1).tinhThuNhap(doanhThuTang) : nv1.tinhLuong();
            double tn2 = (nv2 instanceof GiamDoc) ? ((GiamDoc) nv2).tinhThuNhap(doanhThuTang) : nv2.tinhLuong();
            return Double.compare(tn2, tn1);
        });
        System.out.println("Da sap xep nhan su theo thu nhap giam dan:");
        for (NhanVien nv : danhSachNhanSu) {
            double thuNhap = (nv instanceof GiamDoc) ? ((GiamDoc) nv).tinhThuNhap(doanhThuTang) : nv.tinhLuong();
            System.out.println(nv + " - Thu nhap: " + thuNhap);
        }
    }
    public void timGiamDocCoCoPhanCaoNhat() {
        double max = 0;
        GiamDoc ketQua = null;
        for (NhanVien nv : danhSachNhanSu) {
            if (nv instanceof GiamDoc gd) {
                if (gd.getTiLeCoPhan() > max) {
                    max = gd.getTiLeCoPhan();
                    ketQua = gd;
                }
            }
        }
        if (ketQua != null) {
            System.out.println("Giam doc co co phan cao nhat: " + ketQua.getHoTen() + " (" + ketQua.getTiLeCoPhan() + "%)");
        }
    }
    public void tinhVaXuatThuNhapGiamDoc() {
        for (NhanVien nv : danhSachNhanSu) {
            if (nv instanceof GiamDoc gd) {
                double thuNhap = gd.tinhThuNhap(doanhThuTang);
                System.out.println("Giam doc: " + gd.getHoTen() + " | Thu nhap: " + thuNhap);
            }
        }
    }


}
