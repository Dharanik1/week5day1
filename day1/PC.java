package Week5.day1;

public class PC  extends Laptop{
	
	public void getSystemInfo()
	{
		
		System.out.println("System Info is MAC");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PC obj = new PC();
		obj.getSystemInfo();
	}

}
