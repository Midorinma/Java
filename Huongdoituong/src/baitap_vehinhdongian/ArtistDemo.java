package baitap_vehinhdongian;

import java.util.Scanner;

public class ArtistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		int CD,CR,canhvuong;
		System.out.print("Nhập vào chiều dài hình chữ nhật: ");
		CD=scanner.nextInt();
		System.out.print("Nhập vào chiều rộng hình chữ nhật: ");
		CR=scanner.nextInt();
		
		
		Rectangle rectangle=new Rectangle(CD, CR);
		rectangle.setChieuRong(CR);
		
		rectangle.draw();
		
		System.out.print("Nhập vào cạnh góc vuông: ");
		canhvuong=scanner.nextInt();

		RightTriangle rightTriangle=new RightTriangle(canhvuong);
		
		rightTriangle.draw();
		
		
		
		

	}

}
