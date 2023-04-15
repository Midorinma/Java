package quanlytk_nganhang;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Account a[]=null;
		int k, b, n = 0;
	    long s, d, c, f;
	    boolean flag=true;
	    
	    do {
	    	System.out.println("1.Nhập thông tin của các khách hàng.");
	    	System.out.println("2.Xuất danh sách thông tin của các khách hàng.");
	    	System.out.println("3.Nạp tiền.");
	    	System.out.println("4.Rút tiền.");
	    	System.out.println("5.Đáo hạn.");
	    	System.out.println("6.Chuyển khoản.");
	    	System.out.println("Nhập số khác để thoát");
	    	System.out.print("Bạn chọn? ");
	    	b=scanner.nextInt();
	    	switch(b) {
	    	case 1: 
	    		System.out.print("Nhập số lượng khách hàng bạn muốn nhập: ");
	    		n=scanner.nextInt();
	    		a=new Account[n];
	    		for(int i=0; i<n; i++) {
	    			System.out.println("Khách hàng số "+(i+1)+" : ");
	    			a[i]=new Account();
	    			a[i].themThongTin();
	    		}
	    		break;
	    	case 2:
	    		System.out.printf("%3s %7s %20s\n","SoTK","TenTK","SoTienTrongTK");
	    		for(int i=0; i<n; i++) {
	    			a[i].hienThi();
	    		}
	    		break;
	    	case 3:
	    		System.out.print("Nhập số tài khoản khách hàng cần nạp tiền: ");
                s =scanner.nextLong();
                for(int i=0; i<n; i++) {
                	d=a[i].getSoTaiKhoan();
                	if(s==d) {
                		System.out.println("Bạn chọn tài khoản: "+d);
                		a[i].napTienVaoTaiKhoan();
                	}else {
                		System.out.println("");
                	}
                }
                break;
	    	case 4:
	    		System.out.print("Nhập số tài khoản khách hàng cần rút tiền: ");
	    		s=scanner.nextLong();
	    		for(int i=0; i<n; i++) {
	    			d=a[i].getSoTaiKhoan();
	    			if(s==d) {
	    				System.out.println("Bạn chọn tài khoản: "+d);
	    				a[i].rutTien();
	    			}
	    		}
	    		break;
	    	case 5:
	    		System.out.print("Nhập số tài khoản ngân hàng của bạn: ");
	    		s=scanner.nextLong();
	    		for(int i=0; i<n; i++) {
	    			d=a[i].getSoTaiKhoan();
	    			if(s==d) {
	    				System.out.println("Bạn chọn tài khoản: "+d);
	    				a[i].daoHan();
	    			}else {
	    				System.out.println("");
	    			}
	    		}
	    		break;
	    	case 6:
	    		double chuyen,nhan,tienChuyen;
	    		System.out.print("Nhập số tài khoản khách hàng chuyển tiền: ");
	    		s=scanner.nextLong();
	    		System.out.print("Nhập số tài khoản khách hàng nhận tiền: ");
	    		c=scanner.nextLong();
	    		for(int i=0; i<n; i++) {
	    			d=a[i].getSoTaiKhoan();
	    			if(s==d) {
	    				chuyen=a[i].getSoTienTrongTaiKhoan();
	    				for(int j=0; j<n; j++) {
	    					f=a[j].getSoTaiKhoan();
	    					if(c==f) {
	    						nhan=a[j].getSoTienTrongTaiKhoan();
	    						System.out.print("Nhập số tiền cần chuyển: ");
	    						tienChuyen=scanner.nextDouble();
	    						if(tienChuyen<=chuyen) {
	    							chuyen=chuyen-tienChuyen;
	    							nhan=nhan+tienChuyen;
	    							a[i].setSoTienTrongTaiKhoan(chuyen);
	    							a[j].setSoTienTrongTaiKhoan(nhan);
	    							System.out.println("Tài khoản số "+d+" vừa chuyển:$"+tienChuyen);
	    							System.out.println("Tài khoản số "+f+" cừa nhận:$"+tienChuyen);
	    						}else {
	    							System.out.println("Số tiền chuyển không hợp lệ!");
	    						}
	    					}else {
	    						System.out.println("");
	    					}
	    				}
	    			}else {
	    				System.out.println("");
	    			}
	    		}
	    		break;
	    	default:
	    		System.out.println("EXIT");
	    		flag=false;
	    		break;
	    	}
	    	
	    }while(flag);
	    

	}

}
