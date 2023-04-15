package if_else;
import java.util.Scanner;
import java.text.DecimalFormat;
public class XepLoaiKetQuaMonHoc {

	public static void main(String[] args) {
		// Khởi tạo biến truy xuất đến thư viên util.scanner
		Scanner scanner=new Scanner(System.in);
		DecimalFormat decimalFormat=new DecimalFormat("#.#");
		//Khai báo biến
		float diemChuyenCan,diemKiemTra,diemThi,diemTrungBinh;
		//Câu lệnh nhập điểm
		System.out.println("Điểm chuyên cần: ");
		diemChuyenCan=scanner.nextFloat();
		System.out.println("Điểm kiểm tra: ");
		diemKiemTra=scanner.nextFloat();
		System.out.println("Điểm thi: ");
		diemThi=scanner.nextFloat();
		// giới hạn điều kiện điểm
		if((diemChuyenCan<0 || diemChuyenCan>10)||(diemKiemTra<0 || diemKiemTra>10)|| (diemThi<0 || diemThi>10)) {
			System.out.println("Diểm Nhập vào không hợp lệ! ");
			return;
		}
		//Tính điểm trung bình
		diemTrungBinh= (float) ((((diemChuyenCan+diemKiemTra*2.0)/3)*0.4)+(diemThi*0.6));
		decimalFormat.format(diemTrungBinh);
		if(diemTrungBinh>=8.5) {
			System.out.println("Xếp loại A");
		}
		else if(diemTrungBinh>=7 && diemTrungBinh<8.5) {
			System.out.println("Xếp loại B");
		}
		else if(diemTrungBinh>=5.5 && diemTrungBinh<7) {
			System.out.println("Xếp loại C");
		}
		else if(diemTrungBinh>=4 && diemTrungBinh<5.5) {
			System.out.println("Xếp loại D");
		}
		else {
			System.out.println("Xếp loại F");
		}
		

	}

}
