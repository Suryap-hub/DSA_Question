public class count_number {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(count(n));
    }

    public static int count(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + count(n / 10);
    }
}
