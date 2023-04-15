package bt_quanlibienlai;

import java.util.Scanner;

public class KhachHang {
	private String hoTenChuHo;
	private String soNha;
	private int maSoCongTo;
	
	public KhachHang() {
		super();
	}

	public KhachHang(String hoTenChuHo, String soNha, int maSoCongTo) {
		super();
		this.hoTenChuHo = hoTenChuHo;
		this.soNha = soNha;
		this.maSoCongTo = maSoCongTo;
	}
	
	public void nhapThongTinKhachHang() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Họ và tên chủ hộ: ");
		hoTenChuHo=scanner.nextLine();
		
		System.out.print("Số nhà: ");
		soNha=scanner.nextLine();
		
		System.out.print("Mã số công tơ: ");
		maSoCongTo=Integer.parseInt(scanner.nextLine());
		
	}
	
	public void hienThiThongTinKhachHang() {
		System.out.println("Họ và tên chủ hộ: "+hoTenChuHo);
		System.out.println("Số nhà: "+soNha);
		System.out.println("Mã số công tơ: "+maSoCongTo);
	
	}
	
	
	
	

}
