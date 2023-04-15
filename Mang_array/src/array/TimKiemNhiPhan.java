package array;
import java.util.Scanner;
public class TimKiemNhiPhan {
	public static int max=50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n,k;
		int mang[]=new int[max];
		do {
			System.out.println("Nhập n: ");
			n=scanner.nextInt();
			if(n<=0 || n>max) {
				System.out.println("Nhập sai! xin mời nhập lại.");
			}
		}while(n<=0 || n>max);
		//Khai báo hàm nhập
			for(int i=0; i<n; i++) {
				System.out.print("a[ "+i+" ]= ");
				mang[i]=scanner.nextInt();
			}
		//Khai báo hàm xuất
			for(int i=0; i<n; i++) {
				System.out.print(mang[i]+"\t");
			}
			System.out.println();
			
			for (int i = 0; i < n - 1; i++) {
		        for (int j = i+1; j <= n - 1; j++) {
		            if (mang[j] < mang[i]) {
		               int temp = mang[i];
		                mang[i] = mang[j];
		                mang[j] = temp;
		            }
		        }
		    }
		//Tìm kiếm nhị phân
			
			System.out.print("Nhập vào giá trị cần tìm: ");
			k=scanner.nextInt();
			int left=0;
			int right=n-1;
			int mid;
			while(left<=right) {
				mid=(left+right)/2;
				if(mang[mid]==k) { 
					System.out.println("Tìm thấy "+k+" tại vị trí "+mid);
					return;
				}
				else if(mang[mid]>k) { 
					right=mid-1;
				}
				else{ 
					left=mid+1;
				}
				
			}
			 System.out.println("Không tìm thấy giá trị cần tìm.");
		}
}
