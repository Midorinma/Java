package baitap_quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Tạo danh sách Arraylist có kiểu trả về là SGK VÀ Sách tham khảo
		ArrayList<SachGiaoKhoa> sgk=new ArrayList<>();
		ArrayList<SachThamKhao> stk=new ArrayList<>();
		int soSachGiaoKhoa,soSachThamKhao;
		double thanhTienSGK=0,thanhTienSTK=0,tongsgk=0,tongstk=0,trungBinhcongsgk=0,trungbinhcongstk=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Nhập vào số sách giáo khoa: ");
		soSachGiaoKhoa=scanner.nextInt();
		System.out.print("Nhập vào số sách tham khảo: ");
		soSachThamKhao=scanner.nextInt();
		
		System.out.println("Nhập thông tin SGK: ");
		for(int i=0; i<soSachGiaoKhoa; i++) {
			SachGiaoKhoa sachGiaoKhoa=new SachGiaoKhoa();
			System.out.println("Số sách giáo khoa thứ "+(i+1)+" : ");
			sachGiaoKhoa.nhapThongTinSach();
			
			sgk.add(sachGiaoKhoa);
		}
		
		//Thành tiền sgk
		for(int i=0; i<sgk.size(); i++) {
			if(sgk.get(i).getNumber()==0) {
				thanhTienSGK+=sgk.get(i).getSoLuong()*sgk.get(i).getDonGia()*50/100;
			}
			else if(sgk.get(i).getNumber()==1){
				thanhTienSGK+=sgk.get(i).getSoLuong()*sgk.get(i).getDonGia();
			}
		}
		
		System.out.println("Nhập thông tin Sách tham khảo: ");
		for(int j=0; j<soSachThamKhao; j++) {
			SachThamKhao sachThamKhao=new SachThamKhao();
			System.out.println("Số sách tham khảo thứ "+(j+1)+" : ");
			
			sachThamKhao.nhapThongTinSach();
			stk.add(sachThamKhao);
		}
		
		//Thành tiền stk
		for(int i=0; i<stk.size(); i++) {
			thanhTienSTK+=stk.get(i).getSoLuong()*stk.get(i).getDonGia()+stk.get(i).getThue();
		}
		
		System.out.println("-----------> Thông tin sách giáo khoa <-----------");
		for(int i=0; i<sgk.size(); i++) {
			System.out.println(sgk.get(i).toString());
		}
		System.out.println("Tổng tiền Sách giáo khoa: "+thanhTienSGK);
		
		
		System.out.println("----------> Thông tin sách tham khảo <-------------");
		for(int j=0; j<stk.size(); j++) {
			System.out.println(stk.get(j).toString());
			
		}
		System.out.println("Tổng tiền Sách tham khảo: "+thanhTienSTK);
		
		
		System.out.println("------> Trung bình cộng đơn giá các sách tham khảo <-------");
		for(int i=0; i<stk.size(); i++) {
			tongstk+=stk.get(i).getDonGia();
			trungbinhcongstk=tongstk/stk.size();
		}
		System.out.println("Trung bình cộng đơn giá Sách tham khảo="+trungbinhcongstk);
		
		System.out.println("-------> Các sách giáo khoa của nhà xuất bản X <-------");
		for(int i=0; i<sgk.size(); i++) {
			
			if(sgk.get(i).nhaXuatBan.equalsIgnoreCase("X")) {
				System.out.println(sgk.get(i).toString());
			}
		}

	}

}
