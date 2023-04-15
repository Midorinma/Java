package thuvienxulychuoi;

public class PhuongThuc_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder=new StringBuilder("StringBuilder");
		
		
		//Xóa các kí tự trong một chuỗi con của StringBuilder
		//Chuỗi con này bắt đầu tại chỉ số 3 và kéo dài đến ký tự có chỉ số 7
		stringBuilder.delete(3, 8);
		System.out.println("StringBuilder sau khi xóa là: "+stringBuilder);
		
		//Nếu chỉ số star=end thì sẽ không có bất kì sự thay đổi nào
		stringBuilder.delete(3, 3);
		System.out.println("StringBuilder sau khi xóa là: "+stringBuilder);
		
		//Xóa 1 kí tự trong StringBuilder có chỉ số=6 trong stringbuilder
		StringBuilder stringBuilder2=new StringBuilder("StringBuilder1");
		stringBuilder2.deleteCharAt(6);
		System.out.println("StringBuilder sau khi xóa là: "+stringBuilder2);

	}

}
