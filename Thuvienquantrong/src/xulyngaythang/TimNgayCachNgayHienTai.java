package xulyngaythang;

import java.util.Calendar;
import java.util.Scanner;

public class TimNgayCachNgayHienTai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
	    String dayString = "";
	    Scanner scanner = new Scanner(System.in);
	         
	    // tìm ngày hiện tại
	    int today = cal.get(Calendar.DAY_OF_WEEK);
	         
	    // hiển thị ngày hiện tại
	    switch (today) {
	        case 1:
	            dayString = "Chủ nhật";
	            break;
	        case 2:
	            dayString = "Thứ hai";
	            break;
	        case 3:
	            dayString = "Thứ ba";
	            break;
	        case 4:
	            dayString = "Thứ tư";
	            break;
	        case 5:
	            dayString = "Thứ năm";
	            break;
	        case 6:
	            dayString = "Thứ sáu";
	            break;
	        case 7:
	            dayString = "Thứ bảy";
	            break;
	    }
	    System.out.println("Hôm nay là " + dayString);
	         
	    System.out.println("Nhập vào số ngày cách ngày hiện tại: ");
	    int n = scanner.nextInt();
	         
	    int day = today + n;    
	    // tìm ngày cách ngày hiện tại n ngày
	    switch(day) {
	        case 1:
	            dayString = "Chủ nhật";
	            break;
	        case 2:
	            dayString = "Thứ hai";
	            break;
	        case 3:
	            dayString = "Thứ ba";
	            break;
	        case 4:
	            dayString = "Thứ tư";
	            break;
	        case 5:
	            dayString = "Thứ năm";
	            break;
	        case 6:
	            dayString = "Thứ sáu";
	            break;
	        case 7:
	            dayString = "Thứ bảy";
	            break;
	    }
	    System.out.println("Ngày cách ngày hiện tại " + n + " ngày là " + dayString);

	}

}
