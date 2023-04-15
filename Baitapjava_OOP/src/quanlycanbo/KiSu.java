package quanlycanbo;

public class KiSu extends CanBo{
	protected String nganhDaoTao;

	public KiSu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KiSu(String nganhDaoTao) {
		super();
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	@Override
	public void nhapThongTinCanBo() {
		// TODO Auto-generated method stub
		super.nhapThongTinCanBo();
		System.out.print("Ngành đào tạo: ");
		nganhDaoTao=scanner.nextLine();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Ngành đào tạo: "+this.nganhDaoTao;
	}
	
	

}
