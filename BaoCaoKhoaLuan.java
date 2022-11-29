package Class;

import java.util.ArrayList;
import java.util.List;

public class BaoCaoKhoaLuan extends BaoCaoDoAnNganh {

	private List<GiangVien> DanhSachThanhVienHoiDong=new ArrayList<>();

	private String danhGiaGiangVienPhanBien;

	public BaoCaoKhoaLuan() {

	}

	public BaoCaoKhoaLuan(String maBaoCao, String tenBaoCao, String chuoiLink, Date ngayBaoCao, String tenGVHD, int dsSinhVien, double tyLeDaoVan) {

	}

	public void themBaoCao() {

	}

	public void updateBC() {

	}

	public void nhapHoiDong() {

	}

	public void xuatHoiDong() {

	}

	public void ganGV() {

	}

	public String layMa() {
		return null;
	}

	public void quanLiDiem() {

	}

	public String layTen() {
		return null;
	}

	public String toString() {
		return null;
	}

	public void xuatHD() {

	}


	public List<GiangVien> getDanhSachThanhVienHoiDong() {
		return DanhSachThanhVienHoiDong;
	}

	public void setDanhSachThanhVienHoiDong(List<GiangVien> danhSachThanhVienHoiDong) {
		DanhSachThanhVienHoiDong = danhSachThanhVienHoiDong;
	}

	public String getDanhGiaGiangVienPhanBien() {
		return danhGiaGiangVienPhanBien;
	}

	public void setDanhGiaGiangVienPhanBien(String danhGiaGiangVienPhanBien) {
		this.danhGiaGiangVienPhanBien = danhGiaGiangVienPhanBien;
	}
}
