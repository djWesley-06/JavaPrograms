public class BitCount implements Comparable<BitCount>{

    int value;
    int count;

    public BitCount(int value, int count){
        this.value = value;
        this.count = count;
    }


    @Override
    public int compareTo(BitCount other) {

        if (this.count != other.count) {
            return Integer.compare(this.count, other.count);
        } else {
            return Integer.compare(this.value, other.value);
        }
    }
}
