package tinhdonggoi;

import person.Person;

public class KiemTraConNguoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConNguoi conNguoi=new ConNguoi();
		
		// gán giá trị họ tên cho đối tượng person vừa tạo thông qua setHoTen() 
        // và gán số chứng minh nhân dân thông qua setCmnd()
		conNguoi.setHoTen("Vũ Quang Duy");
		conNguoi.setCmnd("123456");
		
		// truy cập đến tên của đối tượng person thông qua phương thức getHoten()
        // và số chứng minh nhân dân thông qua phương thức getCmnd()
		System.out.println("Tên: "+conNguoi.getHoTen()+", số cmnd: "+conNguoi.getCmnd());

	}

}
