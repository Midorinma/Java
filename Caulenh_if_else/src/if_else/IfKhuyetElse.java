package if_else;
import java.util.Scanner;
public class IfKhuyetElse {

	public static void main(String[] args) {
		//So sánh hai số và hiển thị ra màn hình số nhỏ nhất trong hai số
		Scanner nhap=new Scanner(System.in);
		int so1,so2;
		System.out.println("Nhập vào số thứ 1: ");
		so1=nhap.nextInt();
		System.out.println("Nhập vào số thứ 2: ");
		so2=nhap.nextInt();
		int nhonhat=so1; //gán giá trị của so1 cho nhonhat
		
		/*So sanh so1 va so2 nếu so1>so2 thi gan nhonhat=so2 
		 * Còn không thì thoát câu lệnh
		 */
		if(so1>so2) {
			nhonhat=so2;
		}
		System.out.println("Gía trị nhỏ nhất là: "+nhonhat);
		

	}

}
