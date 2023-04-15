package bt_quanlythuebaointernet;

public class ADSL extends ThueBao{
	private int dungLuongDuLieuTruyenTai;
	
	protected static int DON_GIA_DU_LIEU_TREN_1MB=50;
	protected static long THUE_BAO_HANG_THANG=50000;
	
	public ADSL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ADSL(int dungLuongDuLieuTruyenTai) {
		super();
		this.dungLuongDuLieuTruyenTai = dungLuongDuLieuTruyenTai;
	}

	/**
	 * @return the dungLuongDuLieuTruyenTai
	 */
	public int getDungLuongDuLieuTruyenTai() {
		return dungLuongDuLieuTruyenTai;
	}

	/**
	 * @param dungLuongDuLieuTruyenTai the dungLuongDuLieuTruyenTai to set
	 */
	public void setDungLuongDuLieuTruyenTai(int dungLuongDuLieuTruyenTai) {
		this.dungLuongDuLieuTruyenTai = dungLuongDuLieuTruyenTai;
	}

	@Override
	public long tinhTien() {
		// TODO Auto-generated method stub
		return THUE_BAO_HANG_THANG + DON_GIA_DU_LIEU_TREN_1MB*this.dungLuongDuLieuTruyenTai;
	}

	@Override
	public String toString() {
		return "Thuê bao ADSL có thuê bao hằng tháng = "+this.THUE_BAO_HANG_THANG
				+", Đơn giá theo MB = "+this.DON_GIA_DU_LIEU_TREN_1MB+"/MB"+
				", Số MB truy cập = "+this.dungLuongDuLieuTruyenTai+", Tổng tiền = "+this.tinhTien();
	}
	
	
	
	
	
	

}
