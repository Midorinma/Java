package bt_quanlynhanvienphanmem;

public class LapTrinhVien extends NhanVien{
	private int soGioOT;

	public LapTrinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LapTrinhVien(int soGioOT) {
		super();
		this.soGioOT = soGioOT;
	}

	/**
	 * @return the soGioOT
	 */
	public int getSoGioOT() {
		return soGioOT;
	}

	/**
	 * @param soGioOT the soGioOT to set
	 */
	public void setSoGioOT(int soGioOT) {
		this.soGioOT = soGioOT;
	}

	@Override
	public long luong() {
		// TODO Auto-generated method stub
		return (long)(this.getLuongCoBan()+this.getSoGioOT()*200000);
	}

	@Override
	public void nhapThongTinNhanVien() {
		// TODO Auto-generated method stub
		super.nhapThongTinNhanVien();
		
		System.out.print("Số giờ OverTimer: ");
		soGioOT=scanner.nextInt();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Số giờ OverTime: "+this.soGioOT+" tiếng";
	}

	
	
	
	
	
	
	

}
