package array;
import java.util.Scanner;
public class NhapXuat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khởi tạo kích cỡ cho mảng
		int max;
		System.out.println("Nhập vào kích thước của mảng: ");
		max=scanner.nextInt();
		//Khai báo mảng
		int mang[]=new int[max];
		//Khởi tạo vòng lặp nhập mảng
		for(int i=0; i<max; i++) {
			System.out.println("a[ "+i+" ]= ");
			mang[i]=scanner.nextInt();
		}
		//Xuất vòng lặp nhập mảng
		for(int i=0; i<max; i++) {
			System.out.print(mang[i]+" ");
		}
		

	}

}
