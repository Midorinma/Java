package interface_java;

public class Main implements Student {

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		System.out.println("Đây là phương thức nhap() của Interface Person");

	}

	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		System.out.println("Đây là phương thức hienThi() của Interface Person");

	}

	@Override
	public void nhapDiem() {
		// TODO Auto-generated method stub
		 System.out.println("Đây là phương thức nhapDiem() của Interface Student");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main=new Main();
		
		main.nhap();
		main.hienThi();
		main.nhapDiem();

	}

}
