package ss2_loop.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args)
    {
        int n;
        int status = 1;
        int num = 3;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input number (<=20): ");
            n = scanner.nextInt();
        } while ((n <= 20) && (n>=1));
        if (n >= 1)
        {
            System.out.println(n+" prime number is: ");
            System.out.print("2 ");
        }
        for ( int i = 2 ; i <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.print(num + " ");
                i++;
            }
            status = 1;
            num++;
        }
    }
}
