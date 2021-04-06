import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        // kullanicidan pozitif 2 tamsayi alin
        // aldigimiz degerlerden kucuk olandan baslayip, buyuk olana kadar
        // tum sayilari yanyana (virgulle ayrilarak) yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir sayı giriniz:");
        int sayi1 = scan.nextInt();
        System.out.print("Lütfen pozitif bir sayı giriniz:");
        int sayi2 = scan.nextInt();

        int kucukSayi = 0;
        int buyukSayi = 0;

        if (sayi1 < 0 || sayi2 < 0) {
            System.out.println("Lutfen pozitif bir sayi giriniz:");

        } else if (sayi1 < sayi2) {
            kucukSayi = sayi1;
            buyukSayi = sayi2;
        } else {
            kucukSayi = sayi2;
            buyukSayi = sayi1;
        }

        for (int i = kucukSayi; i < buyukSayi; i++) {
            System.out.print(i + ",");
        }

    }
}
