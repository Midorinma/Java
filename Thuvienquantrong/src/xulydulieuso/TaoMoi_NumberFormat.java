package xulydulieuso;

import java.text.NumberFormat;
import java.util.Locale;

public class TaoMoi_NumberFormat {

	public static void main(String[] args) {
		//Tạo một NumberFormat để định dạng số của khu vực hiện tại theo máy ảo JVM
		NumberFormat nf=NumberFormat.getInstance();
		
		//Tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của nước Anh
		//Bằng cách tạo một đối tượng Locale (chi tiết về đối tượng chúng ta sẽ học sau
		// Locale là đối tượng đại diện duy nhất cho các ngôn ngữ và quốc gia, khu vực
	    // khác nhau trên toàn thế giới 
	    // trong đó "en" là ngôn ngữ và "EN" là tên quốc gia.
	    // Để sử dụng Locale chúng ta sẽ import gói thư viện java.util.Locale của Java
		Locale locale=new Locale("en","EN");
		
		// NumberFormat.getInstance(locale) 
	    // dùng để định dạng số chung cho quốc gia, khu vực được chỉ định (ở đây là nước Anh)
		NumberFormat en=NumberFormat.getInstance(locale);
		

	}

}
