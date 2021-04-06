import java.util.Scanner;

public class forLoop3 {
    public static void main(String[] args) {
        // 50'den buyuk 150'den kucuk olan tamsayilardan
        // 7 ile tam bolunebilenleri toplayip
        // sonucu yazdiran bir kod yaziniz.
       int sayi = 0;
      int  toplam=0;

       for(int i=50; i<=150; i++){
           if(i%7==0){
               toplam+=i;
           }
       }
       System.out.println("toplam:"+toplam);



    }
}
