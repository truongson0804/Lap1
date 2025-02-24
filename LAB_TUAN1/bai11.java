import java.util.Scanner;
public class bai11 {
    public static int dao_so(int n) {
        int bien_luu = 0;
        while (n != 0) {
            int so_nghich_dao = n % 10;
            bien_luu = bien_luu * 10 + so_nghich_dao;
            n /= 10;
        }
        return bien_luu;
    }
    public static void main(String[] args) {
        int n;
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = kb.nextInt();
        System.out.println("So nghich dao cua " + n + " la: " + dao_so(n));
    }
}