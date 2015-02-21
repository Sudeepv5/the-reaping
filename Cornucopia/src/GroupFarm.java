
import java.util.*;



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
	in.close();
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
	 
	 public static int getComb(int count)
	 {
		return (int)Math.pow(2, count-1);
	 }
	 
	 
    }