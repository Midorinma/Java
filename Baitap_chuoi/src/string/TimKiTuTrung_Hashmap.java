package string;

import java.util.HashMap;
import java.util.Set;

public class TimKiTuTrung_Hashmap {
	public void timKiem(String str) {
		//Khai báo HashMap
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		//chuyển chuỗi sang dạng mảng
		char mang[]=str.toCharArray();
		
		/*
         * char được chèn dưới dạng khóa và
         *  được tính là giá trị. Nếu map đã chứa char
         *  rồi thì hãy tăng giá trị lên 1.
         * */
		for(Character ch : mang) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		//lấy key ra
		Set<Character> keys=map.keySet();
		
		/*
        Hiển thị số lượng ký tự nếu nó là
        lớn hơn 1. Tất cả các ký tự trùng lặp sẽ
        có giá trị lớn hơn 1.
       */
		for(Character ch : keys) {
			if(map.get(ch)>1) {
				System.out.println("Char: "+ch+" số lần xuất hiện: "+map.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimKiTuTrung_Hashmap tim=new TimKiTuTrung_Hashmap();
		System.out.println("Tìm kí tự trùng ");
		tim.timKiem("Chào bạn đến với java!");
	

	}

}
