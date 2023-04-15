package xulyngaythang;

import java.time.Duration;
import java.time.LocalDateTime;

public class ChenhLech_ThoiGian {

	public static void main(String[] args) {
		// LocalDateTime: kiểu dữ liệu gồm đầy đủ ngày tháng năm, giờ phút giây 
	    // nhưng không có mô tả time-zone. 
	    // Nên dùng kiểu dữ liệu này trong các trường hợp khi thao tác với date 
	    // mà ko muốn bị ảnh hưởng bởi time-zone giữa các vùng, quốc gia khác nhau
	    // Để sử dụng LocalDateTime 
	    // chúng ta sẽ import gói thư viện java.time.LocalDateTime của Java
		LocalDateTime startTime=LocalDateTime.of(2022,7,21, 15, 20, 30);
		LocalDateTime endTime=LocalDateTime.of(2022, 7, 22, 16, 8, 10);
		
		// tính sự chênh lệch về giờ, phút, giây
	    // giữa 2 ngày startDate và endDate
	    // sử dụng phương thức between() của Duration
	    // Duration được dùng để tính sự chênh lệch về giây giữa 2 ngày
	    // bằng hàm getSeconds()
		long differentSecond=Duration.between(startTime, endTime).getSeconds();
		
		// chuyển giây về phút sử dụng hàm toMinutes()
		long differentMinute=Duration.between(startTime, endTime).toMinutes();
		
		// chuyển giây về giờ sử dụng hàm toHours()
		long differentHourd=Duration.between(startTime, endTime).toHours();
		System.out.println("Sự chênh lệch giữa startDate và endDate là: "+differentSecond+
				" giây ứng với "+differentMinute+" phút ứng với "+differentHourd+" giờ");

	}

}
