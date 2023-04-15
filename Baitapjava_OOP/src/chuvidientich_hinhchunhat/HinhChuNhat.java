package chuvidientich_hinhchunhat;

public class HinhChuNhat {
	private int chieuDai,chieuRong;

	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhChuNhat(int chieuDai, int chieuRong) {
		super();
		
			if(chieuDai<chieuRong) {
				System.out.println("Chiều dài phải lớn hơn chiều rộng!");
				return;
			}
		
		
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		if(chieuDai<=0) {
			System.out.println("Chiều dài phải lớn hơn 0.");
			
		}
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		if(chieuRong<=0) {
			System.out.println("Chiều rộng phải lớn hơn 0.");
			
		}
		this.chieuRong = chieuRong;
	}

	public int tinhDienTich() {
		return this.chieuDai*this.chieuRong;
	}
	
	public int tinhChuVi() {
		return (this.chieuDai+this.chieuRong)*2;
	}
	

}
