package baitap_vehinhdongian2;

public class RightTriangle extends Shape{
	private int canhVuong;

	public RightTriangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RightTriangle(int canhVuong) {
		super();
		if(canhVuong<1 || canhVuong>20) {
			System.out.println("Gía trị cạnh vuông phải nằm trong đoạn [1-20]!");
			return;
		}
		this.canhVuong = canhVuong;
	}

	public int getCanhVuong() {
		return canhVuong;
	}

	public void setCanhVuong(int canhVuong) {
		this.canhVuong = canhVuong;
	}
	
	@Override
	public void draw() {
		for(int i=1; i<=canhVuong; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	

}
