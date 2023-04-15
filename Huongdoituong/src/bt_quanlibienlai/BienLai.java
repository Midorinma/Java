package bt_quanlibienlai;

import java.util.Scanner;

public class BienLai {
	private int chiSoCu;
	private int chiSoMoi;
	private double soTienPhaiTra;
	private KhachHang khachHang;
	
	public BienLai() {
		super();
	}

	public BienLai(int chiSoCu, int chiSoMoi, int soTienPhaiTra, KhachHang khachHang) {
		super();
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
		this.soTienPhaiTra = soTienPhaiTra;
		this.khachHang = khachHang;
	}
	
	public void nhapBienLai() {
		Scanner scanner=new Scanner(System.in);
		khachHang=new KhachHang();
		
		khachHang.nhapThongTinKhachHang();
		do {
			System.out.print("Chỉ số cũ: ");
			chiSoCu=scanner.nextInt();
			
			System.out.print("Chỉ số mới: ");
			chiSoMoi=scanner.nextInt();
		}while(chiSoCu>chiSoMoi);
		
		soTienPhaiTra=(double)(chiSoMoi-chiSoCu)*750;
	}
	
	public void xuatBienLai() {
		khachHang.hienThiThongTinKhachHang();
		System.out.println("Chỉ số cũ: "+chiSoCu);
		System.out.println("Chỉ số mới: "+chiSoMoi);
		System.out.println("Thành tiền: "+soTienPhaiTra);
	}
	
	
	
	

}
