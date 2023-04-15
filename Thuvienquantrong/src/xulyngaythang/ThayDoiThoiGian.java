package xulyngaythang;

import java.util.Calendar;

public class ThayDoiThoiGian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		//Thay đổi ngày của tháng
		calendar.set(calendar.DAY_OF_MONTH,19);
		//Thay đổi tháng
		calendar.set(calendar.MONTH, 6);
		//Thay đổi năm
		calendar.set(calendar.YEAR, 2021);
		//Thay dổi gi�?
		calendar.set(calendar.HOUR_OF_DAY, 15);
		//Thay đổi phút
		calendar.set(calendar.MINUTE, 10);
		//Thay đổi giây
		calendar.set(calendar.SECOND, 15);
		//Hiển thị th�?i gian hiện tại sau khi thay đổi
		System.out.println(calendar.getTime());

	}

}
