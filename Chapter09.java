public class Test {
    public static void main(String[] args)
    {
    	int count;
    	count=0;
		for(int i=1; i<=10; i++) 
		{	
			if(i==5) 
			{
				continue;
			}
			count++;			
		}
		System.out.println(count);	
		
    	count=0;
    	for(int i=1; i<=10; i++) 
    	{
    		if(i%2==1)
    		{
    			continue;
    		}
			count++;
	}
    	System.out.println(count);
				
		count=0;
		for(int i=0; i<5; i++) 
		{
			for(int j=0; j<5; j++) 
			{
				if(j==3) 
				{
					continue;
				}
				count++;
			}
		} 
		System.out.println(count);
    }
} //9 5 20
