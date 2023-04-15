package xulydulieuso;

import java.util.Locale;

public class TenMaQuocGiaNgonNguKhuVuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale arr[]=Locale.getAvailableLocales();
		for(Locale str : arr) {
			System.out.println("Quốc gia: "+str.getDisplayCountry()+", mã quốc gia: "+
		str.getCountry()+", Ngôn ngữ: "+str.getDisplayLanguage()+
		", mã ngôn ngữ: "+str.getLanguage());
		}

	}

}
