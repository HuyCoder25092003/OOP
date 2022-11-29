package Class;


import java.util.ArrayList;
import java.util.List;

import static Class.HoVaTen.sc;

public class NhomSinhVien {
	private int min=1;
	private int max=2;
	private List<SinhVien> svThamGia = new ArrayList<>();

	public void nhapNhomSinhVien() {
		System.out.println("So luong sinh vien tham gia");
		int n;
		do{
			n=sc.nextInt();
			if(n< min || n> max)
				System.out.println("Vui long nhap lai so luong");
		}while( n< min || n> max);
		for(int i=0;i<n;i++){
			System.out.printf("Sinh vien %d\n:",i++);
			SinhVien s= new SinhVien();
			s.nhap();
			this.getSvThamGia().add(s);
		}
	}

	public void xuatNhomSinhVien() {
		this.svThamGia.forEach(s->s.hienThiSinhVien());
	}

	public List<SinhVien> getSvThamGia() {
		return svThamGia;
	}

	public void setSvThamGia(List<SinhVien> svThamGia) {
		this.svThamGia = svThamGia;
	}
}
