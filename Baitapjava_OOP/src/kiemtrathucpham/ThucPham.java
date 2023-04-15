package kiemtrathucpham;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ThucPham {
	private int maHang;
	private String tenHang;
	private double donGia;
	private Date nSX,hSD;
	Scanner scanner=new Scanner(System.in);
	
	public ThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThucPham(int maHang, String tenHang, double donGia, Date nSX, Date hSD) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.nSX = nSX;
		this.hSD = hSD;
	}

	public int getMaHang() {
		return maHang;
	}

	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public Date getnSX() {
		return nSX;
	}

	public void setnSX(Date nSX) {
		this.nSX = nSX;
	}
	
	public Date gethSD() {
		return hSD;
	}

	public void sethSD(Date hSD) {
		this.hSD = hSD;
	}
	

	//Khởi tạo phương thức để nhập năm tháng ngày sản xuất
	public void setNSX(int year, int month, int day) {
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, month-1, day);
		this.nSX=calendar.getTime();
	}
	
	//Khởi tạo phương thức để nhập hạn sử dụng
	public void setHSD(int year , int month, int day) {
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, month-1, day);
		this.hSD=calendar.getTime();
	}
	
	//Khởi tạo phương thức để kiểm tra tên hàng không được để trống
	public boolean kiemTraTenHang(boolean k) {
		if(this.tenHang=="" || this.tenHang.isEmpty()) {
			System.out.println("Tên hàng không được để trống");
		}else {
			k=false;
		}
		return k;
	}
	
	//Khởi tạo hàm kiểm tra ngày hết hạn không được nhỏ hơn ngày sản xuất
	public boolean kiemTraNgay(boolean t) {
		if(this.getnSX().compareTo(this.gethSD())<0) {
			t=false;
		}else {
			System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất.");
		}
		return t;
	}
	
	//khởi tạo phương thức kiểm tra hạn sử dụng của sản phẩm đã hết hạn hay còn hạn
	public void kiemTraHanSuDung() {
		Date today=new Date();
		today.getTime();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		String str1=simpleDateFormat.format(today);
		if(this.gethSD().compareTo(today)<0) {
			System.out.println("Hôm nay là ngày "+str1+" hàng hóa đã hết hạn");
		}else {
			 System.out.println("Hôm nay là ngày " + str1 + ", hàng hóa vẫn còn hạn ");
        }
		
	}

	@Override
	public String toString() {
		//Định dạng đơn giá
		Locale localeVN=new Locale("vi","VN");
		NumberFormat numberFormat=NumberFormat.getCurrencyInstance(localeVN);
		String str=numberFormat.format(donGia);
		
		//Định dạng ngày tháng năm
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		
		return "Mã hàng: "+this.maHang+", Tên hàng: "+this.tenHang+", Đơn giá: "+str+
				", Ngày sản xuất: "+simpleDateFormat.format(nSX)+", Ngày hết hạn: "+simpleDateFormat.format(hSD);
	}

	
	
	
	

}
