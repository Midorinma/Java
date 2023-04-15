package thuvienxulychuoi;

public class PhuongThuc_Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strBuilder=new StringBuilder();
		
		for(int i=0; i<10; i++) {
			strBuilder.append("Hello lần "+i);
			strBuilder.append("\t"); //nối "\t" vào cuối StringBuilder
		}
		System.out.println(strBuilder);
	}

}
