package manghaichieu;
import java.util.Scanner;
public class TimMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int dong,cot;
		do {
			System.out.print("Dòng: ");
			dong=scanner.nextInt();
			//Xuống dòng
			System.out.println();
			System.out.print("Cột: ");
			cot=scanner.nextInt();
		}while(dong<0 || cot<0);
		//Khai báo và cấp phát bộ nhớ cho mảng
		int mang[][]=new int[dong][cot];
		//Nhập mảng
		for(int i=0; i<dong; i++) {
			for(int j=0; j<cot; j++) {
				System.out.print("a["+i+"]["+j+"]= ");
				mang[i][j]=scanner.nextInt();
			}
		}
		//Xuất mảng
		for(int i=0; i<dong; i++) {
			for(int j=0; j<cot; j++) {
				System.out.print(mang[i][j]+"\t");
			}
			System.out.println();
		}
		//Tìm MAX
		int col=0,row=0;
		for( int i=0; i<dong; i++) {
			for(int j=0; j<cot; j++) {
				if(mang[i][j]>mang[row][col]) {
					// nếu phần tử A tại vị trí i và j
		            // lớn hơn phần tử A tại vị trí rowPosition và colPosition
		            // thì sẽ lưu lại vị trí của phần tử lớn nhất
		            // bằng cách gán vị trí rowPosition = i và colPosition = j
					col=j;
					row=i;
				}
			}
		}
		System.out.println("Max: "+mang[row][col]+" Tại vị trí "+"["+row+" : "+col+"]");
		
		
		

	}

}
