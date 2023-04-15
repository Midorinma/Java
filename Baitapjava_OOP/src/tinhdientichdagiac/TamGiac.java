package tinhdientichdagiac;

public class TamGiac extends DaGiac{

	 TamGiac() {
		// TODO Auto-generated constructor 
		 this.a=new int[3];
		 this.soCanh=3;
	}

	public void nhapThongTinTamGiac() {
		do {
			System.out.println("Nhập số cạnh cho tam giác: ");
			for(int i=0; i<3; i++) {
				System.out.println("Nhập kích thước cạnh thứ "+(i+1)+" : ");
				this.a[i]=scanner.nextInt();
			}
			
		}while((a[0]+a[1])<=a[2] || (a[1]+a[2])<=a[0] || (a[0]+a[2])<=a[1]);
	}

	@Override
	protected int tinhCV() {
		// TODO Auto-generated method stub
		int cv=0;
		for(int i=0; i<3; i++) {
			cv+=this.a[i];
		}
		return cv;
	}
	
	public double tinhDienTich() {
		double dt=0;
		int A=a[0];
		int B=a[1];
		int C=a[2];
		double P=(A + B + C)/2;
		dt=Math.sqrt(P * (P-A) * (P-B) * (P-C));
		return dt;
	}

	@Override
	protected void xuatDaGiac() {
		// TODO Auto-generated method stub
		super.xuatDaGiac();
	}
	
	
	 
	
	 

	

	
}
