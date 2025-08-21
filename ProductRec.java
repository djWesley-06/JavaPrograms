public class ProductRec {
    public int prod(int a, int b){
        if(a<b){
            return prod(b,a);
        }
        if(b==0)
            return 0;
        return a+prod(a,b-1);
    }
}
