import java.util.Scanner;

public class dataMahasiswa_29 {
        public static void main(String[] args) {
        
        //inisialisasi
        Scanner input = new Scanner(System.in);
        System.out.print("input NIM: ");
        //deklarasi dan inisialisasi
        String nim = input.next();
        //konversi String ke Integer
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        System.out.print("maka n = " + n + "\n");
        //deklarasi dan inisialisasi variabel
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print("* ");
            } else if (i != 6 && i != 10) {
                System.out.print(i + " ");
            }
        }
    }
}
