package thongtinsinhvien;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SinhVien> arrSinhVien;
		
		arrSinhVien=new ArrayList<>();	
			arrSinhVien.add(new SinhVien(17110021,"Vũ Quang Duy", 5.5f, 7.6f));
			arrSinhVien.add(new SinhVien(1524001,"Phạm Thị Thu Trang",8.0f, 7.5f));
			arrSinhVien.add(new SinhVien(1520071,"Phạm Văn Thắng", 7.6f, 9.0f));
			
		
		
		System.out.printf("%5s %10s %23s %10s %13s\n","Masv","HoTen","DiemLT","DiemTH","DiemTB");
		for(int i=0; i<arrSinhVien.size(); i++) {
			arrSinhVien.get(i).inSV();
		}
	
		
		
		
		

	}

}
