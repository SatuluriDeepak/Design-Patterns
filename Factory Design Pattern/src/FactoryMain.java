import com.phone.OS;
import com.phone.OSFactory;

public class FactoryMain {
	public static void main(String args[]) {
		//Differ =
		OSFactory os = new OSFactory();
		OS obj = os.getOs("IOS");
		obj.show();
	}

}

