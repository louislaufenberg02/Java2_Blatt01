package a2;

public class A2_main {
	public static void main(String[] args) {
		TimeUnit ts = new TimeSpan(5, 10, 20);
		System.out.println(atLeast(256, 'm', ts));
	}

	//(a)
	public static boolean atLeast4000Seconds (TimeUnit unit) {
		return unit.getSeconds() >= 4000;
	}
	
	//(b)
	public static boolean atLeast (int amount, TimeUnit unit) {
		return unit.getSeconds() >= amount;
	}
	
	//(c)
	public static boolean atLeast (int amount, char c, TimeUnit unit) {
		if (c == 'h') amount = amount * 3600;
		if (c == 'm') amount = amount * 60;
		return unit.getSeconds() >= amount;
	}
}


