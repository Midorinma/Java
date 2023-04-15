package xulyngaythang;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Simple_Date_Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		Date date=calendar.getTime();
		System.out.println("Th�?i gian hiện tại: "+date);
		//G�?i phương thức hiệu chỉnh th�?i gian
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Th�?i gian hiện tại sau khi định dạng là: "+simpleDateFormat.format(date));
		
		SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("d/M/yyyy");
		System.out.println("Th�?i gian hiện tại sau khi định dạng là: "+simpleDateFormat2.format(date));
		
		SimpleDateFormat simpleDateFormat3=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Ngày gi�? hiện tại sau khi định dạng là: "+simpleDateFormat3.format(date));
		
		// hiển thị ngày gi�? theo định dạng 12 gi�?
	    // với định dạng 12 gi�? thì chúng ta sẽ thêm vào "aaa"
	    // trong đó "aaa" đại diện cho AM/PM
		SimpleDateFormat simpleDateFormat4=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss aaa");
		System.out.println("Ngày gi�?: "+simpleDateFormat4.format(date));

	}

}
