package xulyngaythang;

import java.util.Calendar;
import java.util.TimeZone;

public class ThoiGianHienTai_HanQuoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		 // thiết lập múi gi�? hiện tại là múi gi�? của Hàn Quốc
	    // sử dụng phương thức setTimeZone()
	    // TimeZone.getTimeZone("Asia/Seoul") sẽ trả v�? múi gi�? của Hàn Quốc
	    // Hàn Quốc nhanh hơn Việt Nam 2 tiếng đồng hồ.
		
		calendar.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		System.out.print("Th�?i gian hiện tại của hàn quốc là: ");
		System.out.println(calendar.get(calendar.HOUR_OF_DAY)+":"+calendar.get(calendar.MINUTE)+":"+calendar.get(calendar.SECOND));

	}

}
