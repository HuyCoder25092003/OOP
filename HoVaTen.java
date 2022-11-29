package Class;

import java.util.Scanner;

public class HoVaTen {
	protected static final Scanner sc = new Scanner(System.in);
	private String ten;
	public HoVaTen(){

	}
	public HoVaTen(String ten){
		this.ten=ten;
	}
	public void nhap() {
		this.ten=sc.nextLine();
	}


	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
}
