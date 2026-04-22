package a2;

public class A2_main {
	public static void main(String[] args) {
		
		    TimeUnit h = new Hours(2);        // 7200s
		    TimeUnit m = new Minutes(30);     // 1800s
		    TimeUnit s = new Seconds(500);    // 500s
		    TimeUnit ts = new TimeSpan(5,10,20); // 18620s

		    // Basis-Test
		    System.out.println(atLeast4000Seconds(h)); // true
		    System.out.println(atLeast4000Seconds(m)); // false

		    // (a)
		    System.out.println(atLeast(300, s)); // true
		    System.out.println(atLeast(2000, m)); // false

		    // (b)
		    System.out.println(atLeast(2, 'h', h)); // true
		    System.out.println(atLeast(30, 'm', m)); // true
		    System.out.println(atLeast(500, 's', s)); // true

		    // Beispiel aus Aufgabe
		    System.out.println(atLeast(256, 'm', ts)); // true

		    // Grenzfall
		    System.out.println(atLeast(18620, 's', ts)); // true
		    System.out.println(atLeast(18621, 's', ts)); // false
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
		if (c == 'h') amount *= 3600;
		else if (c == 'm') amount *= 60;
		else if (c == 's') amount *= 1;
		else throw new IllegalArgumentException("Ungültige Einheit");
		return unit.getSeconds() >= amount;
	}
}


