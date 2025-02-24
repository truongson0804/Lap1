import java.util.Scanner;

public class bai5 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       System.out.println("nhap a =");
       double a = kb.nextDouble();
       System.out.println("nhap b =");
       double b = kb.nextDouble();
       System.out.println("nhap c =");
       double c = kb.nextDouble();
       double min =a;
       if(b<min){
        min = b;
       }
       if(c<min){
        min=c;
       }
       System.out.println("so nho nhat la ="+min);
       
    } 
    }

