package xulyngaythang;
import java.util.Calendar;
import java.util.Date;

public class LayThoiGian_Calendar {

	public static void main(String[] args) {
	// Ví dụ dưới đây sẽ minh h�?a cách lấy th�?i gian hiện tại của hệ thống (bao gồm ngày tháng năm gi�? phút giây) sử dụng Calendar:
		// Tạo đối tượng Calendar mô tả th�?i điểm hiện tại
	    // với Locale (khu vực) và TimeZone (múi gi�?) 
	    // của máy tính đang chạy.
		Calendar calendar=Calendar.getInstance();
		// import java.util.Date; để sử dụng Date
	    // hiển thị ngày tháng năm gi�? phút giây hiện tại của hệ thống
	    // sử dụng phương thức getTime()
	    // phương thức này sẽ trả v�? 1 đối tượng Date 
	    // lưu trữ thông tin ngày tháng năm gi�? phút giây hiện tại của hệ thống
		Date date=calendar.getTime();
		//hiển thị th�?i gian
		System.out.println("Múi gi�? hiện tại của hệ thống: "+date);
		 
	}
}
