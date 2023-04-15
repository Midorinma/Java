package xulydulieuso;

import java.util.Locale;

public class ThongTinNgonNguTenQuocGia {

	public static void main(String[] args) {
		//locale.getDefault() sẽ trả về biến currenLocal
		//là khu vực mặc định của hệ thống máy ảo JVM
		Locale currenLocale=Locale.getDefault();
		
		// getDisplayLanguage() trả về tên ngôn ngữ của currentLocale
	    // getDislayCountry() trả về tên quốc gia của currentLocale
		System.out.println(currenLocale.getDisplayCountry());
		System.out.println(currenLocale.getDisplayLanguage());
		
		// getLanguage() trả về mã ngôn ngữ của currentLocale
	    // getCountry() trả về mã quốc gia của currentLocale
		System.out.println(currenLocale.getCountry());
		System.out.println(currenLocale.getLanguage());
		
		// getProperty() trả về chuỗi bao gồm các thông tin của hệ thống
	    // user.country là quốc gia
	    // user.language là ngôn ngữ
		System.out.println(System.getProperty("user.country"));
		System.out.println(System.getProperty("user.language"));
		
		

	}

}
