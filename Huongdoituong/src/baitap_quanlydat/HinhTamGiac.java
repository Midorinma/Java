package baitap_quanlydat;

public class HinhTamGiac extends MiengDat{
	private int day,chieuCao;

	public HinhTamGiac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhTamGiac(int day, int chieuCao) {
		super();
		this.day = day;
		this.chieuCao = chieuCao;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
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
			System.out.print("Đáy: ");
			day=scanner.nextInt();
			System.out.print("Chiều cao: ");
			chieuCao=scanner.nextInt();
		}while(day<0 ||  chieuCao<0);
	}
	
	@Override
	public long tinhDienTich() {
		// TODO Auto-generated method stub
		return (this.day * this.chieuCao)/2;
	}
	
	@Override
	public long thanhTien() {
		// TODO Auto-generated method stub
		return (this.getDonGia()*(long)this.tinhDienTich())*90/100;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Đáy: "+this.day+", Chiều cao: "+this.chieuCao;
	}

}
