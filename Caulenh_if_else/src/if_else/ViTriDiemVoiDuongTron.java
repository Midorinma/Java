package if_else;
import java.util.Scanner;
public class ViTriDiemVoiDuongTron {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner scanner=new Scanner(System.in);
		//Khai báo
		int trucHoanhX,trucTungX,banKinhO;
		int trucHoanhM,trucTungM,khoangCach;
		System.out.println("Nhập vào trục hoành O(x): ");
		trucHoanhX=scanner.nextInt();
		System.out.println("Nhập vào trục tung O(y): ");
		trucTungX=scanner.nextInt();
		System.out.println("Bán kính O(x,y): ");
		banKinhO=scanner.nextInt();
		System.out.println("Nhập vào trục hoành M(x): ");
		trucHoanhM=scanner.nextInt();
		System.out.println("Nhập vào trục tung M(y): ");
		trucTungM=scanner.nextInt();
		//Tính khoản cách điểm M tới tâm O
		khoangCach=(trucHoanhM-trucHoanhX)*(trucHoanhM-trucHoanhX)+(trucTungM-trucTungX)*(trucTungM-trucTungX);
		if(khoangCach==banKinhO*banKinhO) {
			System.out.println("Điểm M("+trucHoanhM+" , "+trucTungM+") nằm trên đường tròn.");
		}
		if(khoangCach<banKinhO*banKinhO) {
			System.out.println("Điểm M("+trucHoanhM+" , "+trucTungM+") nằm trong đường tròn.");
		}
		if(khoangCach>banKinhO*banKinhO) {
			System.out.println("Điểm M("+trucHoanhM+" , "+trucTungM+") nằm ngoài đường tròn.");
		}


	}

}
