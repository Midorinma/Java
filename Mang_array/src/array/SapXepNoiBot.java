package array;
import java.util.Scanner;
public class SapXepNoiBot {
	public static int max=50;
	public static void Bublesort(int mang[], int n) {
		//Sắp xếp nổi bọt
				Boolean kt=false;
				int temp;
				for(int i=0; i<n-1; i++) {
					for(int j=0; j<n-i-1; j++) {
						if(mang[j]>mang[j+1]) {
							temp=mang[j];
							mang[j]=mang[j+1];
							mang[j+1]=temp;
							kt=true;
						}
					}
					if(kt==false) {
						break;
					}
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		int mang[]=new int[max];
		do {
			System.out.println("Nhập n: ");
			n=scanner.nextInt();
			if(n<=0 || n>max) {
				System.out.println("Nhập sai! xin mời nhập lại.");
			}
		}while(n<=0 || n>max);
		//Nhập mảng
		for(int i=0; i<n; i++) {
			System.out.print("a[ "+i+" ]= ");
			mang[i]=scanner.nextInt();
		}
		System.out.println("Mảng chưa được sắp xếp: ");
		//Xuất mảng
		for(int i=0; i<n; i++) {
			System.out.print(mang[i]+"\t");
		}
		System.out.println();
		System.out.println("Mảng sau khi sắp xếp: ");
		Bublesort(mang,n);
		//Xuất mảng
		for(int i=0; i<n; i++) {
			System.out.print(mang[i]+"\t");
		}
	}

}
