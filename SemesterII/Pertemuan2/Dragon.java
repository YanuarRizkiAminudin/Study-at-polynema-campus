import java.util.Scanner;
public class Dragon {

    static int
    x = 5,
    y = 5,
    width = 10,
    height = 10 ;

    static Scanner scan = new Scanner(System.in);
    public static  void main(String[] args){
        System.out.println("");
        System.out.println("=========Game Dimulai=======");

        while(true){
            System.out.println("where are you go");
            System.out.println("1. Move up");
            System.out.println("2. Move down");
            System.out.println("3. Move down");
            System.out.println("4. Move right");
            int n = scan.nextInt();
        
        switch(n){
            case 1:
            moveUp();
            break;
            case 2:
            moveDown();
            break;
            case 3:
            moveLeft();
            break;
            case 4:
            moveRight();
            break;
            default:
            System.out.println("Please select aviable number: ");
            break;
        }
    }
}         
    static void moveLeft() {
        x--;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    static void moveRight() {
        x++;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }
    static void moveUp() {
        y--;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    static void moveDown() {
        y++;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
    }
    
    static void detectCollision() {
        System.out.println("Game Over");
    }
}
