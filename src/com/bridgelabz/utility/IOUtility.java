package com.bridgelabz.utility;

public class IOUtility 
{
	int i,j,k;

 public void printKPattern()
 {
	 for(i=0;i<=9;i++)
	   {
	    for(j=0;j<1;j++)
	    {
	    	System.out.print("*");
	       
	    }
	    for(k = 5;k<=9;k++)
	    {
	    	if(k==i||k==9-i)
	    	{
	    			System.out.print("*");
	    	}
	    	else
	    	{
	    			System.out.print(" ");
	    	}
	    }
	    System.out.println("");
	   }
 }
	 public void printDPattern()
	 {
		 for( i= 0;i<=4;i++)
			{
				for( j=0;j<1;j++)
				{
					System.out.print("*");
				}
				for( k=0;k<=4;k++)
				{
					if(k==4||i==0||i==4)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
	 }
	
	public void printWPattern()
	{
		for(i=0;i<=4;i++)
		{
			for(j=0;j<1;j++)
			{
				System.out.print("*");
			}
			for(k=0;k<=5;k++)
			{
				if(k==i&&k>=2)
				{
					System.out.print("*");
				}
				else if(k==5)
				{
					System.out.print("*");
				}
				else if(k==4-i&&k<3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		}
		System.out.println("");
	}
	}	
}
