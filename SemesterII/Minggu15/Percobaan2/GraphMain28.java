package Percobaan2;

import java.util.Scanner;

public class GraphMain28 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        GraphMatriks28 gdg = new GraphMatriks28(4); 
        gdg.makeEdge(0, 1, 50);  // A ke B
        gdg.makeEdge(1, 0, 60);  // B ke A
        gdg.makeEdge(1, 2, 70);  // B ke C
        gdg.makeEdge(2, 1, 80);  // C ke B
        gdg.makeEdge(2, 3, 40);  // C ke D
        gdg.makeEdge(3, 0, 90);  // D ke A

        System.out.println("Graf awal:");
        gdg.printGraph();

        gdg.removeEdge(2, 1);

        System.out.println("Hasil setelah penghapusan edge:");
        gdg.printGraph();
        gdg.inDegree();
        gdg.outDegree();

    }
}