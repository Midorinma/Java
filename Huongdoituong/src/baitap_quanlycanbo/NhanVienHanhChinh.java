package baitap_quanlycanbo;

public class NhanVienHanhChinh extends CanBoTrongTruong{
	public String phongBan;
	private int soNgayCong;
	private String chucVu;
	private long phuCap;
	private static long PHU_CAP_DOI_VOI_TRUONG_PHONG=2000;
	private static long PHU_CAP_DOI_VOI_PHO_PHONG=1000;
	private static long PHU_CAP_DOI_VOI_NHAN_VIEN=500;
	
	public NhanVienHanhChinh() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public NhanVienHanhChinh(String phongBan, int soNgayCong, String chucVu, long phuCap) {
		super();
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		this.chucVu = chucVu;
		this.phuCap = phuCap;
	}



	/**
	 * @return the phongBan
	 */
	public String getPhongBan() {
		return phongBan;
	}

	/**
	 * @param phongBan the phongBan to set
	 */
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	/**
	 * @return the soNgayCong
	 */
	public int getSoNgayCong() {
		return soNgayCong;
	}

	/**
	 * @param soNgayCong the soNgayCong to set
	 */
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	/**
	 * @return the chucVu
	 */
	public String getChucVu() {
		return chucVu;
	}

	/**
	 * @param chucVu the chucVu to set
	 */
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Override
	public long phuCap() {
		// TODO Auto-generated method stub
		if(chucVu.equalsIgnoreCase("Trưởng phòng")) {
			this.phuCap=PHU_CAP_DOI_VOI_TRUONG_PHONG;
		}
		else if(chucVu.equalsIgnoreCase("Phó Phòng")) {
			this.phuCap=PHU_CAP_DOI_VOI_PHO_PHONG;
		}
		else if(chucVu.equalsIgnoreCase("Nhân viên")) {
			this.phuCap=PHU_CAP_DOI_VOI_NHAN_VIEN;
		}
		return this.phuCap;
	}



	@Override
	public long luong() {
		// TODO Auto-generated method stub
		return (long) (this.getHeSoLuong()*730)+this.phuCap+(this.soNgayCong*200);
	}



	@Override
	public void nhapThongTinCanBo() {
		// TODO Auto-generated method stub
		super.nhapThongTinCanBo();
		System.out.print("Phòng ban: ");
		phongBan=scanner.nextLine();
		System.out.print("Chức vụ: ");
		chucVu=scanner.nextLine();
		do {
			System.out.print("Số ngày công: ");
			soNgayCong=scanner.nextInt();
		}while(soNgayCong<=0);
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Phòng ban: "+this.phongBan+", Số ngày công: "+this.soNgayCong+", Chức vụ: "+this.chucVu;
	}



	

	
	
	
	
	

}
