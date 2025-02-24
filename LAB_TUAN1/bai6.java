import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
       Scanner kb= new Scanner(System.in);
      System.out.println("nhap canh a =");
      double a= kb.nextDouble();
      System.out.println("nhap canh b =");
      double b= kb.nextDouble();
      System.out.println("nhap canh c =");
      double c= kb.nextDouble();
      if(a + b > c && a + c > b && b + c > a){
        System.out.println("la mot hinh tam giac");
      } else{
        System.out.println("day ko phai la mot tam giac");
      }
    }
}
