package tinhdahinh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Shape();
		shape.show();	//Hiển thị dòng đây là phương thức show của lớp Shape
		
		//Bản chất của Shape là shape, nhưng vì khai báo Rectangle nên chúng ta chỉ nhìn thấy những gì mà rectangle có
		//Vì vậy sẽ chạy những hàm của Rectangle
		shape=new Rectangle();
		shape.show();	// hiển thị dòng "Đây là phương thức show() của lớp Rectangle"
		
		// tương tự lúc này shape sẽ đóng vai trò là 1 Square
		shape=new Square();
		shape.show();	// hiển thị dòng "Đây là phương thức show() của lớp Square"
    
	}

}
