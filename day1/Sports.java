package Week5.day1;

public class Sports {
	
	public void acheiver(String name, int medalCount)
	{
		System.out.println( name+" "+medalCount);
	}
	
	public void acheiver(String country,String sportName, int rank)
	{
		System.out.println( country+" "+sportName+" "+rank);
	}
	public void acheiver(float weight, int height, long contactNo)
	{
		System.out.println( weight+" "+height+" "+contactNo);
	}
	public void acheiver(String tournamentName, long prizeMoney)
	{
		System.out.println( tournamentName+""+prizeMoney);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports obj = new Sports();
		obj.acheiver("xyz", 10);
		obj.acheiver("India","Racing", 1);
		obj.acheiver(14,10, 9876549);
		obj.acheiver("abcd", 100000);
	}

}
