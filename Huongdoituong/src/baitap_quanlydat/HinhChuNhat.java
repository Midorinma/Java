package baitap_quanlydat;

public class HinhChuNhat extends MiengDat{
	private int dai,rong;

	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhChuNhat(int dai, int rong) {
		super();
		this.dai = dai;
		this.rong = rong;
	}

	public int getDai() {
		return dai;
	}

	public void setDai(int dai) {
		this.dai = dai;
	}

	public int getRong() {
		return rong;
	}

	public void setRong(int rong) {
		this.rong = rong;
	}

	@Override
	public long tinhDienTich() {
		// TODO Auto-generated method stub
		return this.dai*this.rong;
	}
		
	@Override
	public void nhapThongTinMiengDat() {
		// TODO Auto-generated method stub
		super.nhapThongTinMiengDat();
		do {
			System.out.print("Chiều dài: ");
			dai=scanner.nextInt();
			System.out.print("Chiều rộng: ");
			rong=scanner.nextInt();

		}while((dai<=rong)|| (dai<0)||(rong<0));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Chiều dài: "+this.dai+", chiều rộng: "+this.rong;
	}
	
	
	
	

}
