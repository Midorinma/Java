package thuvienxulychuoi;

import java.util.StringTokenizer;

public class KhaiBao_StringTokenizer {

	public static void main(String[] args) {
		//Dạng 1: tạo một stringTokenize mới
		// với str là chuỗi mà chúng ta cần tách ra thành các token
		String str="StringTokenizer dạng 1";
		StringTokenizer stringTokenizer=new StringTokenizer(str);
		
		
		// Dạng 2: Tạo 1 StringTokenizer mới
		// với str1 là chuỗi mà chúng ta cần tách ra thành các token
		// và ký tự phân tách là "\n"
		String str1="StringTokenizer dạng 2";
		StringTokenizer stringTokenizer2=new StringTokenizer(str, "\n");
		
		// Dạng 3: Tạo 1 StringTokenizer mới
		// với str2 là chuỗi mà chúng ta cần tách ra thành các token
		// ký tự phân cách là "\t"
		// returnDelims có giá trị là true.
		String str2 = "StringTokenizer dạng 3";
	    StringTokenizer stringTokenizer3 = new StringTokenizer(str2, "\t", true);

	}

}
