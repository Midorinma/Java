package xulyngaythang;

import java.util.Calendar;

public class PhuongThucRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		System.out.println("Th�?i gian hiện tại: "+calendar.getTime());
		//Phương thức roll tăng tháng lên 1 vẫn giữa nguyên năm
		calendar.set(calendar.MONTH, 11);//Tăng tháng lên thành tháng 12
		calendar.roll(calendar.MONTH,1);
		System.out.println("Th�?i gian sau khi roll "+calendar.getTime());
	}
}
