public class PowerSet {
    public void powerSets(String s){
        print("",s);
    }
    public void print(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        print(p+ch, up.substring(1));
        print(p,up.substring(1));

    }
}
