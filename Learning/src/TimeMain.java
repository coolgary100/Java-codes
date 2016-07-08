
public class TimeMain {
	public static void main(String[] args) {
		Time timeObject = new Time();
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());
		
		timeObject.setTime(13, 27, 6);
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());
		
	}
}
