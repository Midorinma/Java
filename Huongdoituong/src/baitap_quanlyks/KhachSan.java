package baitap_quanlyks;

import java.util.Scanner;

public class KhachSan {
	private int soNgayTro;
	private String loaiPhong;
	private double giaPhong;
	private Nguoi nguoi;
	
	/*
	 * Trong lớp KhachSan tôi có dòng code private Nguoi nguoi;,
	 *  công dụng của dòng này sẽ tạo ra 1 thuộc tính của lớp KhachSan có kiểu Nguoi
	 *  (tức là thuộc tính này có thể sử dụng được các phương thức được khai báo là public có trong lớp Nguoi 
	 *  đó là các phương thức nhập và hiển thị thông tin của 1 người).

		Trong lớp Test tôi có dòng code ArrayList<KhachSan> arrKhachSan = new ArrayList<>();, 
		dòng này sẽ tạo ra 1 ArrayList lưu trữ các thông tin của khách sạn.
	 */
	public KhachSan() {
		super();
	}
	
	public KhachSan(int soNgayTro, String loaiPhong, double giaPhong, Nguoi nguoi) {
		super();
		this.soNgayTro = soNgayTro;
		this.loaiPhong = loaiPhong;
		this.giaPhong = giaPhong;
		this.nguoi = nguoi;
	}
	
	public Nguoi getNguoi() {
		return nguoi;
	}

	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}

	public void nhapThongTinCanQuanLy() {
		Scanner scanner=new Scanner(System.in);
		
		//Nhập thông tin khách trọ
		nguoi=new Nguoi();
		nguoi.nhapThongTinKhachTro();
		
		System.out.print("Nhập số ngày trọ: ");
		soNgayTro=Integer.parseInt(scanner.nextLine());
		
		System.out.print("Nhập loại phòng: ");
		loaiPhong=scanner.nextLine();
		
		System.out.println("Nhập giá phòng: ");
		giaPhong=scanner.nextDouble();
	}
	
	public void hienThiThongTinCanQuanLy() {
		nguoi.hienThiThongTinKhachTro();
		
		System.out.print("Số ngày trọ: "+soNgayTro);
		System.out.print("Loại phòng: "+loaiPhong);
		System.out.print("Gía phòng: "+giaPhong);
	}
	
	public double tinhTien() {
		return soNgayTro*giaPhong;
	}

}
