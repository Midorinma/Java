package quanlycanbo;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
	int soCanBo;
	Scanner scanner=new Scanner(System.in);
	ArrayList<CanBo> cb=new ArrayList<>();
	//Thêm mới cán bộ
	public void them(CanBo canBo) {
		cb.add(canBo);
	}
	
	//Hiển thị thông tin danh sách cán bộ
	public void hienThi() {
		for(int i=0; i<cb.size(); i++) {
			System.out.println("Stt: "+(i+1)+"-Cán bộ");
			System.out.println(cb.get(i).toString());
		}
	}
	
	//Tìm kiếm theo họ tên
	public void timKiem() {
		String timKiem;
		System.out.print("Nhập họ tên cần tìm kiếm: ");
		timKiem=scanner.nextLine();
		for(int i=0; i<cb.size(); i++) {
			if(cb.get(i).getHoTen().equalsIgnoreCase(timKiem)) {
				System.out.println(cb.get(i).toString());
			}
		}
		
	}
	
	

}
