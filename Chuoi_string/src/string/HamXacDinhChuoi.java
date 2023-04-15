package string;
import java.util.Scanner;
public class HamXacDinhChuoi {

	public static void main(String[] args) {
		//HÀM XÁC ĐỊNH ĐỘ DÀI CHUỖI KÍ TỰ
		Scanner scanner=new Scanner(System.in);
		String chuoi;
		System.out.println("Nhập vào một chuỗi: ");
		chuoi=scanner.nextLine();
		int doDai=chuoi.length();//chuoi.length xác định độ dài trả về một biến kiểu int
		System.out.println("Chuỗi: "+chuoi+" có độ dài: "+doDai);
		//HÀM NỐI HAI CHUỖI KÍ TỰ
		String chuoi1="abc";
		String chuoi2="xyz";
		
		//cach1: dùng dấu '+' để nối chuỗi
		System.out.println(chuoi1+chuoi2);//abcxyz
		
		//Cach2: dùng phương thức concat()
		String chuoi3;
		chuoi3=chuoi2.concat(chuoi1);//Hàm concat() có tác dụng nối chuoi1 vào chuoi2 và trả về chuoi3
		System.out.println(chuoi3);//xyzabc
		
		//HÀM TRẢ VỀ MỘT KÍ TỰ TRONG CHUỖI
		char character=chuoi1.charAt(1);//Lay ki tu b trong chuoi abc
		System.out.println(character);
		

	}
}
