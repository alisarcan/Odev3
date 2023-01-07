import java.util.Scanner;
public class Main {
    public static void main(String[] args){
         // Degişkenleri oluşturalım

        int a,b,c;
        double alan,cevre,u;

        // Kullanıcıdan verileri alalım

        Scanner girdi = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz :");
        a = girdi.nextInt();

        System.out.print("2. Kenarı giriniz :");
        b = girdi.nextInt();

        System.out.print("3. Kenraı giriniz :");
        c = girdi.nextInt();

        u = (a+b+c)/2;

        cevre = 2*u;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin çevresi :" + cevre);
        System.out.println("Üçgenin alanı :" + alan);


    }
}
