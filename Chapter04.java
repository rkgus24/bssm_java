public class Test {
    public static void main(String[] args)
    { 
    	for(int i=0; i<10; i+=2) 
    	{
    		System.out.print(i + " ");
    	}
	    for(int i=0, j=0; i<10; i++, j++) 
	    {
	        System.out.print(i + j + " ");
	    }
    }
} //0 2 4 6 8 0 2 4 6 8 10 12 14 16 18
