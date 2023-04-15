package xulyngaythang;

import java.util.Calendar;

public class CongTruThoiGian {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		System.out.println("Thá»?i gian hiá»‡n táº¡i lÃ : "+calendar.getTime());
		//Cá»™ng thá»?i gian
		calendar.add(calendar.DAY_OF_MONTH, 5);
		calendar.add(calendar.MONTH, 3);
		System.out.println("Cá»™ng thá»?i gian: "+calendar.getTime());
		//Trá»« thá»?i gian
		calendar.add(calendar.DAY_OF_MONTH, -3);
		calendar.add(calendar.MONTH, -1);
		System.out.println("Trá»« thá»?i gian: "+calendar.getTime());
	}

}
