package xulysongaunhien;

import java.util.Random;
import java.util.Scanner;

public class ChoiGameDoanSo {

	public static void main(String[] args) {
		// Khai báo
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int soNhap;
		int diemGoc=5;
		int rand;
		while(diemGoc>0 && diemGoc<10) {
			do {
				System.out.print("Nhập một số từ 1->5: ");
				soNhap=scanner.nextInt();
				if(soNhap<1 || soNhap>5) {
					System.out.println("Số nhập không hợp lệ! xin kiểm tra lại.");
				}
			}while(soNhap<1 || soNhap>5);
			rand=1+random.nextInt(5);
			if(soNhap==rand) {
				diemGoc++;
				System.out.println("-->Success!");
				System.out.println("heart: "+diemGoc);
				
				if(diemGoc==10) {
					System.out.println("Congratulations! You Win!");
					return;
				}
			}
			else if(soNhap!=rand) {
				diemGoc--;
				System.out.println("-->Don't worry! You Lose!");
				System.out.println("heart: "+diemGoc);
				
				if(diemGoc==0) {
					System.out.println("Game Over!");
					return;
				}
			}
		}

	}

}
