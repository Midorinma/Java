package nhapxuatthongtinxe;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehicle> arrVehicles=new ArrayList<>();
		int chon,soLuongXe;
		Scanner scanner=new Scanner(System.in);
		
		
		do {
			System.out.println("-----------------------MENU-------------------------");
			System.out.println("1.Tạo các đối tượng xe và nhập thông tin.");
			System.out.println("2.Xuất bảng kê khai tiền thuế của các xe.");
			System.out.println("Nhập bất kì phím nào để thoát chương trình.");
			System.out.print("Bạn chọn? ");
			chon=scanner.nextInt();
			switch(chon) {
			case 1:
				System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
				soLuongXe=scanner.nextInt();
				for(int i=0; i<soLuongXe; i++) {
					System.out.println("Số lượng xe thứ "+(i+1)+" : ");
					Vehicle vehicle=new Vehicle();
					vehicle.nhapThongTinXe();
					arrVehicles.add(vehicle);
				}
				break;
			case 2:
				System.out.printf("%5s %5s %8s %10s %10s %8s \n","maXe","chuXe","moTa","triGiaXe","dungTichXiLanh","thuePhaiDong");
				System.out.println("--------------------------------------------------------------------");
				for(Vehicle vehicle: arrVehicles) {
					vehicle.outPut();
					
				}
				break;
			default:
				System.out.println("THOÁT CHƯƠNG TRÌNH");
				System.exit(0);
				break;
			}
			
		}while(true);
		

	}

}
