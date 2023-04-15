package baitap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HocSinh {
	
	//Khai báo thuộc tính
	public String hoTen,lop;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	private double tb=0.0d;
	
	//Khai báo phương thức
	public void nhap() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Họ tên SV: ");
		hoTen=scanner.nextLine();
		System.out.print("Lớp: ");
		lop=scanner.nextLine();
		System.out.print("Điểm toán: ");
		diemToan=scanner.nextDouble();
		System.out.print("Điểm lý: ");
		diemLy=scanner.nextDouble();
		System.out.print("Điểm hóa: ");
		diemHoa=scanner.nextDouble();
	}
	
	double trungBinh(double diemToan, double diemLy, double diemHoa) {
		double tong=0.0d;
		tong=diemToan+diemLy+diemHoa;
		tb=tong/3;
		return tb;
	}
	
	public void xepLoai(double tb) {
		String xl="";
		if(tb>=8.0) {
			xl="Giỏi";
		}
		else if(tb>=6.5) {
			xl="Khá";
		}
		else if(tb>=5.0) {
			xl="Trung bình.";
		}
		else{
			xl="Yếu";
		}
		System.out.println("Xếp loại: "+xl);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat dcf=new DecimalFormat("#.##");
		HocSinh hocsinh=new HocSinh();
		hocsinh.nhap();
		double b=hocsinh.trungBinh(hocsinh.diemToan, hocsinh.diemLy, hocsinh.diemHoa);
		System.out.println("Điểm trung bình: "+dcf.format(b));
		hocsinh.xepLoai(hocsinh.tb);
		
		
		
		

	}

}
