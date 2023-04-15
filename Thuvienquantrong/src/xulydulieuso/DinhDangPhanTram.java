package xulydulieuso;

import java.text.NumberFormat;

public class DinhDangPhanTram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double personTageDoubleNumber=0.758d;
		
		// định dạng số percentageDoubleNumber ở dạng phần trăm
		// theo khu vực mặc định của máy ảo JVM
	    // khu vực mặc định này là nước Mỹ
	    // lưu ý là phần trăm của số sẽ được làm tròn
		NumberFormat numEN=NumberFormat.getPercentInstance();
		String percentageEN=numEN.format(personTageDoubleNumber);
		
		System.out.println("Số "+personTageDoubleNumber+" ở dạng phần trăm "+percentageEN);

	}

}
