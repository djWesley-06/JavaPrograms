public class SpecialFib {

    public int sF(int n, int a , int b){
        if(n==0){
            return a;
        }
        else if(n==1){
            return b;
        }
        else return sF(n-1,a,b) ^ sF(n-2,a,b);
    }

    public int sF(int n, int a , int b, int c){
        if(n==1){
            return a;
        }
        else if(n==2){
            return b;
        }
        else if(n==3){
            return c;
        }
        else return sF(n-1,a,b,c) + sF(n-2,a,b,c) + sF(n-3,a,b,c);
    }
}
