package manghaichieu;
import java.util.Scanner;
public class ViDu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khai báo dòng cột
		int dong,cot;
		int soPhanTu0=0;
		int soPhanTuKhac0=0;
		do {
			System.out.print("Nhập vào số dòng: ");
			dong=scanner.nextInt();
			//xuống dòng
			System.out.println();
			System.out.print("Nhập vào số cột: ");
			cot=scanner.nextInt();
		}while(dong<1 || cot<1);
		//Khai báo và cấp phát bộ nhớ cho mảng
		int mang[][]=new int[dong][cot];
		//Nhập ma trận
		for(int i=0; i<dong; i++) {
			for(int j=0; j<cot; j++) {
				System.out.print("a["+i+"]["+j+"]= ");
				mang[i][j]=scanner.nextInt();
			}
		}
		//Xuất ma trận
		for(int i=0; i<dong; i++){
			for(int j=0; j<cot; j++) {
				System.out.print(mang[i][j]+"\t");
			}
			System.out.println();
		}
		//Kiểm tra ma trận
		for(int i=0; i<dong; i++) {
			for(int j=0; j<cot; j++) {
				if(mang[i][j]==0) {
					soPhanTu0++;
				}else {
					soPhanTuKhac0++;
				}
			}
		}
		if(soPhanTu0>soPhanTuKhac0) {
			System.out.println("Ma trận vừa nhập là ma trận thưa.");
		}else {
			System.out.println("Ma trận vừa nhập là mà trận không thưa.");
		}
		
		

	}
}
