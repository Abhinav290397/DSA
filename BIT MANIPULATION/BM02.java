//Convert a decimal no. to binary no.
public class BM02 {
    public static void main(String[] args) {
        int n = 19;
        String s = "";
        while(n > 0){
            s = (n&1) + s;
            n >>= 1;
        }
        System.out.println(s);
    }
}
