import java.util.Scanner;

public class forLoop2 {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi alin
        // 1'den kullanicinin girdigi sayiya kadar olan tum tamsayilarin
        // toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayı giriniz:");
        int sayi=scan.nextInt();

        if(sayi<=0){
            System.out.println("Lutfen pozitif bir sayı giriniz:");
        }

        int toplam=0;

        for(int i=1; i<sayi; i++){
            toplam +=i;
        }
        System.out.println("toplam:"+toplam);

    }
}
