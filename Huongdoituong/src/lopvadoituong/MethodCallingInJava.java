package lopvadoituong;

	public class MethodCallingInJava{
		//Tạo 1 phương thức có kiểu trả về là void và không có tham số truyền vào
		//Để gọi phương thức này trong main() thì phải khai báo static
		public static void nhap() {
			System.out.println("Đây là ví dụ minh họa cách gọi phương thức void không đối trong Java");
		}
		
		//Tạo một phương thức có kiểu trả về là void và có tham số truyền vào
		public static void nhapCoDoiSo(String str) {
			System.out.println(str);
		}
		
		//Tạo 1 phương thức có kiểu trả về là int và có hai tham số truyền vào có kiểu int
		public static int tinhTong(int a, int b) {
			return a+b;
		}
	

	public static void main(String[] args) {
		
		nhap();//Gọi phương thức nhập
		nhapCoDoiSo("Đây là ví dụ minh họa cách gọi phương thức void có đối số trong Java");
		
		System.out.println("\nĐây là ví dụ minh họa cách gọi phương thức có kiểu trả về"
				+ " là int và có tham số truyền vào trong Java");
		
		int c=tinhTong(3, 5);//c=a+b
		System.out.println("c = "+c);
		

		}
	}


