
package tugas.nomer1;

import java.util.Scanner;

public class NomerSatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka : ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Ketikkan list angka : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Masukkan target : ");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Penjumlahan antara Angka " + numbers[i] + " dan " + numbers[j] + " menghasilkan " + target);
                }
            }
        }
    }
}
