package bt_luongnhanvien;

public class NhanVienToanThoiGian extends NhanVien{
	private int soNgayLamThem,choose;
	private String loaiNhanVien;
	private static long LUONG_NV_LA_SEP=20000000;
	private static long LUONG_NV_BINH_THUONG=10000000;
	private static long LUONG_LAM_THEM=800000;
	
	public NhanVienToanThoiGian() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienToanThoiGian(int soNgayLamThem, String loaiNhanVien) {
		super();
		this.soNgayLamThem = soNgayLamThem;
		this.loaiNhanVien = loaiNhanVien;
	}

	/**
	 * @return the soNgayLamThem
	 */
	public int getSoNgayLamThem() {
		return soNgayLamThem;
	}

	/**
	 * @param soNgayLamThem the soNgayLamThem to set
	 */
	public void setSoNgayLamThem(int soNgayLamThem) {
		this.soNgayLamThem = soNgayLamThem;
	}

	/**
	 * @return the loaiNhanVien
	 */
	public String getLoaiNhanVien() {
		return loaiNhanVien;
	}

	/**
	 * @param loaiNhanVien the loaiNhanVien to set
	 */
	public void setLoaiNhanVien(String loaiNhanVien) {
		this.loaiNhanVien = loaiNhanVien;
	}

	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		super.nhapThongTin();
		System.out.print("Nhập số ngày làm thêm: ");
		soNgayLamThem=scanner.nextInt();
		 System.out.print("Nhập loại nhân viên (1 - bình thường, 2 - sếp): ");
		 choose=scanner.nextInt();
		 switch(choose) {
		 case 1:
			 loaiNhanVien="Nhân viên bình thường";
			 break;
		 case 2:
			 loaiNhanVien="Sếp";
			 break;
		default:
			System.out.println("Nhập loại nhân viên không đúng.");
			break;
		 }
	}

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		if(loaiNhanVien.equals("Nhân viên bình thường")) {
			luongNhanVien=LUONG_NV_BINH_THUONG+this.soNgayLamThem*LUONG_LAM_THEM;
		}
		else if(loaiNhanVien.equals("Sếp")) {
			luongNhanVien=LUONG_NV_LA_SEP+this.soNgayLamThem*LUONG_LAM_THEM;
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Loại nhân viên: "+this.loaiNhanVien+", Số ngày làm thêm: "+this.soNgayLamThem;
	}
	
	
	
	
	
	
	

}
