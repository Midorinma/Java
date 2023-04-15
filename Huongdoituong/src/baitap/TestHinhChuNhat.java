package baitap;

public class TestHinhChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hcn=new HinhChuNhat();
		hcn.nhap();
		System.out.println("Hiển thị: ");
		hcn.hienThi(hcn.chieuDai, hcn.chieuRong);
		
		System.out.println("Kết quả: ");
		hcn.ketQua(hcn.cv, hcn.dt);

	}

}
