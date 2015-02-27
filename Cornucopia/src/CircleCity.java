	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class CircleCity {

	    public static void checkandPrintPossible(int rad,int pol)
	    {
	        int count=0;
	        for(int i=0;i<=Math.sqrt(rad);i++)
	            {

	            if(Math.sqrt(rad-i*i)==(int)Math.sqrt(rad-i*i))
	            count++;
	            }
	          
	  
	        if((4*count)>pol)
	            System.out.println("impossible");
	        else
	            System.out.println("possible");
	    }

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in=new Scanner(System.in);
	        int c=Integer.parseInt(in.nextLine());
	        for(int i=0;i<c;i++)
	            {
	            checkandPrintPossible(in.nextInt(),in.nextInt());
	        }
	    }
	}


