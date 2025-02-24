import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
    Scanner kb =  new Scanner(System.in);
    System.out.println("nhap dien mon Ly =");
    double  ly= kb.nextDouble();
    System.out.println(" nhap diem mon Hoa =");
    double  hoa=kb.nextDouble();
    System.out.println("nhap diem mon Sinh =");
    double  sinh=kb.nextDouble();
    System.out.println("nhap diem mon Toan =");
    double  toan=kb.nextDouble();
    System.out.println("nhao diem mon maytinh =");
    double  maytinh=kb.nextDouble();
    double tinhtong = hoa+ly+sinh+toan+maytinh;
    if (tinhtong*2>=90){
        System.out.print("hang A");
    }
    else if (tinhtong*2>=80){
        System.out.print("hang B");
    }
    else if (tinhtong*2>=70){
        System.out.print("hang C");
    }
    else if (tinhtong*2>=60){
        System.out.print("hang D");
    }
    else if (tinhtong*2>=40){
        System.out.print("hang E");
    }
    else{
        System.out.print("hang F");
    }
    
    
}
}