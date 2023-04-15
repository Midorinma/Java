package bt_quanlibienlai;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BienLai bienLai;
		int n; //số hộ sử dụng điện
		Scanner scanner=new Scanner(System.in);
		//khởi tạo danh sách liên kết đễ lưu trữ biên lai
		ArrayList<BienLai> bl=new ArrayList<>();
		
		System.out.print("Số hộ sử dụng điện: ");
		n=scanner.nextInt();
		//Lưu thông tin bien lai
		for(int i=0; i<n; i++) {
			bienLai=new BienLai();
			System.out.println("Thông tin biên lai hộ gia đình thứ "+(i+1)+" : ");
			bienLai.nhapBienLai();
			bl.add(bienLai);
		}
		
		//Hiển thị thông tin
		System.out.println("Thông tin biên lai của các hộ gia đình: ");
		for(int i=0; i<bl.size(); i++) {
			System.out.println("Thông tin biên lai hộ gia đình thứ "+(i+1)+" : ");
			bl.get(i).xuatBienLai();
		}
		

	}

}
