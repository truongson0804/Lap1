import java.util.Scanner;

public class bai8{
    
    
    public static int SoDauTien(int n) {
        while (n >= 10) {
            n /= 10;  
        }
        return n;  
    }

    public static int SoTanCung(int n) {
        return n % 10;  
    }
    
    public static void main(String[] args) {
        Scanner kb =  new Scanner(System.in);
        
        System.out.print("nhap so nguyen =");
        int n = kb.nextInt();
        
        int chuSoDauTien = SoDauTien(n);
        int chuSoTanCung = SoTanCung(n);

        System.out.println("chu so dau tien =" +chuSoDauTien);
        System.out.println("Chu so cuoi cunng ="+chuSoTanCung);
        
    }
}
