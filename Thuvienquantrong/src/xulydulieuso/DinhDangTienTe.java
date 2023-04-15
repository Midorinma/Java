package xulydulieuso;

import java.text.NumberFormat;
import java.util.Locale;

public class DinhDangTienTe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double currency=101.999f;
		
		//Định dạng tiền tệ khu vực mặc định của máy ảo JVM
		//Khu vực mặc định này là nước mỹ
		//Nên đơn vị tiền tệ này sẽ là $
		NumberFormat currencyFormat=NumberFormat.getCurrencyInstance();
		
		String str=currencyFormat.format(currency);
		System.out.println("Số "+currency+" sau khi định dạng: "+str);
		
		long vnd=10000000L;
		
		//Tạo 1 NumberFormat để định dạng tiền tệ theo tiêu chuẩn của Việt Nam
		//Đơn vị tiền tệ của Việt Nam là đồng
		Locale localVN=new Locale("vi","VN");
		NumberFormat currencyFormat1=NumberFormat.getCurrencyInstance(localVN);
		
		String str1=currencyFormat1.format(vnd);
		System.out.println("Số "+vnd+" sau khi định dạng: "+str1);
		
		System.out.println("Kiểu đơn vị tiền tệ của "+localVN.getCountry()+" là: "+currencyFormat1.getCurrency());
		

	}

}
