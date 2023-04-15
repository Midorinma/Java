package thuvienxulychuoi;

public class KhaiBao_StringBuilder {

	public static void main(String[] args) {
		//Dạng 1: tạo 1 StringBuilder rỗng có khả năng lưu trữ 16 kí tự.
		StringBuilder strBuilder=new StringBuilder();
		
		//Dạng 2: tạo 1 StringBuilder rỗng có khả năng lưu trữ kí tự =32
		StringBuilder strBuilder2=new StringBuilder(32);
		
		//Dạng 3: tạo 1 StringBuilder từ một chuỗi str có sẵn
		//Khả năng lưu trữ của StringBuilder3 = 16 + Chiều dài của chuỗi
		String str="Hello World!";
		StringBuilder strBuilder3= new StringBuilder(str);
		

	}

}
