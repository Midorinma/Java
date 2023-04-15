package manghaichieu;
import java.util.Scanner;
public class KtMaTranTren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;//kich thuc mang
		int kt=0;//bien kiem tra tam giac tren
		int dinhThuc=1;//Tinh dinh thuc 
		do {
			System.out.print("n = ");
			n=scanner.nextInt();
			if(n<2) {
				System.out.println("Bạn nhập sai rồi!");
			}
		}while(n<2);
		//Khai báo và cấp phát bộ nhó cho mảng
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
			System.out.println();
		}
		//Dùng for duyệt phần tử có chỉ số dòng > chỉ số cột
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(mang[i][j]==0) {
					kt=1;
				}
				else {
					kt=0;
				}
			}
		}
		if(kt==1) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(i==j) {
						dinhThuc*=mang[i][j];
					}
				}
			}
			System.out.println("Ma trận A là ma trận tam giác trên.");
			System.out.println("Định thức của ma trận là: "+dinhThuc);
		}else {
			System.out.println("Ma trận A không phải là ma trận tam giác trên.");
		}

	}

}
