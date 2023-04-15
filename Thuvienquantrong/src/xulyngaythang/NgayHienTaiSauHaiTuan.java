package xulyngaythang;

import java.util.Calendar;
import java.util.Date;

public class NgayHienTaiSauHaiTuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		Date date=calendar.getTime();
		System.out.println("Ngày gi�? hiện tại: "+date);
		//Ngày gi�? hiện tại sau hai tuần
		//Sử dụng phương thức add
		calendar.add(calendar.DAY_OF_MONTH, 14);
		System.out.println("Ngày gi�? hiện tai sau hai tuần: "+calendar.getTime());

	}

}
