package string;

public class XoaKhoangTrang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi="Chào bạn rất vui được làm quen .";
		System.out.println("chuỗi trước khi xóa khoảng trắng: ");
		System.out.println();
		System.out.println("\""+chuoi+"\"");
		System.out.println("chuỗi sau khi xóa khoảng trắng: ");
		System.out.println();
		System.out.println(chuoi.replaceAll(" ",""));
		
	}

}
