
public class ClockTimer extends Subject
{
	private int _currentTime;
	
	ClockTimer()
	{
		_currentTime = 1;
	}
	
	public int GetTime()
	{
		return _currentTime;
	}
	
	public void Tick()
	{
		_currentTime++;
	
		// Reset the hour back to 1
		_currentTime = _currentTime > 12 ? 1 : _currentTime;
		
		System.out.println("Tick");
		
		// Notify all observers of the change
		super.Notify();
	}
}
