package quanlythuvien;

public class Newspaper extends Document{
	protected int ngayPhatHanh;

	public Newspaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Newspaper(int ngayPhatHanh) {
		super();
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public void nhapThongTinTaiLieu() {
		// TODO Auto-generated method stub
		super.nhapThongTinTaiLieu();
		System.out.print("Ngày phát hành: ");
		ngayPhatHanh=scanner.nextInt();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Ngày phát hành: "+this.ngayPhatHanh;
	}
	
	

}
