import java.util.ArrayList;

public abstract class Subject
{
	// List of observers
	private ArrayList<Observer> _observers;
	
	// Instantiate the empty list
	Subject()
	{
		_observers = new ArrayList<Observer>();
	}
	
	// Add a new observer to watch this subject
	public void Attach(Observer observer)
	{
		_observers.add(observer);
	}
	
	// Remove an already viewing observer
	public void Detach(Observer observer)
	{
		_observers.remove(observer);
	}
	
	// Notify all observers there has been a change
	public void Notify()
	{
		for (Observer observer: _observers)
		{
			observer.Update();
		}
	}
}
