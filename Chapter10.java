public class Test {
    public static void main(String[] args)
    {
      int count=0;
      for(int i=1; i<=10; i++)
      {
         for(int j=1; j<=10; j++)
         {
            if(j==5) break;
            else count++;
         }
      }
      System.out.println(count);
    }
}//40
