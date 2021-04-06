import java.util.Scanner;

public class forLoop5 {
    public static void main(String[] args) {
        // Soru 8 ) Interview Question Kullanicidan bir String isteyin ve
        // Stringi tersine ceviren bir program yazin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz:" );
        String name=scan.nextLine();
          String tersyazi="";
        for(int i=name.length()-1; i>=0; i--){
            tersyazi+=name.charAt(i);

        }
        System.out.print(tersyazi);
    }
}
