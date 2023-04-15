package manghaichieu;
import java.util.Scanner;
public class ViDu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n,kt=0;
		do {
			System.out.print("số dòng = số cột = ");
			n=scanner.nextInt();
			if(n<1) {
				System.out.println("số nhập vào phải lớn hơn 0!");
			}
		}while(n<1);
		int mang[][]=new int[n][n];
		//Nhập mảng
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("a["+i+"]["+j+"]= ");
				mang[i][j]=scanner.nextInt();
			}
		}
		//Xuất mảng
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(mang[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(mang[i][j]==mang[j][i]) {
					kt=1;
				}else {
					kt=0;
				}
			}
		}
		if (kt == 1) {
	        System.out.println("Ma trận vừa nhập là ma trận đối xứng");
	    } else {
	        System.out.println("Ma trận vừa nhập là ma trận không đối xứng");
	    }

	}

}
