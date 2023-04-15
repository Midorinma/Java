package quanly_albumcd;

public class CD {
	private int maCD;
	private String tuaCD;
	private String caSi;
	private int soBaiHat;
	private double giaThanh;
	
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CD(int maCD, String tuaCD, String caSi, int soBaiHat, double giaThanh) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSi = caSi;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}

	public String getCaSi() {
		return caSi;
	}

	public void setCaSi(String caSi) {
		this.caSi = caSi;
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	
	public void outPut() {
		System.out.printf("%5d %15s %20s %23d %27f\n",this.maCD,this.tuaCD,this.caSi,this.soBaiHat,this.giaThanh);
	}
	
	

}
