public class reverseInteger {
    public int reverse(int x) {
        while(x == 0) return 0;
        long res = 0; // corner case
        while (x != 0){
            res = res * 10 + x % 10;
            x = x / 10;
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }
        return (int)res;
    }
}
