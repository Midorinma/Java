package manghaichieu;
import java.util.Scanner;
public class ViDu1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khai báo số dòng, số cột
		int m,n;
		do {
			System.out.print("Nhập vào số dòng của ma trận : ");
			m=scanner.nextInt();
			//Xuống dòng
			System.out.println();
			System.out.print("Nhập vào số cột của ma trận : ");
			n=scanner.nextInt();
		}while(m<1 || n<1);
		//Khai báo và cấp phát bộ nhớ cho mảng
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		//Nhập Mảng a
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("a["+i+"]["+j+"] = ");
				a[i][j]=scanner.nextInt();
			}
		}
		//Nhập Mảng b
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("b["+i+"]["+j+"] = ");
				b[i][j]=scanner.nextInt();
			}
		}
		
		//Khai báo số dòng và số cột cho mảng c là tổng của hai mảng a và b
		int c[][]=new int[m][n];
		//Tạo vòng lặp tính tổng hai mảng
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Mảng sau khi tính tổng: ");
		//Xuất mảng
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
