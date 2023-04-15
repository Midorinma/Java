package hashmap;

import java.util.HashMap;

public class ViDu1 {

	public static void main(String[] args) {
		//Khai báo HashMap
		HashMap<String, Integer> map=new HashMap<>();
		//gán key cho value
		map.put("One",1);
		map.put("Two",2);
		map.put("Three",3);
		
		// Thêm cặp Key-Value chỉ khi key không tồn tại trong HashMap
        // hoặc được ánh xạ tới null
		map.putIfAbsent("Four",4);
		System.out.println(map);

	}

}
