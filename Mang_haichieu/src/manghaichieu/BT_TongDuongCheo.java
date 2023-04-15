package manghaichieu;
import java.util.Scanner;
public class BT_TongDuongCheo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Khai báo biến của ma trận vuông
		int n;
		do {
			System.out.print("Số dòng = Số cột = ");
			n=scanner.nextInt();
		}while(n<2);
		int mang[][]=new int[n][n];
		//Nhập mảng
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("a["+i+"]["+j+"] = ");
				mang[i][j]=scanner.nextInt();
			}
		}
		//Xuất mảng
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(mang[i][j]+"\t");
			}
			System.out.println();
		}
		//Tổng đường chéo cũa ma trận
		int tong=0;
		for(int i=0; i<n; i++) {
			int j=0;
			while(j<n) {
				tong+=mang[i][j];
				j++;
				i++;
			}
		}
		System.out.println("Tổng đường chéo của ma trận: "+tong);
		

	}

}
