package Class;
import java.text.ParseException;
import java.util.Date;
import static Class.Date.f;
import static Class.HoVaTen.sc;

public class BaoCaoDoAnNganh extends BaoCao {

	private double tyLeDaoVan;

	public BaoCaoDoAnNganh() {

	}

	public BaoCaoDoAnNganh(String maBaoCao, String tenBaoCao, String chuoiLink, Date ngayBaoCao, String tenGVHD, NhomSinhVien ds, double tyLeDaoVan) {
		super(maBaoCao, tenBaoCao, chuoiLink, ngayBaoCao, tenGVHD, ds);
		this.tyLeDaoVan=tyLeDaoVan;
	}

	@Override
	public void themBaoCao() throws ParseException {
		super.themBaoCao();
		System.out.println("Ty le dao van");
		this.tyLeDaoVan=sc.nextDouble();
	}
	@Override
	public void quanLiDiem(){
		super.quanLiDiem();
	}
	@Override
	public void updateBC() throws ParseException {
		super.updateBC();
		System.out.println("Ty le dao van moi");
		this.tyLeDaoVan=sc.nextDouble();
	}
	public void xuatBaoCao(){
		System.out.printf("Cac sinh vien tham gia\nTen bao cao: %s\nChuoi link: %s\nNgay bao cao: %s\n Ten GVHD: %s\nDiem: %.1f\nTy le dao van: %.1f\n"
						,getDs(),getTenBaoCao(),getChuoiLink(),getNgayBaoCao(),getTenGVHD(),getDiemBaoCao(),this.tyLeDaoVan);
	}

	public double getTyLeDaoVan() {
		return tyLeDaoVan;
	}

	public void setTyLeDaoVan(double tyLeDaoVan) {
		this.tyLeDaoVan = tyLeDaoVan;
	}
}
