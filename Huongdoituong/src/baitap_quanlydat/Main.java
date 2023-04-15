package baitap_quanlydat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose;
		Scanner scanner=new Scanner(System.in);
		ArrayList<MiengDat> arrMiengDats=new ArrayList<>();
		MiengDat miengDat;
		
		System.out.print("Nhập số lượng miếng đất: ");
		int soMiengDat=scanner.nextInt();
		
		for(int i=0; i<soMiengDat; i++) {
			System.out.println("Nhập thông tin miếng đất thứ "+(i+1)+" : ");
			System.out.println("Chọn hình dạng miếng đất (0-Đất hình chữ nhật "+", 1-Đất hình thang, 2-Đất hình tam giác: ");
			choose=scanner.nextInt();
			switch(choose) {
			case 0:
				miengDat=new HinhChuNhat();
				miengDat.nhapThongTinMiengDat();
				arrMiengDats.add(miengDat);
				break;
			case 1:
				miengDat=new HinhThang();
				miengDat.nhapThongTinMiengDat();
				arrMiengDats.add(miengDat);
				break;
			case 2:
				miengDat=new HinhTamGiac();
				miengDat.nhapThongTinMiengDat();
				arrMiengDats.add(miengDat);
				break;
			default:
				System.out.println("Bạn nhập không đúng. Mời nhập lại!");
				break;
			}
		}
		
		System.out.println("Hiển thị thông tin những miếng đất của công ty");
		for(MiengDat dat: arrMiengDats) {
			System.out.println(dat.toString());
		}
		
		//tính tổng diện tích các miếng đất
		double tongDienTich=0;
		for(MiengDat dat : arrMiengDats) {
			tongDienTich+=dat.tinhDienTich();
		}
		System.out.println("Tổng diện tích các miếng đất "+tongDienTich);
		
		//tính tổng giá tiền các miếng đất
		long tongGiaTien=0;
		for(MiengDat dat : arrMiengDats) {
			tongGiaTien+=dat.thanhTien();
		}
		System.out.println("Tổng giá tiền các miếng đất "+tongGiaTien);
		
	
		
		

	}

}
