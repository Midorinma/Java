package bt_quanlynhanvienphanmem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<NhanVien> arrNhanViens=new ArrayList<>();
		NhanVien nhanVien;
		Scanner scanner=new Scanner(System.in);
		int soNhanVien,chon;
		long tongLuong=0,soLuongTrungBinh;
		
		System.out.print("Nhập số lượng nhân viên trong công ty: ");
		soNhanVien=scanner.nextInt();
		for(int i=0; i<soNhanVien; i++) {
			System.out.print("Nhập (1:Lập trình viên/2:Kiểm chứng viên): ");
			chon=scanner.nextInt();
			do {
				switch(chon) {
				case 1:
					nhanVien=new LapTrinhVien();
					nhanVien.nhapThongTinNhanVien();
					arrNhanViens.add(nhanVien);
					break;
				case 2:
					nhanVien=new KiemChungVien();
					nhanVien.nhapThongTinNhanVien();
					arrNhanViens.add(nhanVien);
					break;
				default:
					System.out.println("Gía trị nhập không hợp lệ! vui lòng kiểm tra lại.");
					break;
				}
			}while(chon<1 || chon>2);
		}
		
		System.out.println("---------------> THÔNG TIN NHÂN VIÊN TRONG CÔNG TY <-----------------");
		for(NhanVien nv : arrNhanViens) {
			System.out.println(nv.toString());
			System.out.println();
		}
		
		//Tính mức lương trung bình
		for(NhanVien nv : arrNhanViens) {
			tongLuong+=nv.luong();
		}
		soLuongTrungBinh=tongLuong/soNhanVien;
		
		System.out.println("Danh sách nhân viên có lương thấp hơn mức lương trung bình");
		for(int i=0; i<arrNhanViens.size(); i++) {
			if(arrNhanViens.get(i).luong()<soLuongTrungBinh) {
				System.out.println(arrNhanViens.get(i).toString());
			}
		}
		
		
		

	}

}
