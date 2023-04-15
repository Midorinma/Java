package xulydulieuso;

import java.text.NumberFormat;
import java.util.Locale;

public class DinhDangSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat numberFormat=NumberFormat.getInstance();
		
		//Dịnh dạng số của khu vực mặc định của máy ảo JVM
		// sử dụng phương thức format
		double doubleNumber=10.08d;
		String str=numberFormat.format(doubleNumber);
		System.out.println("Số "+doubleNumber+" Sau khi định dạng là: "+str);
		
		//Tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của nước Anh
		Locale localeEn=new Locale("en","EN");
		NumberFormat en=NumberFormat.getInstance(localeEn);
		
		//Đối với số có kiểu long được định dạng theo chuẩn của nước Anh
		//Thì phần ngàn của số được phân cách bằng dấu phẩy
		long longNumber=12580L;
		String str1=en.format(longNumber);
		System.out.println("Số "+longNumber+" Sau khi định dạng "+str1);
		
		//Tạo một numberFormat để định dạng số theo tiêu chuẩn của Việt Nam
		Locale locateVi=new Locale("vi","VN");
		NumberFormat vi=NumberFormat.getInstance(locateVi);
		
		//Đối với số float được định dạng theo chuẩn VietNam
		//Thì phần thập phân của số được phân cách bằng dấu phẩy
		double doubleNumber1=12.15d;
		String str2=vi.format(doubleNumber1);
		System.out.println("Số "+doubleNumber1+" Sau khi định dạng là: "+str2);

	}

}
