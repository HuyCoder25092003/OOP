package Class;
public class GiangVien extends HoVaTen {
	private int chon;
	private String hocHam;

	private String hocVi;

	private String nhiemVu;

	private double diem;

	private String nhanXet;

	public GiangVien() {

	}

	public GiangVien(String hoTen, String hocHam,String nhiemVu, double diem, String nhanXet,String hocVi) {
		super(hoTen);
		this.hocHam=hocHam;
		this.hocVi=hocVi;
		this.nhiemVu=nhiemVu;
		this.diem=diem;
		this.nhanXet=nhanXet;
	}
	@Override
	public void nhap() {
		System.out.println("Ten giao vien");
		super.nhap();
		System.out.println("Hoc ham");
		this.hocHam=sc.nextLine();
		System.out.println("Hoc vi");
		this.hocVi=sc.nextLine();
		System.out.println("Nhiem vu(1:Chủ tịch, 2:Thư kí , 3: Phản biện , 4: Ủy viên hội đồng ");
		do{
			switch (this.chon=sc.nextInt())
			{
				case 1:
					this.nhiemVu="Chủ tịch";
					break;
				case 2:
					this.nhiemVu="Thư kí";
					break;
				case 3:
					this.nhiemVu="Phản biện";
					break;
				case 4:
					this.nhiemVu="Ủy viên hội đồng";
					break;

				default:
					throw new IllegalStateException("Không có vai trò trên" );
			}
		}while(chon >=1 && chon <=4);
		System.out.println("Diem: ");
		this.diem=sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhan xet GV");
		this.nhanXet=sc.nextLine();
	}

	public void xuat() {
		System.out.printf("Giang vien: %s\nHoc ham: %s\nHoc vi: %s\nNhiem vu: %s\nDiem :%.1f\nNhan xet gv: %s\n",
				this.getTen(),this.hocHam,this.hocVi,this.nhiemVu,this.diem,this.nhanXet);
	}


	public String getHocHam() {
		return hocHam;
	}

	public void setHocHam(String hocHam) {
		this.hocHam = hocHam;
	}

	public String getHocVi() {
		return hocVi;
	}

	public void setHocVi(String hocVi) {
		this.hocVi = hocVi;
	}

	public String getNhiemVu() {
		return nhiemVu;
	}

	public void setNhiemVu(String nhiemVu) {
		this.nhiemVu = nhiemVu;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public String getNhanXet() {
		return nhanXet;
	}

	public void setNhanXet(String nhanXet) {
		this.nhanXet = nhanXet;
	}
}
