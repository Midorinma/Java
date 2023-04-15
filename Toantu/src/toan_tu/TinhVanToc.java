package toan_tu;
import java.text.DecimalFormat;
public class TinhVanToc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat decimalFormat=new DecimalFormat("#.###");
		int s=40*1000;
		int t=1*60*60+40*60+12;
		float v=(float)s/t;
		System.out.println("Vận tốc= "+decimalFormat.format(v)+" (m/s)");

	}

}
