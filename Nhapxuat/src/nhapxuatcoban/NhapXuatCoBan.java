package nhapxuatcoban;
import java.util.Scanner;
public class NhapXuatCoBan {

	public static void main(String[] args){
		String ten;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Mời bạn nhập chuỗi:");//Hiển thị dòng thông báo và xuống dòng
		ten=scanner.nextLine();
		//hiển thị chuỗi
		System.out.println("Chào mừng bạn "+ten+" đến đây với chúng tôi!");
	}
	
}
