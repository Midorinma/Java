package vonglap;
import java.util.Scanner;
public class TinhTienTaxi {

	public static void main(String[] args) {
		// Khai báo hằng số giờ mở cửa
		final int star=14000;
		final int mid_25=16300;
		final int finish_26=13300;
		float km;
		long money=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập vào số km đã đi: ");
		km=scanner.nextLong();
		while(km<0) {
			System.out.println("Nhập vào số km đã đi: ");
			km=scanner.nextLong();
		}
		if(km<=0.8) {
			money=14000;
		}else {
			if(km<=25) {
				money=(long)(star+mid_25*(km-0.8));
			}else {
				money=(long)(star+mid_25*(25-0.8)+finish_26*(km-25-0.8));
			}
		}
		System.out.println("Số tiền đi được "+km+" là: "+money+" đồng");
		

	}

}
