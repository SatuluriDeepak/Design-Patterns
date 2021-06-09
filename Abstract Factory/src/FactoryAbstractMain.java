import com.phone.OS;
import com.phone.OSFactory;

public class FactoryAbstractMain {
	public static void main(String args[]) {
		OSFactory os = new OSFactory();
		OS obj = os.getOs("IOS");
		obj.show();
	}

}
