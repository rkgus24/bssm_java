package javastudy;
public class Chapter01 {
    public static void main(String[] args) {
    int a = 10;
    int b = 9;
    int c = 8;
    int d = (a++) + (--b) + (c--);
    int e = (++a) + (b--) + (--c);
    System.out.println(d);
    System.out.println(e);
    }
} //26 26
