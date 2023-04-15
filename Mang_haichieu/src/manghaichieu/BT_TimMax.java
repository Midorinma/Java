package manghaichieu;
import java.util.Scanner;
public class BT_TimMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khai bao bien dong va cot
		int dong,cot;
		do {
			System.out.print("Số dòng = ");
			dong=scanner.nextInt();
			System.out.println();
			System.out.print("Số cột = ");
			cot=scanner.nextInt();
		}while(dong<2 || cot<2);
		//Khai báo và khởi tạo khích thước của mảng
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
		//Tim phần tử MAX
		int max=mang[0][0];
		
		for(int i=0; i<dong; i++) {
			for(int j=0; j<cot; j++) {
				max=mang[i][j]>max? mang[i][j]:max;
			}
		}
		System.out.println("Phần tử lớn nhất có trong mảng là: "+max);
		
		

	}

}
