package bt_quanlynhanvienphanmem;

public class KiemChungVien extends NhanVien{
	private int soLoiPhatHien;

	public KiemChungVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KiemChungVien(int soLoiPhatHien) {
		super();
		this.soLoiPhatHien = soLoiPhatHien;
	}

	/**
	 * @return the soLoiPhatHien
	 */
	public int getSoLoiPhatHien() {
		return soLoiPhatHien;
	}

	/**
	 * @param soLoiPhatHien the soLoiPhatHien to set
	 */
	public void setSoLoiPhatHien(int soLoiPhatHien) {
		this.soLoiPhatHien = soLoiPhatHien;
	}

	@Override
	public long luong() {
		// TODO Auto-generated method stub
		return (this.getLuongCoBan()+this.soLoiPhatHien*50000);
	}

	@Override
	public void nhapThongTinNhanVien() {
		// TODO Auto-generated method stub
		super.nhapThongTinNhanVien();
		System.out.println("Số lỗi phát hiện: ");
		soLoiPhatHien=scanner.nextInt();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Số lỗi phát hiện: "+this.soLoiPhatHien;
	}
	
	
	
	
	
	
	

}
