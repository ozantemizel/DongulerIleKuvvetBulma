import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Sınır sayıyı giriniz.");
        n=input.nextInt();

        if(n>0) {
            System.out.print("Dördün kuvvetleri: ");

            for (int i = 1; i <= n; i *= 4) {
                System.out.print(i + ",");
            }
            System.out.println("");
            System.out.print("Beşin Kuvvetleri:");

            for (int j = 1; j <= n; j *= 5)
                System.out.print(j + ",");
        } else {
            System.out.println("Sıfırdan büyük sayı giriniz");
        }
    }
}
