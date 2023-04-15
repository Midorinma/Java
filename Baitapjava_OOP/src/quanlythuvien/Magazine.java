package quanlythuvien;

public class Magazine extends Document{
	protected int soPhatHanh;
	protected int thangPhatHanh;
	
	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Magazine(int soPhatHanh, int thangPhatHanh) {
		super();
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public void nhapThongTinTaiLieu() {
		// TODO Auto-generated method stub
		super.nhapThongTinTaiLieu();
		System.out.print("Số phát hành: ");
		soBanPhatHanh=scanner.nextInt();
		System.out.print("Tháng phát hành: ");
		thangPhatHanh=scanner.nextInt();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Số phát hành: "+this.soPhatHanh+", Tháng phát hành: "+this.thangPhatHanh;
	}
	
}
