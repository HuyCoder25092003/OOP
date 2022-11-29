package Class;

import java.text.ParseException;

import static Class.Date.f;
import static Class.HoVaTen.sc;
import java.util.Date;
public abstract class BaoCao {

	private String maBaoCao;

	private String tenBaoCao;

	private String chuoiLink;

	private Date ngayBaoCao;

	private String tenGVHD;

	private double diemBaoCao;
	private int dem;
	private int chon;
	private NhomSinhVien ds;
	{
		maBaoCao=String.format("%06d",++dem);
	}
	public BaoCao() {

	}

	public BaoCao(String tenBaoCao, String chuoiLink, String tenGVHD, NhomSinhVien ds, double diemBaoCao, Date ngayBaoCao) {
		this.chuoiLink=chuoiLink;
		this.tenGVHD=tenGVHD;
		this.ds=ds;
		this.diemBaoCao=diemBaoCao;
		this.ngayBaoCao=ngayBaoCao;
	}

	public BaoCao(String maBaoCao, String tenBaoCao, String chuoiLink, Date ngayBaoCao, String tenGVHD, NhomSinhVien ds) {
		this.maBaoCao=maBaoCao;
		this.tenBaoCao=tenBaoCao;
		this.chuoiLink=chuoiLink;
		this.ngayBaoCao=ngayBaoCao;
		this.tenGVHD=tenGVHD;
		this.ds=ds;
	}

	public void themBaoCao() throws ParseException {
		ds.nhapNhomSinhVien();
		System.out.println("Tên báo cáo");
		this.tenBaoCao=sc.nextLine();
		System.out.println("Chuỗi Link");
		this.chuoiLink=sc.nextLine();
		sc.nextLine();
		System.out.println("Ngay bao cao");
		this.ngayBaoCao=f.parse(sc.nextLine());
	}
	public void ganGV() {
		System.out.println("Giáo viên hướng dẫn");
		this.tenGVHD=sc.nextLine();
	}
	public void quanLiDiem(){
		System.out.println("Điểm báo cảo");
		this.diemBaoCao=sc.nextDouble();
	}
	public void updateBC() throws ParseException {
		do{
			System.out.println("Menu update");
			System.out.println("1:Update Ten bao cao");
			System.out.println("2:Update Chuoi Link");
			System.out.println("3:Update diểm báo cáo");
			System.out.println("4:Update ngay bao cao");
			System.out.println("5:Update ten giao vien huong dan");
			System.out.println("6: Update hết");
			System.out.println("Chon 1 trong 4 chuc nang tren");
			switch (this.chon=sc.nextInt())
			{
				case 1:
					System.out.println("Ten bao cao ");
					this.tenBaoCao=sc.nextLine();
					break;
				case 2:
					System.out.println("Chuoi link");
					this.chuoiLink=sc.nextLine();
					break;
				case 3:
					quanLiDiem();
					break;
				case 4:
					System.out.println("Ngay bao cao");
					this.ngayBaoCao=f.parse(sc.nextLine());
					break;
				case 5:
					ganGV();
					break;
				case 6:
					themBaoCao();
					ganGV();
					break;
				default:
					throw new IllegalStateException("Không có chức năng trên");
			}
		}while (chon >=1 && chon <=6);
	}

	public String getMaBaoCao() {
		return maBaoCao;
	}

	public void setMaBaoCao(String maBaoCao) {
		this.maBaoCao = maBaoCao;
	}

	public String getTenBaoCao() {
		return tenBaoCao;
	}

	public void setTenBaoCao(String tenBaoCao) {
		this.tenBaoCao = tenBaoCao;
	}

	public String getChuoiLink() {
		return chuoiLink;
	}

	public void setChuoiLink(String chuoiLink) {
		this.chuoiLink = chuoiLink;
	}

	public Date getNgayBaoCao() {
		return ngayBaoCao;
	}

	public void setNgayBaoCao(Date ngayBaoCao) {
		this.ngayBaoCao = ngayBaoCao;
	}

	public String getTenGVHD() {
		return tenGVHD;
	}

	public void setTenGVHD(String tenGVHD) {
		this.tenGVHD = tenGVHD;
	}

	public double getDiemBaoCao() {
		return diemBaoCao;
	}

	public void setDiemBaoCao(double diemBaoCao) {
		this.diemBaoCao = diemBaoCao;
	}


	public NhomSinhVien getDs() {
		return ds;
	}

	public void setDs(NhomSinhVien ds) {
		this.ds = ds;
	}

}
