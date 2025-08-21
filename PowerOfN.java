public class PowerOfN {
    public boolean isPowerOfN(int v, int n) {

        if (v == 1) {
            return true;
        } else if (v % n != 0 || v == 0) {
            return false;
        } else {
            return isPowerOfN(v / 2,n);
        }
    }

}
