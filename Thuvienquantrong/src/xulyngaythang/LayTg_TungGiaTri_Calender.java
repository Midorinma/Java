package xulyngaythang;

import java.util.Calendar;

public class LayTg_TungGiaTri_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		//G�?i ngày hiện tại
		System.out.println("Ngày hiện tại: "+calendar.get(calendar.DAY_OF_MONTH));
		
		//G�?i tháng hiện tại(từ tháng 0 đến tháng 11) nên cộng thêm cho 1
		System.out.println("Tháng hiện tại: "+calendar.get(calendar.MONTH)+1);
		
		//G�?i năm hiện tại
		System.out.println("Năm hiện tại: "+calendar.get(calendar.YEAR));
		
		//G�?i gi�? hiện tại
		//gi�? theo HOUR theo khung gi�? 12h
		System.out.println("Gi�? hiện tại theo HOUR: "+calendar.get(calendar.HOUR));
		//gi�? theo HOUR_OF_DAY theo khung gi�? 24h
		System.out.println("gi�? hiện tại theo HOUR_OF_DAY: "+calendar.get(calendar.HOUR_OF_DAY));
		
		//G�?i phút hiện tại
		System.out.println("Phút hiện tại: "+calendar.get(calendar.MINUTE));
		
		//G�?i giây hiện tại
		System.out.println("giây hiện tại: "+calendar.get(calendar.SECOND));

	}

}
