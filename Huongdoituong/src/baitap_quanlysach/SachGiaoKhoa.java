package baitap_quanlysach;

public class SachGiaoKhoa extends Sach{
	private int number;
	private String tinhTrang;
	private double thanhTien;
	
	
	public SachGiaoKhoa() {
		super();
		
	}

	public SachGiaoKhoa(int number, String tinhTrang) {
		super();
		this.number = number;
		this.tinhTrang = tinhTrang;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	
	public String tinhTrangSach(int number) {
		switch (number) {
		case 0: 
			tinhTrang="Cũ";
			break;
		case 1:
			tinhTrang="Mới";
			break;
		default:
			break;
		}
		return tinhTrang;
	}
	
	public void nhapThongTinSach() {
		super.nhapThongTinSach();
		do {
			
			System.out.print("Tình trạng(1:mới/0:Cũ):");
			number=scanner.nextInt();
			
			if(number>1 || number<0) {
				System.out.println("Tình trạng sách nhập vào không hợp lệ! xin kiểm tra lại.");
			}
			
		}while(number>1 || number<0);
		tinhTrangSach(number);
		
	}
	
	public String toString() {
		return super.toString()+", Tình trạng: "+this.tinhTrangSach(number);
	}

}
