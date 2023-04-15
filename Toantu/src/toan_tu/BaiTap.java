package toan_tu;
import java.text.DecimalFormat;
import java.util.Scanner;
public class BaiTap {
	public static final float PI=3.14f;//Khai báo hằng số
	public static void main(String[] args) {
		//Khai báo biến scanner lấy từ thư viện import để nhập giá trị
		Scanner scanner=new Scanner(System.in);
		//Khai báo biến decimalFormat được lấy từ thư viện cho phép làm tròn kết quả với hai chữ số thập phân
		DecimalFormat decimalFormat=new DecimalFormat("#.##");
		
		//Nhập vào bán kính hình tròn
		System.out.println("Nhập vào bán kính ( r > 0 ): ");
		float circle=scanner.nextFloat();
		
		//tính thể tích hình tròn
		float volume=(float)4/3*PI*circle*circle*circle;
		System.out.println("Thể tích hình tròn: "+decimalFormat.format(volume));
		//tính diện tích hình tròn
		float area=4*PI*circle*circle;
		System.out.println("Diện tích hình tròn: "+decimalFormat.format(area));

	}

}
