package vonglap;
import java.util.Scanner;
public class UCLN_BCNN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		UCLN_BCNN lonnhat=new UCLN_BCNN();
		int so1,so2,uocChung=1;
		int a=0;
		//Tìm ước chung
		do {
			System.out.println("a= ");
			so1=scanner.nextInt();
			System.out.println("b= ");
			so2=scanner.nextInt();
		}while(so1<0 || so2<0 );
		while(uocChung<=so1) {
			if(so1%uocChung==0 && so2%uocChung==0) {
				a=uocChung;
			}
			uocChung++;
		}
		System.out.println("ước chung lớn nhất của "+so1+" và "+so2+" là: "+a);
		System.out.println("Bội chung nhỏ nhất của "+so1+" và "+so2+" là: "+(so1*so2)/a);
	}

}
