package a1;

public class Password implements Comparable<String> {
	String value;
	
	public Password(String value) {
		this.value = value;
	}
	
	public int compareTo (String o) {
		//Überprüfen ob value länger ist als o -> 1.
		if(this.value.length() > o.length()) return 1;
		
		//Überprüfen ob value kürzer ist als o -> -1.
		if(this.value.length() < o.length()) return -1;
		
		//-> Beide Passwörter gleich lang. Jetzt wird überprüft welches Passwort wieviele Ziffern hat.
		int sumDigitsValue = 0;
		int sumDigitsO = 0;
		for(int i = 0; i < value.length(); i++) {
			if (Character.isDigit(value.charAt(i)) == true) sumDigitsValue++;
			if (Character.isDigit(o.charAt(i)) == true) sumDigitsO++;
		}
		
		//value mehr Ziffernals o -> 1; value weniger Ziffern als 0 -> -1; value genau so viele Ziffern wie o -> 0.
		if(sumDigitsValue > sumDigitsO) return 1;
		else if(sumDigitsValue < sumDigitsO) return -1;
		else return 0;
	}
}
