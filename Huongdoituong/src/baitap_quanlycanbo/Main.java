package baitap_quanlycanbo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CanBoTrongTruong> arrCanBoTrongTruongs=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		
		Locale LocalVN=new Locale("vi","VN");
		NumberFormat currencyVN=NumberFormat.getCurrencyInstance(LocalVN);

		int soCanBoTrongTruong,chon;
		CanBoTrongTruong canBoTrongTruong;
		long tongLuongPhaiTra=0;
		
		System.out.print("Nhập số lượng cán bộ trong trường: ");
		soCanBoTrongTruong=Integer.parseInt(scanner.nextLine());
		for(int i=0; i<soCanBoTrongTruong; i++) {
			System.out.print("Chọn loại cán bộ (0-GiangVien, 1-NhanVienHanhChinh): ");
			chon=scanner.nextInt();
			do {
				switch(chon) {
				case 0: 
					canBoTrongTruong=new GiangVien();
					canBoTrongTruong.nhapThongTinCanBo();
					arrCanBoTrongTruongs.add(canBoTrongTruong);
					break;
				case 1:
					canBoTrongTruong=new NhanVienHanhChinh();
					canBoTrongTruong.nhapThongTinCanBo();
					arrCanBoTrongTruongs.add(canBoTrongTruong);
					break;
				default:
					System.out.println("Gía trị nhập trong đoạn từ [0-1]. Xin mời nhập lại!");
					break;
				}
			}while(chon<0 || chon>1);
			
		}
		
		//Hiển thị thông tin cán bộ
		System.out.println("---------------> THÔNG TIN CÁN BỘ TRONG TRƯỜNG <------------------");
		for(CanBoTrongTruong cb : arrCanBoTrongTruongs) {
			System.out.println(cb.toString());
		}
		
		//Tổng lương phải trả 
		for(CanBoTrongTruong cb : arrCanBoTrongTruongs) {
			tongLuongPhaiTra+=cb.luong();
		}
		String str=currencyVN.format(tongLuongPhaiTra);
		System.out.println("Tổng lương phải trả cho cán bộ trong trường: "+str);
		

	}

}
