
public class ClientClas {
	public static void main(String args[]) {
		AbstractFactory old = new newFurnutire();
		Chair chair = old.createChair();
		chair.getType();
	}

}
