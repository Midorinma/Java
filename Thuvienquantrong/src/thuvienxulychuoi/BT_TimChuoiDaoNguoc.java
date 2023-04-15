package thuvienxulychuoi;

import java.util.Scanner;

public class BT_TimChuoiDaoNguoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,ketQua;
		Scanner scanner=new Scanner(System.in);
		StringBuilder stringBuilder=new StringBuilder();
		
		System.out.println("Nhập chuỗi: ");
		str=scanner.nextLine();
		
		for(int i=0; i<str.length()/2; i++) {
			char ch=str.charAt(i);
			
			// nếu ký tự đầu tiên = ký tự cuối cùng của chuỗi
	        // thì sẽ thêm ký tự đó vào stringBuilder
	        // sử dụng phương thức append()
	        // nếu không thì thoát khỏi vòng lặp
			if(ch == str.charAt(str.length()-i-1)) {
				stringBuilder.append(ch);
			}else {
				break;
			}
		}
		System.out.println(stringBuilder.toString());
	}

}
