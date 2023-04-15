package baitap;
public class Ham_SoPhuc{
    //cho phần thực và phần ảo của số phức
    double real, img;
 
    //constructor để khởi tạo số phức
     Ham_SoPhuc(double r, double i){
        this.real = r;
        this.img = i;
    }
 
    public static Ham_SoPhuc sum(Ham_SoPhuc c1, Ham_SoPhuc c2)
    {
        //tạo một số phức tạm thời để giữ tổng của hai số
    	Ham_SoPhuc temp = new Ham_SoPhuc(0, 0);
 
        temp.real = c1.real + c2.real;//cộng các phần thực
        temp.img = c1.img + c2.img;//cộng các phần ảo
 
        //trả về số phức đầu ra
        return temp;
    }
    public static void main(String args[]) {
    	Ham_SoPhuc c1 = new Ham_SoPhuc(5.2, 4.4);//nhập vào phần thực và phần ảo của số phức thứ nhất
    	Ham_SoPhuc c2 = new Ham_SoPhuc(2.0, 7.3);//nhập vào phần thực và phần ảo của số phức thứ hai
    	Ham_SoPhuc temp = sum(c1, c2);
        System.out.printf("Kết quả là: "+ temp.real+" + "+ temp.img +"i");//hiển thị kết qua ra màn hình
    }
}