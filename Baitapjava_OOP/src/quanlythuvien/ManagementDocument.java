package quanlythuvien;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.Doc;

public class ManagementDocument {
	protected ArrayList<Document> arrDocuments=new ArrayList<>();
	Scanner scanner=new Scanner(System.in);
	
	//Thêm mới tài liệu
	public void themMoiTaiLieu(Document document) {
		arrDocuments.add(document);
	}
	
	public void hienThi() {
		for(int i=0; i<arrDocuments.size(); i++) {
			System.out.println(arrDocuments.get(i).toString());
		}
	}
	
	//Xóa tài liệu theo mã tài liệu
	public void xoaTaiLieu() {
		int x;
		System.out.print("Nhập vào mã tài liệu cần xóa: ");
		x=scanner.nextInt();
		for(int i=0; i<arrDocuments.size(); i++) {
			if(arrDocuments.get(i).getMaTaiLieu()==x) {
				arrDocuments.remove(i).toString();
			}
			
		}
	}
	
	//Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
	//Tỉm kiếm danh sách theo lớp con kế thừa
	public void timKiemTheoSach() {
		this.arrDocuments.stream().filter(Doc->Doc instanceof KindOfBook).forEach(Doc->System.out.println(Doc.toString()));
	}
	
	public void timKiemTheoTapChi() {
		this.arrDocuments.stream().filter(Doc->Doc instanceof Magazine).forEach(Doc->System.out.println(Doc.toString()));
	}
	
	//forEach phương thức dùng để duyệt qua từng phần tử trong stream 
	public void timKiemTheoBao() {
		this.arrDocuments.stream().filter(Doc->Doc instanceof Newspaper).forEach(Doc->System.out.println(Doc.toString()));
	}
		
	
}
