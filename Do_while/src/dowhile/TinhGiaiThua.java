package dowhile;
import java.util.Scanner;
public class TinhGiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int giaiThua,sum=1,m=1;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("Nhập vào một số: ");
			giaiThua=scanner.nextInt();
			if(giaiThua<0) {
				System.out.println("Nhập sai! yêu cầu nhập lại.");
			}
		}while(giaiThua<0);
		while(sum<=giaiThua) {
			m*=sum;
			sum++;
		}
		System.out.println(giaiThua+"!="+m);

	}

}
