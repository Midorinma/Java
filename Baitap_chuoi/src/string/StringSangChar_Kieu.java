package string;

public class StringSangChar_Kieu {

	public static void main(String[] args) {
		//Chúng ta có thể chuyển đổi 1 String thành Char 
		//bằng cách sử dụng phương thức CharAt() của lớp String.
		String chuoi="Hello";
		for(int i=0; i<chuoi.length(); i++) {
			char kiTu=chuoi.charAt(i);
			System.out.println("Char: "+kiTu);
		}

	}

}
