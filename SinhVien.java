package Class;
public class SinhVien extends HoVaTen {

	private String maSV;

	private String khoaHoc;

	private String gioiTinh;

	private int namSinh;
	private int dem;
	private String chuyenNganh;
	{
		setMaSV(String.format("%06%d",++dem));
	}

	public SinhVien() {

	}
	public SinhVien(String hoTen, String khoaHoc, String gioiTinh, int namSinh, String chuyenNganh) {
		super(hoTen);
		this.khoaHoc=khoaHoc;
		this.gioiTinh=gioiTinh;
		this.namSinh=namSinh;
		this.chuyenNganh=chuyenNganh;
	}
	@Override
	public void nhap() {
		System.out.println("Ho ten");
		super.nhap();
		System.out.println("Khoa hoc");
		this.khoaHoc=sc.nextLine();
		System.out.println("Gioi tinh");
		this.gioiTinh=sc.nextLine();
		System.out.println("Nam sinh");
		this.namSinh=sc.nextInt();
		sc.nextLine();
		System.out.println("Chuyen nganh");
		this.chuyenNganh=sc.nextLine();
	}


	public void hienThiSinhVien(){
		System.out.printf("Ho va ten: %s\nKhoa hoc: %s\nGioi tinh: %s\nNam sinh: %d\nChuyen nganh: %s\n",
				super.getTen(),this.khoaHoc,this.gioiTinh,this.namSinh,this.chuyenNganh);
	}

	public String getKhoaHoc() {
		return khoaHoc;
	}

	public void setKhoaHoc(String khoaHoc) {
		this.khoaHoc = khoaHoc;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
}
