package xulyngaythang;

import java.util.Calendar;
import java.util.Date;

public class BT_DauThangCuoiThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		Date date=calendar.getTime();
		System.out.println("Ngày hiện tại: "+date);
		int ngayCuoiThang=calendar.getActualMaximum(calendar.DATE);
		int ngayDauThang=calendar.getActualMinimum(calendar.DATE);
		
		System.out.println("Ngày đầu tháng: "+ngayDauThang);
		System.out.println("Ngày cuối tháng: "+ngayCuoiThang);

	}

}
