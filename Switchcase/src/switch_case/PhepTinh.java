package switch_case;
import java.util.Scanner;
public class PhepTinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a,b;
		char phepTinh;
		System.out.println("a = ");
		a=scanner.nextInt();
		System.out.println("b = ");
		b=scanner.nextInt();
		System.out.println("Phep tinh: ");
		phepTinh=scanner.next().charAt(0);
		switch(phepTinh) {
		case '+':
			System.out.println(a+" + "+b+" = "+(float)(a+b));break;
		case '-':
			System.out.println(a+" - "+b+" = "+(float)(a-b));break;
		case '*':
			System.out.println(a+" * "+b+" = "+(float)(a*b));break;
		case '/':
			if(b==0) {
				System.out.println("Số bị chia phải khác 0.");
			}else {
				System.out.println(a+" / "+b+" = "+(float)a/b);break;
			}
		default:
			System.out.println("Kết quả không hợp lệ.");
		}

	}

}
