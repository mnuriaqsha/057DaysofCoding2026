import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = hi.nextInt();

        int i = 1;

        System.out.println("Angka ganjil sampai :" + n);
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        i = 1;
        System.out.println("\nAngka genap sampai :" + n);
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
