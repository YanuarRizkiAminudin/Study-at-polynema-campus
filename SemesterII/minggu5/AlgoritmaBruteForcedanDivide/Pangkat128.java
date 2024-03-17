package AlgoritmaBruteForcedanDivide;
public class Pangkat128{
    public int nilai;
    public int pangkat;

    public Pangkat128(int a, int n) {
        this.nilai =  a;
        this.pangkat = n;
    }

    public int pangkatBF(){
        int hasil = 1;
        for(int i=0; i<pangkat; i++){
            hasil *=  nilai ;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n){
        if(n==0){
            return 1;
        }else{
            if(n%2==1){
                return(pangkatDC(a,n/2)*pangkatDC(a, n/2)*a);
            }else{
                return(pangkatDC(a,n/2)*pangkatDC(a, n/2));
            }
        }
    }    
}