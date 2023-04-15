package array;
import java.util.Scanner;
public class CanChuY {
	public static int max=100;
	public static void main(String[] args) {
		// Viết chương trình nhập mảng sao cho không có phần tử nào trùng nhau.
		Scanner scanner=new Scanner(System.in);
		int n;
		int i=0;
		int mang[]=new int[max];
		do {
			System.out.println("n= ");
			n=scanner.nextInt();
			if(n<=0 || n>max) {
				System.out.println("(n>0 và n<100): ");
			}
		}while(n<=0 || n>max);
		//Kiểm tra phần tử trùng
		do {
			int check=0;	//Khởi tạo biến kiểm tra phần tử trùng
			System.out.print("a[ "+i+" ]= ");
			mang[i]=scanner.nextInt();
			for(int j=i-1; j>=0; j--) {
				if(mang[i]==mang[j]) {//nếu phần tử sau bằng phần tử trước thì thoát khỏi for
					System.out.println("Phần tử đã tồn tại mời nhập lại.");
					check=1;
					break;
				}
			}
			if(check==1) {//Nếu check=1 thì quay lại vòng lặp do-while yêu cầu nhập lại
				continue;
			}else {
				i++;
			}
		}while(i<n);
		System.out.println("Mản đã nhập: ");
		//Xuất  chương trình
		for(i=0; i<n; i++) {
			System.out.print(mang[i]+"\t");
		}

	}

}
