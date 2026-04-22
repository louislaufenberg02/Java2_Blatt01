package a1;

public class A1_main {
	public static void main(String[] args) {
	    Password p1 = new Password("abc");
	    Password p2 = new Password("abcd");
	    Password p3 = new Password("abc1");
	    Password p4 = new Password("ab12");

	    System.out.println(p1.compareTo("abcd"));  // -1
	    System.out.println(p2.compareTo("abcde"));  // -1
	    System.out.println(p3.compareTo("abcd"));  // 1
	    System.out.println(p4.compareTo("cd34"));  // 0
	}
}
