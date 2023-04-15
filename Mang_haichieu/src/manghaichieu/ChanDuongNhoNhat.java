package manghaichieu;
import java.util.Scanner;
public class ChanDuongNhoNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int dong,cot;
		do {
			System.out.print("Số dòng: ");
			dong=scanner.nextInt();
			//Xuống dòng
			System.out.println();
			System.out.print("Số cột: ");
			cot=scanner.nextInt();
		}while(dong<0 || cot<0);
		//Khai báo và cấp phát kích cỡ cho mảng
		int mang[][]=new int[dong][cot];
		//Nhập mảng
		for(int i=0; i<dong; i++) {
			for(int j=0; j<cot; j++) {
				System.out.print("a["+i+"]["+j+"] = ");
				mang[i][j]=scanner.nextInt();
			}
		}
		//Xuất mảng
		for(int i=0; i<dong; i++) {
			for(int j=0; j<cot; j++) {
				System.out.print(mang[i][j]+"\t");
			}
			System.out.println();
		}
		//Tìm số chẵn dương nhỏ nhất trong ma trận
		int min=mang[0][0];
		for(int i=0; i<dong; i++) {
			for(int j=0; j<cot; j++) {
				if(mang[i][j]>0) {
					if(mang[i][j]%2==0) {
						if(mang[i][j]<min) {
							min=mang[i][j];
						}
					}
				}
			}
		}
		System.out.println("Phần tử chẵn dương và nhỏ nhất trong ma trận là: "+min);
	}
}
