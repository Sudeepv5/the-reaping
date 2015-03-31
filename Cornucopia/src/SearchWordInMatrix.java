import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class SearchWordInMatrix {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		in.nextLine();
		String s=in.nextLine();
		char[][] matrix=new char[r][c];
	    for(int i=0;i<r;i++)
	    {
	        matrix[i]=s.toCharArray();
	        if(in.hasNextLine())
	    		s=in.nextLine();
	    }
	    in.close();
	    System.out.println(searchWord(matrix, "spunkgagaaaagkid"));
	    /*4 5
		  spunk
		  kidag
		  gggga
		  aaaag*/
	}
	
	
	public static boolean searchWord(char[][] map, String word)
	{
		boolean[][] visited;
		for(int i=0;i<map.length;i++){
		for(int j=0;j<map[0].length;j++)
		{
			visited=new boolean[map.length][map[0].length];
			if(dfsWord(map,word,i,j,0,visited))
				return true;
		}
	}
	return false;
			
	}
	
	public static boolean dfsWord(char[][] map, String word,int i,int j,int count,boolean[][] visited)
	{
		
		if(i>=0&&i<map.length&&j>=0&&j<map[0].length&&!visited[i][j])
		{
			
			visited[i][j]=true;
			if(count==word.length())
				return true;
		if(map[i][j]==word.charAt(count))
		{
			return (dfsWord(map,word,i,j+1,count+1,visited)||dfsWord(map,word,i-1,j,count+1,visited)||dfsWord(map,word,i+1,j,count+1,visited)||dfsWord(map,word,i,j-1,count+1,visited));
					
		}
		
		}
		return false;
	}
	
	
}
