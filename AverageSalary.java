import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class AverageSalary {
    public double average(int[] salary) {
        HashSet<Double>set = new HashSet<>();
        for(int i : salary)
            set.add((double)(i));
       Object[] res = set.toArray();
       Arrays.sort(res);
       int count =0;
       double sum = 0;
       for(int i = 1;i<res.length-1;i++){
           count++;
           sum+=(double)res[i];
       }
       return sum/count;
    }
    public double average2(int[] salary){
        Arrays.sort(salary);
        double sum = 0;
        for(int i : salary){
            sum+=i;
        }
        return (sum - salary[0]-salary[salary.length-1])/(salary.length-2);
    }

}
