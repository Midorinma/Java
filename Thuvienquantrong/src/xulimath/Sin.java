package xulimath;

public class Sin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ví dụ tính Sin góc 90 độ: ");
		int goc=90;
		
		//Đưa một góc về radian
		double radian=Math.PI*goc/180;
		System.out.println("Sin("+goc+")= "+Math.sin(radian));
		

	}

}
