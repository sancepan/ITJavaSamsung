import java.util.Scanner;

import static java.lang.System.out;

public class ZeroBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.print("Input: ");
        //int chislo = in.nextInt(), bit = in.nextInt(), dvoich;
        //dvoich = chislo >> bit << bit;
        //out.print(dvoich);

        //int a = in.nextInt();
        //out.print((a & (a - 1)) == 0 ? "YES" : "NO");

        //int a = in.nextInt(), n = in.nextInt();
        //out.print(a&((1<<n)-1));

        double x = in.nextDouble(), y = in.nextDouble();
        if (y>=x*x-2 &&(y<=x || y<=-x)){
            System.out.print("YES");
        } else{
            System.out.print("NO");
        }
    }
}
