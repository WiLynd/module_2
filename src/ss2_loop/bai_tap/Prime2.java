package ss2_loop.bai_tap;

public class Prime2 {
    public static void main(String[] args) {
        System.out.println("Prime number <100:");
        System.out.print(2);
        for (int i = 3; i <= 100; i+=2) {
            byte count = 0;
            for (int j = 1; j <= i; j++)
                if (i % j == 0)
                    count++;
            if (count == 2)
                System.out.print(" " + i);
        }
    }
}
