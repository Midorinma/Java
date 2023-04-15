package string;

import java.util.Scanner;

public class ChuThuongChuHoa_Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		System.out.println("Chữ hoa tương tứng là: "+chuoi.toUpperCase());

	}

}
