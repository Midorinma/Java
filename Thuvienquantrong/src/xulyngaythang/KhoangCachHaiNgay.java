package xulyngaythang;

import java.time.LocalDate;
import java.time.Period;

public class KhoangCachHaiNgay {

	public static void main(String[] args) {
		// LocalDate: mô tả kiểu dữ liệu date chỉ bao gồm ngày, tháng, năm
	    // Thường được sử dụng để lưu trữ, mô tả: ngày sinh, ngày tốt nghiệp
	    // hay ngày vào 1 công ty ...
	    // Để sử dụng LocalDate chúng ta sẽ import gói thư viện java.time.LocalDate của Java
	    // LocalDate.of(2010, 1, 15) sẽ trả về biến startDate có ngày, tháng, năm lần lượt là
	    // 15, 1 và 2010
		LocalDate startDate=LocalDate.of(1996,8,25);
		LocalDate endDate=LocalDate.of(2022,7,22);
		
		// tính sự chênh lệch giữa startDate và endDate
	    // sử dụng hàm between() của Peridot
	    // Để sử dụng Peridot chúng ta sẽ import gói thư viện java.time.Period của Java
		Period space=Period.between(startDate, endDate);
		System.out.println("Sự chênh lệch giữa startdate và endDate là: "+
		space.getDays()+" ngày "+space.getMonths()+" tháng "+space.getYears()+" năm.");
		

	}

}
