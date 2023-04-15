package toan_tu;
import java.text.DecimalFormat;
public class TinhDanSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat decimalFormat=new DecimalFormat("#.##");
		int treEm=7,nguoiNhapCu=45,nguoiQuaDoi=13;
		int soGiay;
		double danSoHienTai=312032486;
		soGiay=365*24*60*60;
		double slTreEmSinhRa=soGiay/treEm;
		double slNguoiQuaDoi=soGiay/nguoiQuaDoi;
		double slNguoiNhapCu=soGiay/nguoiNhapCu;
		for(int i=1; i<=5; i++) {
			danSoHienTai+=slTreEmSinhRa + slNguoiNhapCu - slNguoiQuaDoi;
			System.out.println("Số dân năm thứ "+i+" là: "+decimalFormat.format(danSoHienTai));
		}
	}

}
