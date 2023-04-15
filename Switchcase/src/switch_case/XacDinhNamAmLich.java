package switch_case;
import java.util.Scanner;
public class XacDinhNamAmLich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new  Scanner(System.in);
		int duongLich;
		int can,chi;
		String tan="",thi="";
		System.out.println("Năm dương lịch: ");
		duongLich=scanner.nextInt();
		//Năm âm lịch=Can+Chi
		//tính Can
		can=duongLich%10;
		chi=duongLich%12;
		switch(can) {
		case 0:
			tan="Canh";break;
		case 1:
			tan="Tân";break;
		case 2:
			tan="Nhâm";break;
		case 3:
			tan="Qúy";break;
		case 4:
			tan="Gíap";break;
		case 5:
			tan="Ất";break;
		case 6:
			tan="Bính";break;
		case 7:
			tan="Đinh";break;
		case 8:
			tan="Mậu";break;
		case 9:
			tan="Kỷ";break;
		}
		//tính chi
		switch(chi) {
		case 0:
			thi="Thân";break;
		case 1:
			thi="Dậu";break;
		case 2:
			thi="Tuất";break;
		case 3:
			thi="Hợi";break;
		case 4:
			thi="Tý";break;
		case 5:
			thi="Sửu";break;
		case 6:
			thi="Dần";break;
		case 7:
			thi="Mẹo";break;
		case 8:
			thi="Thìn";break;
		case 9:
			thi="Tỵ";break;
		case 10:
			thi="Ngọ";break;
		case 11:
			thi="Mùi";break;
		}
		System.out.println("Năm âm lịch tương ứng với năm dương lịch "+duongLich+" Là: "+tan+" "+thi);

	}

}
