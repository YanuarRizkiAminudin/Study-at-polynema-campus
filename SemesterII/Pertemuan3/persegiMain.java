public class persegiMain {
  
    public static void main(String[] args) {
      persegi[][] ppArray = new persegi[2][3];
 
      ppArray[0][0] = new persegi(5);
      ppArray[0][1] = new persegi(10);
      ppArray[0][2] = new persegi(15);
      ppArray[1][0] = new persegi(20);
      ppArray[1][1] = new persegi(25);
      ppArray[1][2] = new persegi(30);
  
      for (int i = 0; i < ppArray.length; i++) {
        for (int j = 0; j < ppArray[i].length; j++) {
          System.out.println("Sisi Persegi[" + i + "][" + j + "]: " + ppArray[i][j].getSisi());
        }
      }
    }
  }
  