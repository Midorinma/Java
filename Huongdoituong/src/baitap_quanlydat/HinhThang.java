package baitap_quanlydat;

public class HinhThang extends MiengDat{
	private int dayLon,dayNho,chieuCao;

	public HinhThang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhThang(int dayLon, int dayNho, int chieuCao) {
		super();
		this.dayLon = dayLon;
		this.dayNho = dayNho;
		this.chieuCao = chieuCao;
	}

	public int getDayLon() {
		return dayLon;
	}

	public void setDayLon(int dayLon) {
		this.dayLon = dayLon;
	}

	public int getDayNho() {
		return dayNho;
	}

	public void setDayNho(int dayNho) {
		this.dayNho = dayNho;
	}

	public int getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(int chieuCao) {
		this.chieuCao = chieuCao;
	}
	
	@Override
	public void nhapThongTinMiengDat() {
		// TODO Auto-generated method stub
		super.nhapThongTinMiengDat();
		do {
			System.out.print("Đáy lớn: ");
			dayLon=scanner.nextInt();
			System.out.print("Đáy nhỏ: ");
			dayNho=scanner.nextInt();

		}while((dayLon<=dayNho) || (dayLon<=0) || (dayNho<=0));
		
		System.out.print("Chiều cao: ");
		chieuCao=scanner.nextInt();
	}
	
	@Override
	public long tinhDienTich() {
		// TODO Auto-generated method stub
		return ((this.dayLon+this.dayNho)*this.chieuCao)/2;
	}
	
	@Override
	public long thanhTien() {
		// TODO Auto-generated method stub
		return this.getDonGia()*(long)this.tinhDienTich()*90/100;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Đáy lớn: "+this.dayLon+", Đáy nhỏ: "+this.dayNho+", Chiều cao: "+this.chieuCao;
	}
	

}
