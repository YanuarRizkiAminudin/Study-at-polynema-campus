package Percobaan1;
import java.util.Scanner;

public class GraphMain28 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Graph28 gedung = new Graph28(6);
        gedung.addEdge(0, 1, 50);  // A ke B
        gedung.addEdge(0, 2, 100); // A ke C
        gedung.addEdge(1, 3, 70);  // B ke D
        gedung.addEdge(2, 3, 40);  // C ke D
        gedung.addEdge(3, 4, 60);  // D ke E
        gedung.addEdge(4, 5, 80);  // E ke F

        gedung.degree(0);
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.print("Masukkan Gedung asal : ");
        int asal = scanner.nextInt();
        System.out.print("Masukkan Gedung tujuan : ");
        int tujuan = scanner.nextInt();

        gedung.checkTetangga(asal, tujuan);
        
        scanner.close();
    }
}

