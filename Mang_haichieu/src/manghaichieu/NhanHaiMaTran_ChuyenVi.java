package manghaichieu;
import java.util.Scanner;
public class NhanHaiMaTran_ChuyenVi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//Khai báo dòng và cột của ma trận 1
		int dong1,cot1;
		int dong2,cot2;
		do {
			System.out.print("Số dòng ma trận 1: ");
			dong1=scanner.nextInt();
			//Xuống dòng
			System.out.println();
			System.out.print("Số cột ma trân 1: ");
			cot1=scanner.nextInt();
			//Xuống dòng
			System.out.println();
			System.out.print("Số dòng ma trận 2: ");
			dong2=scanner.nextInt();
			//Xuống dòng
			System.out.println();
			System.out.print("Số cột ma trận 2: ");
			cot2=scanner.nextInt();
		}while(dong1<0 || cot1<0 || dong2<0 || cot2<0);
		
		if(cot1!=dong2) {
			while(cot1!=dong2) {
				System.out.println("Số cột của ma trận A phải bằng số dòng của ma trận  B!");
				System.out.print("Số cột ma trân 1: ");
				cot1=scanner.nextInt();
				//Xuống dòng
				System.out.println();
				System.out.print("Số dòng ma trận 2: ");
				dong2=scanner.nextInt();
			}
		}
			//Khai báo và cấp phát bộ nhớ cho mảng
			int a[][]=new int[dong1][cot1];
			int b[][]=new int[dong2][cot2];
			//Nhập ma trận 1
			System.out.println("Nhập ma trận 1: ");
			for(int i=0; i<dong1; i++) {
				for(int j=0; j<cot1; j++) {
					System.out.print("a["+i+"]["+j+"] = ");
					a[i][j]=scanner.nextInt();
				}
			}
			System.out.println();
			System.out.println("Nhập ma trận 2: ");
			//Nhập ma trận 2
			for(int i=0; i<dong2; i++) {
				for(int j=0; j<cot2; j++) {
					System.out.print("b["+i+"]["+j+"] = ");
					b[i][j]=scanner.nextInt();
				}
			}
			//Xuất ma trận 1
			System.out.println("Xuất ma trận 1: ");
			for(int i=0; i<dong1; i++) {
				for(int j=0; j<cot1; j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
			//Xuất ma trận 2
			System.out.println("Xuất ma trận 2: ");
			for(int i=0; i<dong2; i++) {
				for(int j=0; j<cot2; j++) {
					System.out.print(b[i][j]+"\t");
				}
				System.out.println();
			}
			//Khai báo và cấp phát bộ nhớ cho mảng c
			/*
			 * ma trận tích C = A * B
	     		sẽ có số dòng là số dòng của ma trận A
	     		và số cột là số cột của ma trận B
			 */
			int c[][]=new int[dong1][cot2];
			
			for(int i=0; i<dong1; i++) {
				for(int j=0; j<cot2; j++) {
					c[i][j]=0;
					for(int k=0; k<cot1; k++) {
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			//Xuất ma trận tích c
			System.out.println("Ma trận tích c có dạng: ");
			for(int i=0; i<dong1; i++) {
				for(int j=0; j<cot2; j++) {
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
			//ma trận chuyển vị của d  so với c là cot2 dong 1
			int d[][]=new int[cot2][dong1];
			for(int i=0; i<dong1; i++) {
				for(int j=0; j<cot2; j++) {
					d[j][i]=c[i][j];
				}
			}
			System.out.println("Ma trận đảo ngược của ma trận c: ");
			//Xuất ma trận d
			for(int i=0; i<cot2; i++) {
				for(int j=0; j<dong1; j++) {
					System.out.print(d[i][j]+"\t");
				}
				System.out.println();
			}
			
		
		
		

	}

}
