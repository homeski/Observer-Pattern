
public class Demo 
{

	public static void main(String[] args) 
	{
		ClockTimer subject1 = new ClockTimer();
		
		DigitalDisplay observer1 = new DigitalDisplay(subject1);
		DigitalDisplay observer2 = new DigitalDisplay(subject1);
		DigitalDisplay observer3 = new DigitalDisplay(subject1);
		
		System.out.println("Subject time is: " + subject1.GetTime());
		subject1.Tick();
		
		System.out.println();
		System.out.println("Removing observer...");		
		subject1.Detach(observer2);
		subject1.Tick();
		
		System.out.println();
		System.out.println("Adding observer...");
		DigitalDisplay observer4 = new DigitalDisplay(subject1);
		subject1.Tick();
	}

}
