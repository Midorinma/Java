package quanlycanbo;

public class CongNhan extends CanBo{
	protected int bac;

	public CongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CongNhan(int bac) {
		super();
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	@Override
	public void nhapThongTinCanBo() {
		// TODO Auto-generated method stub
		super.nhapThongTinCanBo();
		do {
			System.out.print("Bậc: ");
			bac=scanner.nextInt();
			if(this.bac<1 || this.bac>10) {
				System.out.println("Bậc(1-10)!");
			}
		}while(this.bac<1 || this.bac>10);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Bậc: "+this.bac;
	}
	
	
	

}
