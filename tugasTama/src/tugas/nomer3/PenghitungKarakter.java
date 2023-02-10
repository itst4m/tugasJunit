
package tugas.nomer3;

import java.util.Scanner;

public class PenghitungKarakter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        String input = sc.nextLine();

        int upperCase = 0, lowerCase = 0, digits = 0, others = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                others++;
            }
        }
        System.out.println("=====================================");
        System.out.println("Jumlah uppercase      : " + upperCase);
        System.out.println("Jumlah lowercase      : " + lowerCase);
        System.out.println("Jumlah angka          : " + digits);
        System.out.println("Jumlah simbol lainnya : " + others);
    }
    public static int countUppercase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countLowercase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countSpecial(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
