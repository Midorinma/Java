package xulyngaythang;

import java.time.YearMonth;
import java.util.Date;

public class NgayDauNgayCuoi {

	public static void main(String[] args) {
		// �?ể sử dụng YearMonth chúng ta sẽ import gói thư viện java.time.YearMonth của Java
	    // tạo 1 biến yearMonth
	    // biến này là sự kết hợp của tháng và năm
	    // tháng và năm trong bài tập này là tháng 11 và năm 2007
	    YearMonth yearMonth = YearMonth.of(2017, 11);
	         
	    // lấy thứ của ngày đầu tháng
	    // hàm atDay(1).getDayOfWeek().name()
	    // sẽ trả v�? tên của thứ trong tuần ứng với ngày 1 (ngày đầu tiên của tháng)
	    String first = yearMonth.atDay(1).getDayOfWeek().name();
	    System.out.println("Thứ của ngày đầu tiên trong tháng là " + first);
	         
	    // lấy thứ của ngày cuối cùng trong tháng
	    // hàm atEndOfMonth().getDayOfWeek().name()
	    // sẽ trả v�? tên của thứ trong tuần ứng với ngày cuối cùng của tháng
	    String last = yearMonth.atEndOfMonth().getDayOfWeek().name();
	    System.out.println("Thứ của ngày cuối cùng trong tháng là " + last);

	}

}
