package baitap_nhadat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		//Tạo DSLK để lưu thông tin giao dịch
		ArrayList<GiaoDichDat> ggd=new ArrayList<>();
		ArrayList<GiaoDichNha> ggn=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		int soLanGiaoDichDat,soLanGiaoDichNha;
		long thanhTienGDD=0,thanhTienGDN=0;
		long trungBinhThanhTien;
		System.out.print("Số lần giao dịch đất: ");
		soLanGiaoDichDat=scanner.nextInt();
		System.out.print("Số lần giao dịch nhà: ");
		soLanGiaoDichNha=scanner.nextInt();
		
		//Nhận thông tin giao dich dat
		System.out.println("--> Thông tin giao dịch đất.");
		for(int i=0; i<soLanGiaoDichDat; i++) {
			GiaoDichDat giaoDichDat=new GiaoDichDat();
			System.out.println("Số lần giao dịch đất thứ "+(i+1)+" : ");
			giaoDichDat.nhapThongTinGiaoDich();
			ggd.add(giaoDichDat);
		}
		
		//Thành tiền giao dịch đất
		for(int i=0; i<ggd.size(); i++) {
			if(ggd.get(i).getLoaiDat().equalsIgnoreCase("B") || ggd.get(i).getLoaiDat().equalsIgnoreCase("C")) {
				thanhTienGDD+=ggd.get(i).getDienTich()*ggd.get(i).getDonGia();
			}
			else if(ggd.get(i).getLoaiDat().equalsIgnoreCase("A")) {
				thanhTienGDD+=ggd.get(i).getDienTich()*ggd.get(i).getDonGia()*1.5;
			}
		}
		
		//Nhận thông tin giao dịch nhà
		System.out.println("--> Thông tin giao dịch nhà.");
		for(int j=0; j<soLanGiaoDichNha; j++) {
			GiaoDichNha giaoDichNha=new GiaoDichNha();
			System.out.println("Số lần giao dịch nhà thứ "+(j+1)+" : ");
			giaoDichNha.nhapThongTinGiaoDich();
			ggn.add(giaoDichNha);
		}
		
		//Thành tiền giao dịch nhà
		for(int j=0; j<ggn.size(); j++) {
			if(ggn.get(j).getNumber()==1) {
				thanhTienGDN+=ggn.get(j).getDienTich()*ggn.get(j).getDonGia();
			}
			if(ggn.get(j).getNumber()==0) {
				thanhTienGDN+=ggn.get(j).getDienTich()*ggn.get(j).getDonGia()*90/100;
			}
		}
		
		//Hiển thị thông tin giao dịch đất
		System.out.println("--------> Thông tin giao dịch đất <--------");
		for(int i=0; i<ggd.size(); i++) {
			System.out.println("Danh sách giao dịch đất thứ "+(i+1)+" : ");
			System.out.println(ggd.get(i).toString());
		}
		
		System.out.println("Thành tiền giao dịch đất: "+thanhTienGDD);
		trungBinhThanhTien=(long)thanhTienGDD/ggd.size();
		System.out.println("Trung bình thành tiền của giao dịch đất: "+trungBinhThanhTien);
		
		//Hiển thị thông tin giao dịch nhà
		System.out.println("-------> Thông tin giao dịch nhà <------");
		for(int j=0; j<ggn.size(); j++) {
			System.out.println("Danh sách giao dịch nhà thứ "+(j+1)+" : ");
			System.out.println(ggn.get(j).toString());
		}
		System.out.println("Thành tiền giao dịch nhà: "+thanhTienGDN);
		
		//xuất ra các giao dịch đất của tháng 9 năm 2013
		System.out.println("Các giao dịch đất của tháng 9 năm 2013");
		for(int i=0; i<ggd.size(); i++) {
			String dateGiaoDichDat[]=ggd.get(i).getNgayGiaoDich().split("/");
				if(dateGiaoDichDat[1].equals("9") && dateGiaoDichDat[2].equals("2013")) {
					System.out.println(ggd.get(i).toString());
				}
		}
		
		//Xuất ra các giao dịch nhà của tháng 9 năm 2013
		System.out.println("Các giao dịch nhà của tháng 9 năm 2013");
		for(int j=0; j<ggn.size(); j++) {
			String dateGiaoDichNha[]=ggn.get(j).getNgayGiaoDich().split("/");
			if(dateGiaoDichNha[1].equals("9") && dateGiaoDichNha[2].equals("2013")) {
				System.out.println(ggn.get(j).toString());
			}
		}
		

	}

}
