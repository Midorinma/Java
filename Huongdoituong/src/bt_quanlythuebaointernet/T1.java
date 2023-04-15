package bt_quanlythuebaointernet;

public class T1 extends ThueBao{
	private static long THUE_BAO_HANG_THANG_CO_DINH=2000000;

	public T1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public long tinhTien() {
		// TODO Auto-generated method stub
		return THUE_BAO_HANG_THANG_CO_DINH;
	}

	@Override
	public String toString() {
		return "Thuê bao T1 có thuê bao hàng tháng = "+this.THUE_BAO_HANG_THANG_CO_DINH+", Tổng tiền = "+this.tinhTien();
	}
	
	
	
	

}
