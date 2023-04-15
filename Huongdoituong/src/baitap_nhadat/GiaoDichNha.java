package baitap_nhadat;

import java.util.Scanner;

public class GiaoDichNha extends GiaoDich{
	protected String loaiNha;
	private int number;
	protected String diaChi;
	private double thanhTien;
	Scanner scanner=new Scanner(System.in);
	
	public GiaoDichNha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichNha(String loaiNha, int number, String diaChi) {
		super();
		this.loaiNha = loaiNha;
		this.number = number;
		this.diaChi = diaChi;
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public String kiemTraLoaiNha(int number) {
		switch(number) {
		case 0:
			loaiNha="Thường";
			break;
		case 1:
			loaiNha="Cao cấp";
			break;
		default:
			System.out.println("Gía trị nhập không đúng yêu cầu!");
			break;
		}
		return loaiNha;
	}
	
	public void nhapThongTinGiaoDich() {
		super.nhapThongTinGiaoDich();
		
		System.out.print("Địa chỉ: ");
		diaChi=scanner.nextLine();
		
		System.out.print("Loại nhà (0:thường/1:VIP): ");
		number=scanner.nextInt();
		
		kiemTraLoaiNha(number);
		
		
	}

	public String toString() {
		return super.toString()+", Địa chỉ: "+this.diaChi+", Loại nhà: "+this.kiemTraLoaiNha(number);
	}
	
}
