import java.util.Scanner;
public class Calculator {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1,n2,secim;

        System.out.print("ilk sayiyi giriniz :");
        n1=scan.nextInt();
        System.out.print("ikinci sayiyi giriniz :");
        n2=scan.nextInt();

        System.out.print("toplam icin 1\ncikarma icin 2\ncarpma icin 3\nbolme islemi icin 4 e basiniz!");
        secim= scan.nextInt();

        switch (secim){
            case 1:
                System.out.println("islemin sonucu :"+ (n1+n2));
                break;
            case 2:
                System.out.println("islemin sonucu :"+ (n1-n2));
                break;
            case 3:
                System.out.println("islemin sonucu :"+ (n1*n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.println("islemin sonucu :"+ (n1/n2));
                }
                else{
                    System.out.println("Bir sayi 0 a bolunemez!");
                }

                break;
        }
    }
}
