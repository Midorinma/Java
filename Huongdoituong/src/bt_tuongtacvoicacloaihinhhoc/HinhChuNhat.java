package bt_tuongtacvoicacloaihinhhoc;

public class HinhChuNhat extends HinhHoc{
	private int chieuDai,chieuRong;

	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhChuNhat(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return chieuDai*chieuRong;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hình chữ nhật có chiều dài = "+this.chieuDai+
				", Chiều rộng = "+this.chieuRong+", diện tích = "+tinhDienTich();
	}
	
	
	
	

}
