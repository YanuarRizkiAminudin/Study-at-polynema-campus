package Percobaan1;

public class Graph28 {
    int vertex;
    DoubleLinkedList28 list[];

    public Graph28(int v) {
        vertex = v;
        list = new DoubleLinkedList28[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList28();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        //list[tujuan].addFirst(asal, jarak);
         list[asal].addFirst(tujuan, jarak);
    
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // indegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
        // outdegree
        for (k = 0; k < list[asal].size(); k++){
            list[asal].get(k);
        /*totalOut = list[asal].size();
        */
        }
        totalOut = k;
    }
        System.out.println("Indegree dari Gedung " 
        + (char) (asal + 'A') + " : " + totalIn);
        System.out.println("Outdegree dari Gedung " 
        + (char) (asal + 'A') + " : " + totalOut);
        System.out.println("Degree dari Gedung " 
        + (char) (asal + 'A') + " : " + (totalIn + totalOut));
          /*undirected graph
           * System.out.println("Degree dari Gedung " 
           * +(char)('A' +asal) + ": " + list[asal].size());
           */
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++){
            if (i == tujuan){ 
                list[asal].remove(tujuan);
                //list[tujuan].remove(asal);
        }
    }
}

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Semua Graf Telah dihapus");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " 
                + (char) (i + 'A') + " Terhubung dengan  ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' 
                    + list[i].get(j)) + "(" + list[i].getJarak(j) + "m),");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    public void checkTetangga(int asal, int tujuan) throws Exception {
        boolean bertetangga = false;
        for (int i = 0; i < list[asal].size(); i++) {
            if (tujuan == list[asal].get(i)) {
                bertetangga = true;
                break;
            }
        }
        if (bertetangga) {
            System.out.println("Gedung " + (char) ('A' + asal) 
            + " dan Gedung " + (char) ('A' + tujuan) + " bertetangga.");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) 
            + " dan Gedung " + (char) ('A' + tujuan) + " tidak bertetangga.");
        }
    }
}