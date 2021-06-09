
class OldChair implements Chair {

	@Override
	public void getType() {
		System.out.println("This is old chair");	
	}

}
class NewChair implements Chair{

	@Override
	public void getType() {
		System.out.println("This is new Chair");
		
	}
}
