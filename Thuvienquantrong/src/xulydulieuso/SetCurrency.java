package xulydulieuso;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class SetCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doubleNumber=6.32d;
		
		//Tạo một numberFormat để định dạng tiền tệ theo tiêu chuẩn của Đức
		Locale locale=new Locale("de","DE");
		NumberFormat numberFormat=NumberFormat.getCurrencyInstance(locale);
		
		String str1=numberFormat.format(doubleNumber);
		System.out.println("Số "+doubleNumber+" Sau khi định dạng= "+str1);
		
		// thay đổi từ định dạng tiền tệ theo tiêu chuẩn của Đức 
	    // sang định dạng tiền tệ theo tiêu chuẩn của Việt Nam
		//Sử dụng phương thức setCurrency()
		//Currency.getInstance() sẽ trả về tiền tệ cho 1 quốc gia nào đó (ở đây là Việt Nam)
		Locale locale2=new Locale("vi", "VN");
		numberFormat.setCurrency(Currency.getInstance(locale2));
		String str2=numberFormat.format(doubleNumber);
		System.out.println("Số "+doubleNumber+" Sau khi định dạng "+str2);
		
		

	}

}
