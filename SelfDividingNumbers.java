import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list = new ArrayList<>();


        for(int i = left; i<=right;i++) {
            int num = i;
            boolean flag = true;
            while (num > 0) {
                int last = num % 10;
                if (last == 0 || i % last != 0) {
                    flag = false;
                    break;
                }
                num /= 10;
            }
            if (flag)
                list.add(i);


        }
        return list;

    }
}
