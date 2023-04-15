package array;
import java.util.Scanner;
public class KiemTraDoiXung {
	public static int max=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		int a[]=new int[max];
		do {
			System.out.println("Nhập n: ");
			n=scanner.nextInt();
			if(n<=0 || n>max) {
				System.out.println("Nhập sai xin mời nhập lại!");
			}
		}while(n<=0 || n>max);
		//Nhập mảng
		for(int i=0; i<n; i++) {
			System.out.print("a[ "+i+" ]= ");
			a[i]=scanner.nextInt();
		}
		//Xuất mảng
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		Boolean temp=false;
		//kiểm tra đối xứng
		for(int i=0; i<n; i++) {
			if(a[i]==a[n-i-1]) {
				temp=true;
			}
			else {
				System.out.println("Mảng không đối xứng");
				return;
			}
		}
		if(temp==true) {
			System.out.println("mảng đối xứng");
		}
		
		
	}

}
