package quanlythuvien;

public class KindOfBook extends Document{
	protected String tenTacGia;
	protected int soTrang;
	
	public KindOfBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KindOfBook(String tenTacGia, int soTrang) {
		super();
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public void nhapThongTinTaiLieu() {
		// TODO Auto-generated method stub
		super.nhapThongTinTaiLieu();
		
		System.out.print("Tên tác giả: ");
		tenTacGia=scanner.nextLine();
		System.out.print("Số trang: ");
		soTrang=scanner.nextInt();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Tên tác giả: "+this.tenTacGia+", Số trang: "+this.soTrang;
	}
	
	
	

}
