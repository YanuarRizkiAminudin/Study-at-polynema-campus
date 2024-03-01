public class ArrayBalok {

    public static void main(String[] args) {
        Balok[] sgArray =new Balok[4];

        
        sgArray[0] = new Balok(10, 4);
        sgArray[1] = new Balok(20, 10);
        sgArray[2] = new Balok(15, 6);
        sgArray[3] = new Balok(25, 10);
    
        System.out.println("alas :" + sgArray[0].alas + " tinggi " + sgArray[0].tinggi);
        System.out.println("alas :" + sgArray[1].alas + " tinggi " + sgArray[1].tinggi);
        System.out.println("alas :" + sgArray[2].alas + " tinggi " + sgArray[2].tinggi);
        System.out.println("alas :" + sgArray[3].alas + " tinggi " + sgArray[3].tinggi);
        }
    }
