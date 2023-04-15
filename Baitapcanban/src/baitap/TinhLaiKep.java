package baitap;

public class TinhLaiKep {
	public static void caculator(double p, float r, int n, int t) {
		double imp=p*Math.pow(1+r/n,n*t);
		double ren=imp-p;
		System.out.println("Lãi xuất kép sau "+t+" năm là: "+ ren);
		System.out.println("Số tiền thu được sau "+t+ " năm: "+imp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TinhLaiKep cal=new TinhLaiKep();
		cal.caculator(2000, 0.08f, 12, 5);

	}

}
