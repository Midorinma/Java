package array;
import java.util.Scanner;
public class XoaPhanTu {
	public static int max=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n,k,c=0;
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
		//Xuất mảng
		for(int i=0; i<n; i++) {
			System.out.print(mang[i]+"\t");
		}
		System.out.println();
		//Xóa phần tử
		System.out.print("Nhập vào giá trị xóa: ");
		k=scanner.nextInt();
		
		for(int i=0; i<n; i++) {
			//chỉ lấy những phần tử khác k và những phần tử bằng k sẽ không thực hiện trong thân vòng lặp
			//dùng mảng phụ c để chứa phần tử mảng i
			if(mang[i]!=k) {
				mang[c]=mang[i];
				c++;
			}
		}
		//Sau khi lọc ra hết những phần tử bằng k và mảng c chứa hết những phần tử khác k
		//n=c; gán c cho n và xuất ra chương trình
		//mảng sau khi xóa
		for(int i=0; i<c; i++) {
			System.out.print(mang[i]+"\t");
		}
		

	}

}
