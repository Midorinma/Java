/**
 * 
 */
package interface_java;

/**
 * @author ADMIN
 *
 */
public class Main1 implements Student {

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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Việc định nghĩa một Interface giống như định nghĩa một KIỂU DỮ LIỆU tham chiếu mới.
		 *  Nếu chúng ta khai báo một đối tượng có kiểu dữ liệu là một Interface
		 *   thì đối tượng đó phải được khởi tạo là một đối tượng của LỚP implement Interface.
		 */
		Student student=new Main1();
		student.nhap();
		student.hienThi();
		student.nhapDiem();

	}

}
