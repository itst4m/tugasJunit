
package tugas.nomer4;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan string: ");
        String str = sc.nextLine();
        
        // Memisahkan string menjadi array kata
        String[] words = str.split("\\s+");
        
        // Menghitung berapa kali setiap kata muncul
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        String mostFrequentWord = "";
        int maxCount = 0;
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > maxCount) {
                mostFrequentWord = word;
                maxCount = wordCount.get(word);
            }
        }
        
        // Menampilkan jumlah setiap kata
        System.out.println("\n\nKata yang Muncul");
        System.out.println("=============================\n");
        wordCount.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
        System.out.println("=============================\n");
        System.out.println("Kata paling sering: " + mostFrequentWord + " (" + maxCount + " kali)");
    }
    
    public static int countWords (String str){
        String[] words = str.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        String mostFrequentWord = "";
        int maxCount = 0;
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > maxCount) {
                mostFrequentWord = word;
                maxCount = wordCount.get(word);
            }
        }
        return 0;
    }
}
