package Percobaan2;

public class GraphMatriks28 {
    int vertex;
    int[][] matriks;

    public GraphMatriks28(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + "(" + matriks[i][j] + "m), ");
                }
            }
            System.out.println();
        }
    }
    
    public void inDegree() {
        for (int i = 0; i < vertex; i++) {
            int inDegree = 0;
            for (int j = 0; j < vertex; j++) {
                if (matriks[j][i] != 0) {
                    inDegree++;
                }
            }
            System.out.println("Indegree Gedung " + (char) ('A' + i) + "  : " + inDegree);
        }
    }
    
    public void outDegree() {
        for (int i = 0; i < vertex; i++) {
            int outDegree = 0;
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != 0) {
                    outDegree++;
                }
            }
            System.out.println("Outdegree Gedung " + (char) ('A' + i) + " : " + outDegree);
        }
    }
}    