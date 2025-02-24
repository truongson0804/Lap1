import java.util.Scanner;
public class bai10 {
    public static int dem_so_chu_so(int n) {
        int dem = 0;
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            n /= 10;
            dem++;
        }
        return dem;
    }
    public static void main(String[] args) {
        int n;
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap so n= ");
        n = kb.nextInt();
        System.out.println("co tat ca  " + dem_so_chu_so(n)+ " so trong cac so nguyen  " +n);
        
        
    }
}
