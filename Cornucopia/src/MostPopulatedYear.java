
public class MostPopulatedYear {
	
	public static void main(String[] args) {
		
		Person p1=new Person(1926, 1976);
		Person p2=new Person(1949, 1951);
		Person p3=new Person(1939, 1967);
		
		Person[] persons=new Person[3];
		persons[0]=p1;
		persons[1]=p2;
		persons[2]=p3;
		System.out.println(getPopulatedYear(persons));
	}
	
	public static int getPopulatedYear(Person[] persons)
	{
		int[] pop=new int[100];
		for(Person p: persons)
		{
			
			pop[p.birth-1900]++;
			pop[p.death-1900]--;
			
		}
		int max=pop[0];
		int sum=0;
		int maxIndex=0;
		for(int i=0;i<100;i++)
		{
			sum+=pop[i];
			if(max<sum)
			{
				max=sum;
				maxIndex=i;
			}
				
		}
		
		return (maxIndex+1900);	
	}

}


