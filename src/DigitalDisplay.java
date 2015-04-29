
public class DigitalDisplay extends Observer
{
	// All displays have a ClockTimer they watch
	private ClockTimer _subject;
	
	DigitalDisplay(ClockTimer subject)
	{
		_subject = subject;
		
		// Add this display as an observer of the ClockTimer
		_subject.Attach(this);
	}
	
	void Destroy()
	{
		// Let the ClockTimer know this display isn't watching anymore
		_subject.Detach(this);
	}
	
	// Called when ClockTimer updates
	public void Update()
	{
		System.out.format("DigitalDisplay reads: %s\n", _subject.GetTime());
	}
}
