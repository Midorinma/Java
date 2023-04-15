package xulydulieuso;

import java.text.DecimalFormat;

public class TinhVanTocTb {

	public static void main(String[] args) {
		// định dạng số với 2 chữ số phần thập phân
		DecimalFormat dcf=new DecimalFormat("#.##");
		
		 // đổi quãng đường km ra m
	    double quangDuong = 120 * 1000; 
	    
	 // đổi giờ ra giây
	    double thoiGian = 1 * 60 * 60 + 40 * 60 + 35;
	    double vanToc = quangDuong / thoiGian;
	    System.out.println("Vận tốc của người đó = " + dcf.format(vanToc) + "m/s");
		

	}

}
