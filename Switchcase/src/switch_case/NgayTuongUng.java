package switch_case;
import java.util.Scanner;
public class NgayTuongUng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int Thang,max=0,nam;
		do {
			System.out.println("Nhập vào một tháng: ");
			Thang=scanner.nextInt();
			if(Thang<1 || Thang>12) {
				System.out.println("Tháng nhập không hợp lệ!");
			}
		}while(Thang<1 || Thang>12);
		System.out.println("Nhập vào một năm: ");
		nam=scanner.nextInt();
		switch(Thang) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			max=31;break;
		case 4:case 6:case 9:case 11:
			max=30;break;
		case 2:
			if(nam%4==0 && nam%100!=0) {
				max=29;
			}
			else if(nam%400==0 && nam%100==0) {
				max=29;
			}
			else {
				max=28;
			}
			break;
		}
		System.out.println("Ngày tương ứng với tháng "+Thang+" có: "+max+" ngày.");

	}

}
