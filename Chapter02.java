package javastudy;
public class Chapter01 {
    public static void main(String[] args) {
    System.out.println((5 v<= 5) && (7 > 2));
    System.out.println((5 <= 5) || (7 > 2));
    System.out.println((5 <= 5) ^ (7 > 2));
    System.out.println((5 <= 5) && !(7 > 2));

    inr value1 = 3;
    int value2 = 5;
    System.out.println(value1 & value2);
     System.out.println(value1 | value2);
      System.out.println(value1 ^ value2);
    }
} //true true false false 1 7 6
