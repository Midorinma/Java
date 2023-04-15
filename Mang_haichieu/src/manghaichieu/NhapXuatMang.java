package manghaichieu;
import java.util.Scanner;
public class NhapXuatMang {
	//Khai báo hằng số
	public static int max=50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khai báo dòng cột cho mảng
		int dong,cot;
		//Khai báo và cấp phát bộ nhớ cho mảng
		int mang[][]=new int[max][max];
		do {
			System.out.print("Nhập vào số dòng: ");
			dong=scanner.nextInt();
			//Xuống dòng
			System.out.println();
			
			System.out.print("Nhập vào số cột: ");
			cot=scanner.nextInt();
			if(dong<=0 || dong>max || cot<=0 || cot>max) {
				System.out.println("Gía trị nhập không đúng phạm vi cho phép.");
			}
		}while(dong<=0 || dong>max || cot<=0 || cot>max);
		//Nhập mảng hai chiều bằng vòng lặp lồng
		for(int i=0; i<dong; i++) {
			for(int j=0; j<cot; j++) {
				System.out.print("a["+i+"]["+j+"] = ");
				mang[i][j]=scanner.nextInt();
			}
		}
		//Xuất mảng hai chiều
		for(int i=0;  i<dong; i++) {
			for(int j=0; j<cot; j++) {
				System.out.print(mang[i][j]+"\t");
			}
			//Sau mỗi một vòng lặp sẽ xuống dòng
			System.out.println();
		}

	}

}
