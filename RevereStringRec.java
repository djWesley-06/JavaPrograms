import java.util.Arrays;

public class RevereStringRec {

    public void reverseStringRec(char[] s) {

        if(s.length==1)
            System.out.println(Arrays.toString(s));

        s=helper(s,0,s.length-1);
        System.out.println(Arrays.toString(s));
    }

    private char[] helper(char[] arr, int s, int e) {

        if(arr.length==0)
            return new char[]{};
        if(arr.length==1){
           return arr;
        }
        while(s<e) {
            arr=swap2(arr,s,e);
            s++;
            e--;
        }

        return arr;

    }

    public void reverseStringItr(char[] s) {
        int st = 0;
        int e = s.length-1;
        while(st<=e){
            if(st==e){
                continue;
            }
            swap(s,st,e);
            st++;
            e--;
        }
        System.out.println(Arrays.toString(s));
    }
    public void swap(char[] arr, int s,int e){
        char temp = arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    public char[] swap2(char[] arr, int s,int e){
        char temp = arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        return arr;
    }
}
