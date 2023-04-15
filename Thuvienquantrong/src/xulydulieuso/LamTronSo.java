package xulydulieuso;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class LamTronSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat numf=NumberFormat.getNumberInstance();
		numf.setMaximumFractionDigits(2);	//Làm tròn đến hai chữ số phần thập phân
		
		//RoundingMode.UP làm tròn lên
		numf.setRoundingMode(RoundingMode.UP);
		System.out.println("Chế độ làm tròn: "+numf.getRoundingMode());
		System.out.println("523.454 sau khi làm tròn = "+numf.format(523.454));
		System.out.println("733.455 sau khi làm tròn = "+numf.format(733.455));
		System.out.println("823.456 sau khi làm tròn = "+numf.format(823.456));
		
		//RoundingMode.DOWN: làm tròn xuống
		numf.setRoundingMode(RoundingMode.DOWN);
		System.out.println("\nChế độ làm tròn:"+numf.getRoundingMode());
		System.out.println("523.454 sau khi làm tròn = "+numf.format(523.454));
		System.out.println("733.455 sau khi làm tròn = "+numf.format(733.455));
		System.out.println("823.456 sau khi làm tròn = "+numf.format(823.456));

	}

}
