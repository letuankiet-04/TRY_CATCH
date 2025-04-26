package Bai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CongTy congTy = new CongTy(null, null, 0, null);

        while (true) {
        	System.out.println("\n===== MENU QUAN LY NHAN SU =====");
        	System.out.println("1. Nhap thong tin cong ty");
        	System.out.println("2. Phan bo Nhan vien vao Truong phong");
        	System.out.println("3. Them, xoa nhan su");
        	System.out.println("4. Xuat ra thong tin toan bo nguoi trong cong ty");
        	System.out.println("5. Tinh va xuat tong luong cong ty");
        	System.out.println("6. Tim nhan vien thuong co luong cao nhat");
        	System.out.println("7. Tim Truong phong co nhieu nhan vien nhat");
        	System.out.println("8. Sap xep nhan vien theo ten ABC");
        	System.out.println("9. Sap xep nhan vien theo thu tu giam dan thu nhap");
        	System.out.println("10. Tim giam doc co co phan cao nhat");
        	System.out.println("11. Tinh va xuat thu nhap tung giam doc");
        	System.out.println("0. Thoat");


            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.print("Nhap ten cong ty: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap MST: ");
                    String mst = sc.nextLine();
                    System.out.print("Nhap doanh thu thang: ");
                    double dt = Double.parseDouble(sc.nextLine());
                    congTy.nhapThongTin(ten, mst, dt);
                    break;
                case 2:
                    System.out.print("Nhap ma nhan vien: ");
                    String maNV = sc.nextLine();
                    System.out.print("Nhap ma truong phong: ");
                    String maTP = sc.nextLine();

                    NhanVien nvTemp = congTy.timNhanVienTheoMa(maNV);
                    NhanVien tpTemp = congTy.timNhanVienTheoMa(maTP);

                    if (nvTemp instanceof NhanVienThuong && tpTemp instanceof TruongPhong) {
                        ((NhanVienThuong) nvTemp).setTruongPhong((TruongPhong) tpTemp);
                        ((TruongPhong) tpTemp).tangNhanVienDuoiQuyen();
                        System.out.println("Phan bo thanh cong.");
                    } else {
                        System.out.println("Phan bo that bai. Kiem tra lai ma NV va TP.");
                    }
                    break;
                case 3:
                    System.out.println("1. Them nhan su");
                    System.out.println("2. Xoa nhan su");
                    int luaChon = Integer.parseInt(sc.nextLine());
                    if (luaChon == 1) {
                        System.out.print("Chon loai nhan su (1: Nhan Vien Thuong, 2: Truong Phong, 3: Giam Doc): ");
                        int loai = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhap ma: ");
                        String ma = sc.nextLine();
                        System.out.print("Nhap ho ten: ");
                        String hoTen = sc.nextLine();
                        System.out.print("Nhap so dien thoai: ");
                        String sdt = sc.nextLine();
                        System.out.print("Nhap so ngay lam viec: ");
                        int soNgay = Integer.parseInt(sc.nextLine());

                        NhanVien nv = null;

                        if (loai == 1) {
                            nv = new NhanVienThuong(ma, hoTen, sdt, soNgay);
                        } else if (loai == 2) {
                            nv = new TruongPhong(ma, hoTen, sdt, soNgay);
                        } else if (loai == 3) {
                            System.out.print("Nhap ti le co phan: ");
                            double tiLe = Double.parseDouble(sc.nextLine());
                            nv = new GiamDoc(ma, hoTen, sdt, soNgay, tiLe);
                        }

                        if (nv != null) {
                            congTy.themNhanSu(nv);
                            System.out.println("Them nhan su thanh cong.");
                        }

                    } else if (luaChon == 2) {
                        System.out.print("Nhap ma nhan su can xoa: ");
                        String maXoa = sc.nextLine();
                        NhanVien nvXoa = congTy.timNhanVienTheoMa(maXoa);
                        if (nvXoa != null) {
                            congTy.danhSachNhanSu.remove(nvXoa);
                            System.out.println("Da xoa nhan su co ma: " + maXoa);
                        } else {
                            System.out.println("Khong tim thay nhan su co ma: " + maXoa);
                        }
                    }
                    break;
                case 4:
                    congTy.xuatThongTinNhanSu();
                    break;
                case 5:
                    System.out.println("Tong luong cong ty: " + congTy.tinhTongLuong());
                    break;
                case 6:
                    congTy.timNhanVienThuongLuongCaoNhat();
                    break;
                case 7:
                    congTy.timTruongPhongNhieuNhanVienNhat();
                    break;
                case 8:
                    congTy.sapXepTheoTenABC();
                    break;
                case 9:
                    congTy.sapXepTheoThuNhapGiamDan();
                    break;
                case 10:
                    congTy.timGiamDocCoCoPhanCaoNhat();
                    break;
                case 11:
                    congTy.tinhVaXuatThuNhapGiamDoc();
                    break;

                case 0:
                    return;
                default:
                    System.out.println("Dang phat trien...");
            }
        }
    }
}
