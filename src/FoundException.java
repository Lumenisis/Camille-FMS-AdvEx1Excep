import java.util.Date;

public class FoundException {
	
	public static void main(String[] args) {
		Date date = null;
		Date today = new Date();
		try {
			System.out.println(date.getClass().getName());
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(today.getClass().getName());
		}
	}
}