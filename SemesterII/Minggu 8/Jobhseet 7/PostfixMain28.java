import java.util.Scanner;

public class PostfixMain28 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String P, Q;
    System.out.println("Masukan ekspresi matematika (infix): ");
    Q = sc.nextLine();
    Q = Q.trim();
    Q = Q + ")";

    int total = Q.length();

    Postfix28 post = new Postfix28(total);
    P = post.konversi(Q);
    System.out.println("Posftix: " + P);
    }
}
