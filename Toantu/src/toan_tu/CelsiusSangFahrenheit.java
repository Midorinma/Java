package toan_tu;
import java.util.Scanner;
public class CelsiusSangFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double celsius;
		System.out.println("Celsius: ");
		celsius=scanner.nextDouble();
		double fahrenheit=(double)9/5*celsius+32;
		System.out.println(celsius+" Độ C = "+fahrenheit+" Độ F");


	}

}
