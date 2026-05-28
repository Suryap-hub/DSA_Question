import java.util.Scanner;
public class print_armstrong_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        armstrong_number(N1, N2);
    }

    public static void armstrong_number(int N1, int N2) {

        for (int n = N1; n <= N2; n++) {

            int temp = n;

            int cod = countofdigit(n);

            int sum = 0;

            int num = n;

            while (num > 0) {

                int rem = num % 10;

                sum = (int)(sum + Math.pow(rem, cod));

                num = num / 10;
            }

            if (sum == temp) {

                System.out.println(temp);
            }
        }
    }

    public static int countofdigit(int n) {

        int c = 0;

        while (n > 0) {

            c++;

            n = n / 10;
        }

        return c;
    }
}

