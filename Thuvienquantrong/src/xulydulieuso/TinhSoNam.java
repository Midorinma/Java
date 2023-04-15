package xulydulieuso;

import java.text.DecimalFormat;

public class TinhSoNam {

	public static void main(String[] args) {
		// Java - Viết chương trình tính số năm để số tiền trong ngân hàng của bạn sẽ tăng lên gấp đôi.
		int soNam=0;
		double tienGui=10000;
		String patternLai="#.##";
		String patternGui="$#.##";
		//Làm tròn tiền lãi và tiền gửi đến hai chữ số phần thập phân
		DecimalFormat dcfLai= new DecimalFormat(patternLai);
		//Riêng tiền gửi có thêm dấu $ đằng trước
		DecimalFormat dcfgui= new DecimalFormat(patternGui);
		
		while(tienGui<20000) {
			soNam++;
			double tienLai=tienGui*5/100;	//Tiền lãi
			tienGui+=tienLai;
			System.out.println("Năm "+soNam+" Tiền lãi= "+dcfLai.format(tienLai)+" Tổng tiền gửi= "+dcfgui.format(tienGui));
		}
		System.out.println("Sau ------>"+soNam+" Số tiền gửi sẽ tăng gắp đôi.");
		


	}

}
