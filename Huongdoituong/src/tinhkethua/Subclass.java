package tinhkethua;

public class Subclass extends SuperClass{
	int number=20;
	
	public void hienThi() {
		System.out.println("Đây là phương thức hienThi() của lớp con.");
	}
	
	public void show() {
		Subclass subclass=new Subclass();
		/*
		 * vì phương thức của lớp cha trùng với phương thức của lớp con
		 * nên ta sử dụng từ khóa super gọi phương thức của lớp cha để phân biệt
		 */
		super.hienThi();
		// gọi phương thức hienThi() của lớp con
		subclass.hienThi();
		
		// hiển thị giá trị biến number của lớp cha
		System.out.println("Giá trị biến number của lớp cha = "+super.number);
		// hiển thị giá trị biến number của lớp con
		System.out.println("Giá trị biến number của lớp con = "+subclass.number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass subclass=new Subclass();
		subclass.show();

	}

}
