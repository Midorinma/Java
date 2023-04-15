package baitap_vehinhdongian;

public class RightTriangle extends Shaper{
	protected int canhVuong;

	public RightTriangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RightTriangle(int canhVuong) {
		super();
		if(canhVuong<1 || canhVuong>20) {
			System.out.print("Giá trị của cạnh phải nằm trong khoảng [1...20]");
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
	
	public void draw() {
		for(int i=1; i<=canhVuong; i++) {
			for(int j=1; j<=i; j++) {
				
					System.out.print("*");
			}
			System.out.println();
		}
	}

	
}
