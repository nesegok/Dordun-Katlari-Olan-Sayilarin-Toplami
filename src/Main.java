import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.print("Sayı giriniz : ");
            int n = input.nextInt();

            if (n%2==1){
                break;
            }
            else if ((n%2==0) && (n%4==0)){

                total += n;
            }
        }
        System.out.print("Toplam : "+total);
    }
}
