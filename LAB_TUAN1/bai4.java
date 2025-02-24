import java.util.Scanner;

public class bai4 {
   public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("nhap nam =");
    int nam = kb.nextInt();
    if((nam%4==0 && nam%100!=0)||(nam%400==0)) {
        System.out.println("la nam nhuan");
    }
        else{
            System.out.println("khong phai nam nhuan");
        }
    }
   } 
    

