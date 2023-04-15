package nhapxuatthongtinxe;

import java.util.Scanner;

public class Vehicle {
	//Sử dụng private để đảm bảo tính đóng gói trong OOP
	private String maXe;
	private double triGiaXe;
	private int dungTichXiLanh;
	private String chuXe;
	private String moTa;
	Scanner scanner=new Scanner(System.in);
	

	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String maXe, double triGiaXe, int dungTichXiLanh, String chuXe, String moTa) {
		super();
		this.maXe = maXe;
		this.triGiaXe = triGiaXe;
		this.dungTichXiLanh = dungTichXiLanh;
		this.chuXe = chuXe;
		this.moTa = moTa;
	}
	
	public double getTriGiaXe() {
		return triGiaXe;
	}

	public void setTriGiaXe(long triGiaXe) {
		this.triGiaXe = triGiaXe;
	}

	public int getDungTichXiLanh() {
		return dungTichXiLanh;
	}

	public void setDungTichXiLanh(int dungTichXiLanh) {
		this.dungTichXiLanh = dungTichXiLanh;
	}
	
	public String getMaXe() {
		return maXe;
	}

	public void setMaXe(String maXe) {
		this.maXe = maXe;
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	public double thuePhaiDong() {
		double thue;
		if(this.dungTichXiLanh<100) {
			 thue=0.01*this.triGiaXe;
		}
		else if(this.dungTichXiLanh>=100 && this.dungTichXiLanh<=200) {
			thue=0.03*this.triGiaXe;
		}
		else {
			thue=0.05*this.triGiaXe;
		}
		return thue;
	}
	
	public void nhapThongTinXe() {
		System.out.print("Mã xe: ");
		maXe=scanner.nextLine();
		System.out.print("Chủ xe: ");
		chuXe=scanner.nextLine();
		System.out.print("Mô tả: ");
		moTa=scanner.nextLine();
		System.out.print("Trị giá xe: ");
		triGiaXe=scanner.nextDouble();
		System.out.print("Dung tích xi lanh: ");
		dungTichXiLanh=scanner.nextInt();
	}
	
	public void outPut() {
		System.out.printf("%5s %5s %8s %10.2f %10d %10.3f \n",maXe,chuXe,moTa,triGiaXe,dungTichXiLanh,thuePhaiDong());
	}
	
	/*@Override
	public String toString() {
		return "Mã xe: "+this.maXe+", Chủ xe: "+this.chuXe+", Trị giá xe = "+this.triGiaXe+", Dung Tích xilanh = "+this.dungTichXiLanh+
				", Mô tả: "+this.moTa+", Thuế phải trả: "+thuePhaiDong();
	}*/

	
	
	

}
