

public class SubArrayXor {
    
    public static void printXor()
        {
    	String[] str=new String[3];
    	String s1=new String("sudeep");
    	String s2=new String("sudeep");
    	String s3="sudeep";
    	String s4="sudeep";
    	str[0]=s1;
    	str[1]=s2;
    	str[2]=s3;
    	
        System.out.println((s1==s2) + " "+ (s1.equals(s2))+" "+ (s2==s3) + " "+(s2.equals(s3))+" "+ (s4==s3) + " "+(s4.equals(s3)));
        
        
    	//System.out.println((str[0]==str[1]) + " "+ (str[0].equals(str[1]))+" "+ (str[1]==str[2]) + " "+(str[1].equals(str[2])));
       
    	
        System.out.println(str[0].hashCode());
        System.out.println(str[1].toString());
        System.out.println(str[2].toString());
        
        SubArrayXor sa=new SubArrayXor();
        System.out.println(sa.hashCode());
    }

    public static void main(String[] args) {
    	
    	
        /*
        Scanner in=new Scanner(System.in);
        int f=Integer.parseInt(in.nextLine());
        for(int i=0;i<f;i++)
            {
            
        int arr[]=new int[Integer.parseInt(in.nextLine())];
        for(int j=0;j<arr.length;j++)
            arr[j]=in.nextInt();
            */
        printXor();
        
        //if(in.hasNextLine());
          //  in.nextLine();
        }
    }
