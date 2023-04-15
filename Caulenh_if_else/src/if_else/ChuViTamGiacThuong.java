package if_else;
import java.util.Scanner;
public class ChuViTamGiacThuong {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Khai báo biến
		float canh1,canh2,canh3,chuVi;
		//Nhập các cạnh của tam giác
		System.out.println("----------TAM GIÁC THƯỜNG---------");
		System.out.println("Nhập vào cạnh thứ 1 của tam giác: ");
		canh1=scanner.nextFloat();
		System.out.println("Nhập vào cạnh thứ 2 của tam giác: ");
		canh2=scanner.nextFloat();
		System.out.println("Nhập vào cạnh thứ 3 của tam giác: ");
		canh3=scanner.nextFloat();
		//Tính chu vi
		chuVi=canh1+canh2+canh3;
		if((canh1+canh2)>canh3 && (canh1+canh3)>canh2 && (canh2+canh3)>canh1) {
			System.out.println("Chu vi của tam giác là: "+chuVi);
		}
		else {
			System.out.println("Không tồn tại tam giác.");
		}
		
	}
	
}
