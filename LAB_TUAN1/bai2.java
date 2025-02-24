import java.util.Scanner;
public class bai2 {
public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("nhap chieu dai hcn =");
    double chieudai = kb.nextDouble();
    System.out.println("nhap chieu rong hcn =");
    double chieurong = kb.nextDouble();
    double Dientich = chieudai*chieurong;
    System.out.println("Dien tich hcn ="+Dientich);
}
    
}
