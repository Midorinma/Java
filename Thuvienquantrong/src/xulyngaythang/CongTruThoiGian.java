package xulyngaythang;

import java.util.Calendar;

public class CongTruThoiGian {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		System.out.println("Th�?i gian hiện tại là: "+calendar.getTime());
		//Cộng th�?i gian
		calendar.add(calendar.DAY_OF_MONTH, 5);
		calendar.add(calendar.MONTH, 3);
		System.out.println("Cộng th�?i gian: "+calendar.getTime());
		//Trừ th�?i gian
		calendar.add(calendar.DAY_OF_MONTH, -3);
		calendar.add(calendar.MONTH, -1);
		System.out.println("Trừ th�?i gian: "+calendar.getTime());
	}

}
