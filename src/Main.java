import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int hak = 5 , tahmin ;

        Scanner input = new Scanner(System.in);

        System.out.println("Aranan Sayiyi Bulmak Icin 5 Hakkin Var");
        Random rand = new Random();
        int aranan = rand.nextInt(100);
        int tahminArr[] = new int[5];

        while (hak > 0){
            System.out.println(hak+" Hakkin Var Tahminini Yap ! ");
            tahmin = input.nextInt();

            if(tahmin == aranan){
                System.out.println("Tebrikler !!!");
                break;

            }
            else{
                if (tahmin>aranan){
                    System.out.println("Tahminin Buyuk");
                }
                else {
                    System.out.println("Tahminin Kucuk");
                }
            }


            hak--;



            if (hak == 0){
                System.out.println("Hakkiniz Bitti Sayiyi Bulamadiniz Aranan Sayi : "+ aranan);
            }
        }

    }
}