package manghaichieu;
import java.util.Scanner;
public class BT_MaxMinDuongCheo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;// Khai báo phần tử  của ma trận vuông
		do {
			System.out.print("Số dòng = số cột = ");
			n=scanner.nextInt();
		}while(n<2);
		//Khai báo và cấp phát bộ nhớ cho mảng
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
		//Tìm MAX và MIN của đường chéo chính
		int max=mang[0][0];
		int min=mang[0][0];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					if(mang[i][j]>max) {
						max=mang[i][j];
					}
					if(mang[i][j]<min){
						min=mang[i][j];
					}
				}
			}
		}
		System.out.println("MAX của đường chéo: "+max);
		System.out.println("MIN của đường chéo: "+min);
		

	}

}
