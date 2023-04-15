package thuvienxulychuoi;

import java.util.StringTokenizer;

public class PhuongThuc_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hoc, học nữa, học mãi!";
		
		//Kí tự phân tách mặc định là khoảng trắng
		StringTokenizer stringTokenizer=new StringTokenizer(str);
		System.out.println("Kết quả sau khi phân tách theo khoảng trắng: ");
		
		//Kiểm tra xem có dòng token kế tiếp trong chuỗi hay không
		//Sử dụng phương thức hasMoreTokens()
		while(stringTokenizer.hasMoreTokens()) {
			//nextToken(): Lấy Token hiện tại ra và di chuyển tới token kế tiếp
			System.out.println(stringTokenizer.nextToken());
		}
		
		//phân tách stringTokenizer1 vừa theo dấu phẩy và vừa theo khoảng trắng
		StringTokenizer stringTokenizer2=new StringTokenizer(str,", ");
		System.out.println("\nKết quả sau khi phân tách vừa theo dấu phẩy và vừa theo khoảng trắng: ");
		//Kiểm tra xem  có còn Token kế tiếp trong chuỗi hay không
		//Sử dụng phương thức hasMOreElements()
		while(stringTokenizer2.hasMoreElements()) {
			System.out.println(stringTokenizer2.nextElement());
		}

	}

}
