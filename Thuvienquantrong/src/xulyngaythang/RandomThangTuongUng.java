package xulyngaythang;

public class RandomThangTuongUng {

	public static void main(String[] args) {
		// System.currentTimeMillis() hiển thị số giây hiện tại tính bằng mili giây
		int temp=(int)(System.currentTimeMillis()%12+1);
		String thang="";
		switch(temp) {
		case 1:
			thang="Tháng 1";
			break;
		case 2:
			thang="Tháng 2";
			break;
		case 3:
			thang="Tháng 3";
			break;
		case 4:
			thang="Tháng 4";
			break;
		case 5:
			thang="Tháng 5";
			break;
		case 6:
			thang="Tháng 6";
			break;
		case 7:
			thang="Tháng 7";
			break;
		case 8:
			thang="Tháng 8";
			break;
		case 9:
			thang="Tháng 9";
			break;
		case 10:
			thang="Tháng 10";
			break;
		case 11:
			thang="Tháng 11";
			break;
		case 12:
			thang="Tháng 12";
			break;
		}
		System.out.println(thang);

	}
}
