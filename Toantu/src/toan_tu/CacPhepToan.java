package toan_tu;
import java.util.Scanner;
public class CacPhepToan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int so1,so2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập vào số thứ nhất: ");
		so1=scanner.nextInt();
		System.out.println("Nhập vào số thứ hai");
		so2=scanner.nextInt();
		System.out.println(so1+" + "+so2+" = "+(so1+so2));
		System.out.println(so1+" - "+so2+" = "+(so1-so2));
		System.out.println(so1+" * "+so2+" = "+(so1*so2));
		System.out.println(so1+" / "+so2+" = "+(so1/so2));
		System.out.println(so1+" % "+so2+" = "+(so1%so2));
		//So sanh 
		System.out.println("Số lớn nhất là: "+Integer.max(so1, so2));

	}

}
