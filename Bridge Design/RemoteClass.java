interface RemoteClass{
	void on();
	void off();
}
class OldRemote implements RemoteClass{

	@Override
	public void on() {
		System.out.print("On with Old Remote");
		
	}

	@Override
	public void off() {
		System.out.print("Off with Old Remote");
		
	}
	
}
class NewRemote implements RemoteClass{

	@Override
	public void on() {
		System.out.print("On with New Remote");
		
	}

	@Override
	public void off() {
		System.out.print("Off with New Remote");
		
	}
	
}
