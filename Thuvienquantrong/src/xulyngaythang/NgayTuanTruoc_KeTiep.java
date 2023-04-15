package xulyngaythang;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NgayTuanTruoc_KeTiep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate nowDate=LocalDate.now();
		System.out.println(nowDate.getDayOfWeek()+" "+
		nowDate.getDayOfMonth()+"/"+nowDate.getMonth()+"/"+nowDate.getYear());
		
		// Để tìm ngày của tuần trước và tuần sau của 1 ngày
		
	    // Java cung cấp cho chúng ta một lớp có sẵn đó là TemporalAdjusters
		
	    // trong lớp này có 2 phương thức đó là next() và previous() 
		
	    // trong bài tập này chúng ta sẽ tìm ngày thứ 5 của tuần trước và tuần sau
		
	    // Để sử dụng TemporalAdjusters
		
	    // chúng ta sẽ import gói thư viện java.time.temporal.TemporalAdjusters của Java 
		
		LocalDate ngayTruoc=nowDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
		
		LocalDate ngaySau=nowDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		
		System.out.println("Ngày thứ 6 tuần trước là: "+ngayTruoc);
		System.out.println("Ngày thứ 6 tuần sau là: "+ngaySau);

	}

}
