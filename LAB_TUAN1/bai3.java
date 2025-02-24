import java.util.Scanner;

public class bai3{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap nhiet do F =");
        double doF = kb.nextDouble();
        double doC = (doF - 32) / 1.8;
        System.out.println("Nhiet do C = " + doC); 
    }
}
