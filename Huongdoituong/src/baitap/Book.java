package baitap;

import java.util.ArrayList;
import java.util.Scanner;
//Đối tượng sách
public class Book {
	//Thuộc tính
	public String tenSach;
	private int tongSoSach,soSachMuon;
	
	//Tạo 1 arraylist lưu trữ tên sách
	ArrayList<String> arrayList=new ArrayList<>();
	Scanner scanner=new Scanner(System.in);
	//Phương thức
	protected  void nhap() {	//Thêm từ khóa static vào để sử dụng trong hàm main
		System.out.println("Tổng số sách: ");
		tongSoSach=Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<tongSoSach; i++){
			System.out.println("Tên sách: ");
			tenSach=scanner.nextLine();
			arrayList.add(tenSach);
		}
		
		System.out.println("Số sách cho mượn: ");
		soSachMuon=scanner.nextInt();
	}
	
	protected void hienThi(String tenSach, int tongSoSach, int soSachMuon) {
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println((i+1)+" : "+arrayList.get(i));
		}
	}
	
	public int soSachConLai(int tongSoSach, int soSachMuon) {
		return tongSoSach-soSachMuon;
	}

	public static void main(String[] args) {
		Book book=new Book();
		book.nhap();
		System.out.println("Các quyển sách có trong thư viện: ");
		book.hienThi(book.tenSach, book.tongSoSach, book.soSachMuon);
		
		int conlai=book.soSachConLai(book.tongSoSach,book.soSachMuon);
		System.out.println("Số sách còn lại: "+conlai);
		
	}

}
