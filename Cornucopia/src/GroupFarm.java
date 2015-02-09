import java.io.*;
import java.util.*;
import java.math.*;
public class GroupFarm{
    public static void main(String args[] ) throws Exception {
       Scanner in =new Scanner(System.in);
	String str;
	int r=in.nextInt();
	int c=in.nextInt();
	char[][] farm=new char[r][c];
	str=in.nextLine();
	for(int i=0;i<r;i++)
	{
		str=in.nextLine();
		for(int j=0;j<c;j++)
			farm[i][j]=(str.charAt(j));
	}
	
	boolean[][] visited=new boolean[r][c];
	int count=0;
    for(int i = 0; i < farm.length; i ++){
        for(int j = 0; j < farm[0].length; j ++){
            if(!visited[i][j] && farm[i][j]=='Y'){
                count++;
                bfs(farm, visited, i, j, farm[i][j]);
            }
        }
    }
    System.out.println(getComb(count));
	}
	
	 public static void bfs(char[][] matrix, boolean[][] visited, int i, int j, char label){
	        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length ||
	                visited[i][j] || matrix[i][j] != label)
	            return;
	        visited[i][j] = true;
	        bfs(matrix, visited, i-1,j,label);
	        bfs(matrix, visited, i+1,j,label);
	        bfs(matrix, visited, i,j-1,label);
	        bfs(matrix, visited, i,j+1,label);
	    }
	 
	 public static BigInteger getComb(int count)
	 {
		 BigInteger sum=new BigInteger("0");
         BigInteger one=new BigInteger("1");
         BigInteger two=new BigInteger("2");
		 if(count==0)
			 return one;
		 if(count==1)
			 return one;
		 if(count==2)
			 return two;
		 
		 if(count>2)
			 for(int i=0;i<count;i++)
			 {
                if(i%2==0)
			     {
                    BigInteger b1=fact(count,i);                
                    sum=sum.add(b1);
                    }
			 }
		 return sum;
	 }
	 
	 static BigInteger fact(int n,int i)
	 {
         BigInteger one=new BigInteger("1");
        if(i==0)
            return one;
        BigInteger prod=new BigInteger("1");
         for(int k=i+1;k<=n;k++)
             {
        	 
             prod=prod.multiply(new BigInteger(String.valueOf(k)));
         }
         return prod;
	 }
    }