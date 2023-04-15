package doituongphamvitruycap;

public class Student {

	public static void main(String[] args) {
		 // Khởi tạo đối tượng của lớp ClassOfStudent
		ClassOfStudent classOfStudent=new ClassOfStudent();
		
		// truy cập phương thức inputYourClass() và showInformation() của lớp ClassOfStudent<br />
		classOfStudent.inputYourClass();
		
		// hiển thị thông tin vừa nhập
		classOfStudent.showInformation();
		/*
		 * Chúng ta nhận thấy trong lớp ClassOfStudent có 2 phương thức inputYourClass() và showInformation() 
		 * được khai báo public. Vì vậy, 2 phương thức này có thể được truy cập 
		 * thông qua đối tượng classOfStudent được khai báo trong lớp Student.
		 */

	}

}
