package bt_quanlythuebaointernet;

import java.util.ArrayList;

public class DanhSachThueBao {
	
	ArrayList<ThueBao> arrThueBao=new ArrayList<>();
	long tongCuocThueBaoDialUp = 0, tongCuocThueBaoADSL = 0, tongCuocThueBaoT1 = 0;
	
	public DanhSachThueBao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void themThongTin(ThueBao thueBao) {
		arrThueBao.add(thueBao);
	}
	
	public void hienThiDanhSach() {
		for(int i=0; i<arrThueBao.size(); i++) {
			System.out.println(arrThueBao.get(i).toString());
		}
	}
	
	public void tinhTongCuocCuaTungLoaiThueBao() {
		for(ThueBao tb : arrThueBao) {
			if(tb instanceof DialUp) {
				tongCuocThueBaoDialUp+=tb.tinhTien();
			}
			else if(tb instanceof ADSL) {
				tongCuocThueBaoADSL+=tb.tinhTien();
			}
			else {
				tongCuocThueBaoT1+=tb.tinhTien();
			}
		}
		System.out.println("Tổng cước thuê bao Dial Up = "+tongCuocThueBaoDialUp);
		System.out.println("Tổng cước thuê bao ADSL = "+tongCuocThueBaoADSL);
		System.out.println("Tổng cước thuê bao T1 = "+tongCuocThueBaoT1);
	}
	
	public void tinhTongCuocCuaTatCaCacThueBao() {
		long tongCuocThueBao=tongCuocThueBaoDialUp+tongCuocThueBaoADSL+tongCuocThueBaoT1;
		System.out.println("Tổng cước của tất cả  các thuê bao trong tháng: "+tongCuocThueBao);
	}
	
	public void hienThiThueBaoCoTienCuocLonNhat() {
		long temp=0;
		ADSL thueBaoADSL=new ADSL();
		for(ThueBao tb : arrThueBao) {
			if(tb instanceof ADSL) {
				if(temp<tb.tinhTien()) {
					temp=tb.tinhTien();
					thueBaoADSL=(ADSL) tb;
				}
			}
		}
		System.out.println("Thuê bao ADSL có tiền cước lớn nhất là "+thueBaoADSL.toString());
	}

}
