package bt_tuongtacvoicacloaihinhhoc;

import java.util.ArrayList;

public class DanhSachHinh {
	ArrayList<HinhHoc> arrHinhHoc;

	public DanhSachHinh() {
		super();
		// TODO Auto-generated constructor stub
		arrHinhHoc=new ArrayList<>();
		/*
		 * Tạo hàm tạo mặc định để khởi tạo ArrayList và thêm vào 3 hình bất kỳ được xác định trước 
		 * (không nhập từ bàn phím, gồm cả 2 loại hình).
		 */
		arrHinhHoc.add(new HinhChuNhat(7,3));
		arrHinhHoc.add(new HinhTron(3));
		arrHinhHoc.add(new HinhChuNhat(10,1));
	}
	
	public void themHinh(HinhHoc hinhHoc) {
		arrHinhHoc.add(hinhHoc);
	}
	
	public void hienThiDanhSachHinh() {
		for(int i=0; i<arrHinhHoc.size(); i++) {
			System.out.println(arrHinhHoc.get(i).toString());
		}
	}
	
	public int demSoHinhChuNhat() {
		int soHinhChuNhat=0;
		//Khởi tạo đối tượng có kiểu trả về là HinhHoc để truy cập Arraylist 
		for(HinhHoc hinhHoc : arrHinhHoc) {
			//Phương thức instance of so sánh một đối tượng có nằm trong lớp đó hay không và trả về trị true false
			if(hinhHoc instanceof HinhChuNhat) {
				soHinhChuNhat++;
			}
		}
		return soHinhChuNhat;
	}
	
	public void hienThiHinhChuNhatCoDienTichLonNhat() {
		double temp=0;
		HinhChuNhat hinhChuNhat=new HinhChuNhat();
		for(HinhHoc hinhHoc : arrHinhHoc) {
			if(hinhHoc instanceof HinhChuNhat) {
				if(temp<hinhHoc.tinhDienTich()) {
					temp=hinhHoc.tinhDienTich();
					hinhChuNhat=(HinhChuNhat) hinhHoc;
				}
			}
		}
		System.out.println("Hình chữ nhật có diện tích lớn nhất là: "+hinhChuNhat.toString());
	}
	


}
