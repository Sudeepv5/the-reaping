

import java.util.*;


public class BiggestRegionMatrix {
	public static int maxC=0;
	public static void main(String[] args) {
	    Scanner in =new Scanner(System.in);
		int c=in.nextInt();
		int r=in.nextInt();
	    int[][] matrix=new int[c][r];
	    for(int i=0;i<c;i++)
	        for(int j=0;j<r;j++)
	        {
	        matrix[i][j]=in.nextInt();
	    }
	    in.close();
	    int count=0;
	        boolean[][] visited=new boolean[c][r];
	        for(int i=0;i<c;i++)
	            for(int j=0;j<r;j++)
	            {
	            if(!visited[i][j]&&matrix[i][j]==1){
	            count=Math.max(count,dfs(matrix,i,j,visited,0));   
	            maxC=0;
	            }
	        }

		    
	        System.out.println(count);
	        
	    }
	    
	    public static int dfs(int[][] matrix, int i,int j,boolean[][] visited,int count)
	        {
	        if(i>=0 && i<matrix.length && j>=0 && j<matrix[0].length && !visited[i][j] && matrix[i][j]>0)
	            {
	            visited[i][j]=true; 
	            maxC++;
	            count=maxC;
	            dfs(matrix,i,j+1,visited,count);
	            dfs(matrix,i+1,j,visited,count);
	            dfs(matrix,i-1,j,visited,count);
	            dfs(matrix,i,j-1,visited,count);
	            
	            dfs(matrix,i-1,j-1,visited,count);
	            dfs(matrix,i+1,j+1,visited,count);
	            dfs(matrix,i+1,j-1,visited,count);
	            dfs(matrix,i-1,j+1,visited,count); 
	        }
	        return maxC;
	       
	    }
	}
