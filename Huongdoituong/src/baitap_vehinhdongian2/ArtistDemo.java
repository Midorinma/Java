package baitap_vehinhdongian2;



public class ArtistDemo {

	public static void main(String[] args) {
		
		System.out.println("Vẽ hình chữ nhật có chiều dài = 8 và chiều rộng = 4");
		int chieuDai=8,chieuRong=4;
		// khai báo biến Shape; dùng biến này để khởi tạo cho đối tượng Rectangle
		Shape shape=new Rectangle(chieuDai, chieuRong);
		//tạo đối tượng Artist để vẽ hình chữ nhật này
		Artist artist=new Artist();
		artist.drawShape(shape);
		
		 System.out.println("\nVẽ hình tam giác vuông có cạnh vuông = 20");
		//dùng lại biến Shape để khởi tạo cho đối tượng RightTriangle với cạnh là 20
		shape=new RightTriangle(20);
		//dùng đối tượng Artist để vẽ hình tam giác này.
		artist.drawShape(shape);
		
		
		
		
		
		

	}

}
