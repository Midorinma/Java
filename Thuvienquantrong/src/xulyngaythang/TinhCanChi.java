package xulyngaythang;

import java.util.Calendar;

public class TinhCanChi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		int nam=calendar.get(calendar.YEAR);
		String can="";
		String chi="";
		switch(nam%10) {
		case 0:
			can="Canh";
			break;
		case 1:
			can="Tân";
			break;
		case 2:
			can="Nhâm";
			break;
		case 3:
			can="Qúy";
			break;
		case 4:
			can="Gíap";
			break;
		case 5:
			can="Ất";
			break;
		case 6:
			can="Bính";
			break;
		case 7:
			can="Đinh";
			break;
		case 8:
			can="Mậu";
			break;
		case 9:
			can="Kỳ";
			break;
		}
		switch(nam%12) {
		case 0:
			chi="Thân";
			break;
		case 1:
			chi="Dậu";
			break;
		case 2:
			chi="Tuất";
			break;
		case 3:
			chi="Hợi";
			break;
		case 4:
			chi="Tý";
			break;
		case 5:
			chi="Sửu";
			break;
		case 6:
			chi="Dần";
			break;
		case 7:
			chi="Mẹo";
			break;
		case 8:
			chi="Thìn";
			break;
		case 9:
			chi="Tỵ";
			break;
		case 10:
			chi="Ngọ";
			break;
		case 11:
			chi="Mùi";
			break;
		}
		System.out.println("Năm: "+nam);
		System.out.println("Số năm hiện tại tính theo can chi là: "+can+" "+chi);

	}

}
