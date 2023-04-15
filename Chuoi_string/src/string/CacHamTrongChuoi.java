package string;
import java.util.Scanner;
public class CacHamTrongChuoi {

	public static void main(String[] args) {
		// HÀM SO SÁNH
		String chuoi1="chào bạn";
		String chuoi2=" rất vui làm quen với chào bạn ";
		int soSanh=chuoi1.compareTo(chuoi2);
		if(soSanh==0) {
			System.out.println(chuoi1+" = "+chuoi2);
		}
		else if(soSanh<0) {
			System.out.println(chuoi1+" < "+chuoi2);
		}else {
			System.out.println(chuoi1+" > "+chuoi2);
		}
		
		//HÀM TRẢ VỀ VỊ TRÍ XUẤT HIỆN ĐẦU TIÊN CỦA MỘT CHUỖI TRONG CHUỖI KHÁC
		int result=chuoi1.indexOf(chuoi2);
		System.out.println("Vị trí đầu tiên xuất hiện chuỗi "+chuoi2+" Trong chuỗi "+chuoi1+" Là: "+result);
		/*
		 * chuỗi ngắn bên trong chuỗi dài sẽ ra kết quả >=0
		 * chuỗi dài bên trong chuỗi ngăn sẽ cho kết quả -1
		 */
		
		//HÀM TRẢ VỀ VỊ TRÍ XUẤT HIỆN CUỐI CÙNG CỦA MỘT CHUỖI BÊN TRONG CHUỖI KHÁC
		int ketQua=chuoi2.lastIndexOf(chuoi1);
		System.out.println("Vị trí cuối cùng xuất hiện chuỗi "+chuoi1+" bên trong chuỗi "+chuoi2+" là: "+ketQua);
		/*
		 * tìm thấy chuỗi 1 tại vị trí 21 bên trong chuỗi 2
		 */
		
		//HÀM THAY THẾ MỘT CHUỖI CON TRONG CHUỖI KÍ TƯ BẰNG MỘT CHUỖI KHÁC
		//thay thế một kí tự không có trong chuỗi
		System.out.println(chuoi1.replace("q","a"));//vì không tìm được q trong chuỗi nên thay thế bằng a
		//Thay thế kí tự 'o' bằng kí tự 'i'
		System.out.println(chuoi1.replace('o','i'));
		
		//HÀM LOẠI BỎ KHOẢNG TRẮNG THỪA Ở ĐẦU VÀ CUỐI CHUỖI
		chuoi2=chuoi2.trim();
		System.out.println(chuoi2);
		
		//HÀM TẠO MỘT CHUỖI CON TỪ VỊ TRÍ INDEX TRONG CHUỖI CHA
		String chuoicon=chuoi2.substring(12);// lấy ở vị trí quen với bạn trong chuỗi 2 đến hết
		String con=chuoi2.substring(12, 16);// lấy ở vị trí quen từ vị trí bắt đầu đến vị trí kết thúc
		System.out.println(chuoicon);
		System.out.println(con);


	}

}
