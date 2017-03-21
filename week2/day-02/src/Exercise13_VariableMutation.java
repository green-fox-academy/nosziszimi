/**
 * Created by Nóra on 2017. 03. 21..
 */
public class Exercise13_VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        System.out.println("a(3) + 10 = " + a);

        int b = 100;
        b -= 7;
        System.out.println("b(100) - 7 = " + b);

        int c = 44;
        c *= 2;
        System.out.println("c(44) * 2 = " + c);

        int d = 125;
        d /= 5;
        System.out.println("d(125) / 5 = " + d);

        int e = 8;
        e = e * e;
        System.out.println("e(8) ^ 2 = " + e);

        int f1 = 123;
        int f2 = 345;
        System.out.println("f1(123) > f2(345) is: " + (f1 > f2));

        int g1 = 350;
        int g2 = 200;
        System.out.println("2*g2(200) > g1(350) is: " + ((g2 * 2) > g1));

        long h = 1357988018575474L;
        System.out.println("11 is a divisor of h(1357988018575474): " + ((h % 11) == 0));

        int i1 = 10;
        int i2 = 3;
        System.out.println("i2(3)^3 > i1(10) > i2(3)^2 : " + ((i1 > (i2*i2)) && (i1 < (i2*i2*i2))));

        int j = 1521;
        System.out.println("j(1521) is devidable by 3 or 5 : " + ((j%3 == 0) || (j%5 == 0)) );

        String k = "Apple";
        k = k+k+k+k;
        System.out.println(k);






    }
}
