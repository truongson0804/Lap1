import java.util.Scanner;

public class bai9 {
public static int tinhtong(int n){
    int tong = 0;
    while (n!=0){
        tong += n %10;
        n /=10;
    }
    return tong;     
    }
    public static int tinhtich(int n){
        int tich = 1;
        while (n!=0){
            tich*= n%10;
            n /=10;
        }
        return tich;
    }
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("nhap so nguyen");
        int n= kb.nextInt();
        int tong =tinhtong(n);
        int tich = tinhtich(n);
        System.out.println("tong cac chu so la :"+tong);
        System.out.println("tich cac chu so la :"+tich);
    }
}
    
