package HomeWork1;

public class home_work_1_1_2 {
    public static void main(String[] args) {
        int a = -42;
        int b = -15;

        int c = a & b;
        //11111111111111111111111111010110 & 11111111111111111111111111110001 = 00001010
        System.out.println("При использовании оператора (AND) -42 & -15 = "+c+" (в двоичном исчислении = "+Integer.toBinaryString(c)+")");

        int g = a | b;
        System.out.println("при использовании оператора (OR)  -42 | -15 = "+g+" (в двоичном исчислении = "+Integer.toBinaryString(g)+")");

        int d = a ^ b;
        System.out.println("при использовании оператора (XOR) -42 ^ -15 = "+d+" (в двоичном исчислении = "+Integer.toBinaryString(d)+")");

        int e = ~a;
        int f = ~b;
        System.out.println("при использовании оператора (NOT) ~a = "+e+" (в двоичном исчислении = "+Integer.toBinaryString(e)+")");
        System.out.println("при использовании оператора (NOT) ~b = "+f+" (в двоичном исчислении = "+Integer.toBinaryString(f)+")");


        int h = a << 1;
        int j = b << 1;
        System.out.println("при использовании оператора (<<) <<a = " +h+ " (в двоичном исчислении = " +Integer.toBinaryString(h)+")");
        System.out.println("при использовании оператора (<<) <<b = " +j+ " (в двоичном исчислении = " +Integer.toBinaryString(j)+")");

        h = a >> 1;
        j = b >> 1;
        System.out.println("при использовании оператора (>>) >>a = " +h+ " (в двоичном исчислении = " +Integer.toBinaryString(a>>1)+")");
        System.out.println("при использовании оператора (>>) >>b = " +j+ " (в двоичном исчислении = " +Integer.toBinaryString(b>>1)+")");

        h = a >>> 1;
        j = b >>> 1;
        System.out.println("при использовании оператора (>>>) >>>a = " +h+ " (в двоичном исчислении = " +Integer.toBinaryString(a>>>1)+")");
        System.out.println("при использовании оператора (>>>) >>>b = " +j+ " (в двоичном исчислении = " +Integer.toBinaryString(b>>>1)+")");


    }
}
