package Class;
import java.text.ParseException;
import java.util.Date;
import static Class.HoVaTen.sc;
public class BaoCaoThucTapTotNghiep extends BaoCao {

	private String danhGia;

	public BaoCaoThucTapTotNghiep() {

	}

	public BaoCaoThucTapTotNghiep(String maBaoCao, String tenBaoCao, String chuoiLink, Date ngayBaoCao, String tenGVHD, NhomSinhVien ds, String danhGia) {
		super(maBaoCao, tenBaoCao, chuoiLink, ngayBaoCao, tenGVHD, ds);
		this.danhGia=danhGia;
	}
	@Override
	public void themBaoCao() throws ParseException {
		super.themBaoCao();
		System.out.println("Danh gia doanh nghiep");
		this.danhGia=sc.nextLine();
	}

	public void updateBC() {

	}

	public void quanLyDiem() {

	}

	public void xoaBC(String maBaoCao) {

	}

	public String layMa() {
		return null;
	}

	public String layTen() {
		return null;
	}

	public String toString() {
		return null;
	}

	public String getDanhGia() {
		return null;
	}

	public void setDanhGia(String danhGia) {

	}

}
