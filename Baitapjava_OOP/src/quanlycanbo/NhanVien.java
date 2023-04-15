package quanlycanbo;

public class NhanVien extends CanBo{
	protected String congViec;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String congViec) {
		super();
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	@Override
	public void nhapThongTinCanBo() {
		// TODO Auto-generated method stub
		super.nhapThongTinCanBo();
		System.out.print("Công việc: ");
		congViec=scanner.nextLine();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Công việc: "+this.congViec;
	}
	
	


	
	

}
