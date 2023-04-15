package xulydulieuso;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ChiSoBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double chieuCao, canNang, chiSoBMI;
	    String ketQua;
	         
	    Locale vn = new Locale("vi", "VN");
	    DecimalFormat dcf = new DecimalFormat("#.##");
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập cân nặng: ");
	    canNang = scanner.nextDouble();
	    System.out.println("Nhập chiều cao: ");
	    chieuCao = scanner.nextDouble();
	         
	    // tính chỉ số BMI
	    chiSoBMI = canNang / (chieuCao * chieuCao);
	    System.out.println("Chỉ số BMI = " + dcf.format(chiSoBMI));
	         
	    // phân loại dựa vào chỉ số BMI
	    if (chiSoBMI < 18) {
	        ketQua = "Bạn là người gầy!";
	    } else if (chiSoBMI <= 24.9) {
	        ketQua = "Bạn là người bình thường";
	    } else if (chiSoBMI <= 29.9) {
	        ketQua = "Bạn bị béo phì độ I";
	    } else if (chiSoBMI <= 34.9) {
	        ketQua = "Bạn bị béo phì độ II";
	    } else {
	        ketQua = "Bạn bị béo phì độ III";
	    }
	         
	    System.out.println(ketQua);

	}

}
