
class newFurnutire implements AbstractFactory{

	@Override
	public Chair createChair() {
		
		return new NewChair();
	}
	
}
class OldFurnutire implements AbstractFactory{

	@Override
	public Chair createChair() {
		
		return new OldChair();
	}
	
}
