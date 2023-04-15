package xulimath;

public class NgauNhienKiTuHoa {

	public static void main(String[] args) {
		// n là mã ASCII của ký tự in hoa từ A...Z
		// Math.random() trả về 1 giá trị double ngẫu nhiên nằm trong khoảng [0.0 ... 1.0)
		// ví dụ giả sử Math.random() sinh ra số double = 0.0
		// thì n = 65 + 0.0 * 26 = 65 (mã ASCII của ký tự A)
		int n= (int)(65+Math.random()*26);
		
		// tìm ký tự ứng với mã ASCII tương ứng
		char kiTu=(char)n;
		
		System.out.println("Ngẫu nhiên một kí tự in hoa: ");
		System.out.println(kiTu);

	}

}
