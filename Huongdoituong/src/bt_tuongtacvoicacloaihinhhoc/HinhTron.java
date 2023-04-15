package bt_tuongtacvoicacloaihinhhoc;

import java.text.DecimalFormat;

public class HinhTron extends HinhHoc{
	private int banKinh;
	DecimalFormat dcf=new DecimalFormat("#.##");
	
	public HinhTron() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhTron(int banKinh) {
		super();
		this.banKinh = banKinh;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return 3.14*banKinh*banKinh;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hình tròn có bán kính = "+this.banKinh+", Diện tích = "+dcf.format(tinhDienTich());
	}
	
	
	
	

}
