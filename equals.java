import java.util.Scanner;

public class Equalsdeneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ogrenciler = true;
        string matematik, fizik, kimya;// AA,AB,BB gibi girildiğinde
        String ad, soyad;
        while (ogrenciler) {
            System.out.print("adinizi giriniz:");
            ad = input.next();
            System.out.print("soyadiniz:");
            soyad = input.next();
            System.out.print(" matematik notunu giriniz: ");
            matematik = input.next();
            System.out.print("fizik notunuzu giriniz: ");
            fizik = input.next();
            System.out.print("kimya notunuzu giriniz: ");
            kimya = input.next();
            System.out.printLn("matematik ve fizik notlariniz esit" + (matematik.equals(fizik)));
        }
    }
}