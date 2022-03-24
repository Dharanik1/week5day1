package Week5.day1;

public class Desktop extends Computer {
public void DesktopSize()
{
	System.out.println("Size is 12 inch");
}
public static void main(String[] args)
{
	Desktop obj = new Desktop();
	obj.computerModel();
	obj.DesktopSize();
}

}

