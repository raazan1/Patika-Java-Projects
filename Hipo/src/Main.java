import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Dik Kenar 1'i giriniz: ");
        int Side = input.nextInt();
        System.out.printf("Dik Kenar 2'yi giriniz: ");
        int Side1 = input.nextInt();
//        System.out.printf("Karşı kenarı giriniz:  ");
//        int hipoKenar = input.nextInt();

        Hipotenus(Side, Side1);

    }
    public static void Hipotenus(int Side,int Side1){
        double calc = Math.sqrt((Side*Side)+(Side1*Side1));
        System.out.println("Hipotenüs: " + calc);

        double cevre = ((Side+Side1+calc)/2);
        double alan = Math.sqrt(cevre*(cevre-Side)*(cevre-Side1)*(cevre-calc));
        System.out.printf("Çevre: " + cevre*2 + "\nAlan: " + alan);

    }

}