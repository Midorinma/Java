package baitap_quanlycanbo;

public class GiangVien extends CanBoTrongTruong{
	public String khoa;
	private String trinhDo;
	private int soTietDay;
	private long phuCap;
	private static long PHU_CAP_DOI_VOI_CU_NHAN=300;
	private static long PHU_CAP_DOI_VOI_THAC_SI=500;
	private static long PHU_CAP_DOI_VOI_TIEN_SI=1000;
	
	public GiangVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public GiangVien(String khoa, String trinhDo, int soTietDay, int phuCap) {
		super();
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDay = soTietDay;
		this.phuCap = phuCap;
	}



	/**
	 * @return the khoa
	 */
	public String getKhoa() {
		return khoa;
	}

	/**
	 * @param khoa the khoa to set
	 */
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	/**
	 * @return the trinhDo
	 */
	public String getTrinhDo() {
		return trinhDo;
	}

	/**
	 * @param trinhDo the trinhDo to set
	 */
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	/**
	 * @return the soTietDay
	 */
	public int getSoTietDay() {
		return soTietDay;
	}

	/**
	 * @param soTietDay the soTietDay to set
	 */
	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}

	@Override
	public long phuCap() {
		// TODO Auto-generated method stub
		if(trinhDo.equalsIgnoreCase("Cử nhân")) {
			this.phuCap=PHU_CAP_DOI_VOI_CU_NHAN;
		}
		else if(trinhDo.equalsIgnoreCase("Thạc sĩ")) {
			this.phuCap=PHU_CAP_DOI_VOI_THAC_SI;
		}
		else if(trinhDo.equalsIgnoreCase("Tiến sĩ")) {
			this.phuCap=PHU_CAP_DOI_VOI_TIEN_SI;
		}
		return this.phuCap;
	}
	
	



	@Override
	public void nhapThongTinCanBo() {
		// TODO Auto-generated method stub
		super.nhapThongTinCanBo();
		
		System.out.print("Khoa: ");
		khoa=scanner.nextLine();
		System.out.print("Trình độ: ");
		trinhDo=scanner.nextLine();
		do {
			System.out.print("Số tiết dạy: ");
			soTietDay=scanner.nextInt();
		}while(soTietDay<=0);
	}

	@Override
	public long luong() {
		// TODO Auto-generated method stub
		return (long)(this.getHeSoLuong()*730)+this.phuCap()+(this.soTietDay*45);
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Khoa: "+this.khoa+", Trình độ: "+this.trinhDo+", Số tiết dạy: "+this.soTietDay;
	}
	
	
	
	
	

}
