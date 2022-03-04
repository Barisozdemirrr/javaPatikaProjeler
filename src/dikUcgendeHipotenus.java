import java.util.Scanner;

public class dikUcgendeHipotenus {
    public static void main(String[] args) {
        int a , b ;
        double c ;
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Kenar uzunlugunu giriniz : ");
        a = scan.nextInt();
        System.out.print("2.Kenar uzunlugunu giriniz : ");
        b = scan.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs Uzunlugu : "+ c);
    }
}
