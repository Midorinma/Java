package string;

public class CharSangString_Kieu {

	public static void main(String[] args) {
		// Chuyển từ char sang string
		char kiTu='a';
		//phương thức 1: sử dụng toString()
		String str=Character.toString(kiTu);
		System.out.println("Chuỗi 1: "+str);
		
		//phương thức 2: sử dụng valueOF()
		String str1=String.valueOf(kiTu);
		System.out.println("Chuỗi 2: "+str1);

	}

}
