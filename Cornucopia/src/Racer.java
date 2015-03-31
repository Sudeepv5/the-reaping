
public class Racer implements Runnable{
	public static String winner;
	
	
	public void race(){
		for(int dist=1;dist<=100;dist++)
		{
			System.out.println("Distance covered by "+Thread.currentThread().getName()+": "+ dist);
			if(isRaceFinished(dist))
				break;
			
		}
		
	}

	private boolean isRaceFinished(int distCovered) {
		if(distCovered==100 && winner==null)
		{
			String participant=Thread.currentThread().getName();
			winner=participant;
			System.out.println("Winner is "+ winner);
			return true;
		}
		return false;
	}

	@Override
	public void run() {
		race();
		
	}
	
	public static void main(String[] args) {
		Racer rc=new Racer();
		Thread tort=new Thread(rc,"Tortoise");
		Thread hare=new Thread(rc,"Hare");
		tort.start();
		hare.start();
	}

}
