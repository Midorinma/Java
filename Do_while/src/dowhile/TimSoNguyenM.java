package dowhile;
import java.util.Scanner;
public class TimSoNguyenM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n,m=0,sum=0;
		do {
			System.out.println("Nhập một số nguyên: ");
			n=scanner.nextInt();
			if(n<0) {
				System.out.println("Nhập sai! số nguyên phải lớn hơn 0.");
			}
		}while(n<0);
		while((sum+m)<n) {
			sum+=++m; //tăng m lên 1 đơn vị và tính sum=sum+m
			System.out.print(m);//print xuất m trên cùng 1 dòng
			if((sum+m)<n) {
				System.out.print("+");
			}
		}
		System.out.println("="+sum+" <= "+n);
		System.out.println("m lớn nhất = "+m);
		
	}

}
