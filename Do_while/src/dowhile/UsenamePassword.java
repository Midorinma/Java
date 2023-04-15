package dowhile;
import java.util.Scanner;
public class UsenamePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userName,name=123;
		int passWord,pass=2581996;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("UserName: ");
			userName=scanner.nextInt();
			System.out.println("Password: ");
			passWord=scanner.nextInt();
			if(passWord!=pass || userName!=name) {
				System.out.println("Nhập sai! yêu cầu nhập lại.");
			}
		}while(passWord!=pass || userName!=name);
		System.out.println("Welcome! "+userName+" to world");
		
	}

}
