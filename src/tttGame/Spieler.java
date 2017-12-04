package tttGame;

import java.util.Scanner;

public class Spieler {
	
	/** 
	 * Der Name des Spielers.
	 * Ein Attribut vom Typ String.
	 */	
	private String name;
	
	/**
	 * Das Symbol des Spielers auf dem Spielfeld.
	 * Ein Attribut vom Typ char.
	 * 
	 * Siehe:
	 * http://openbook.rheinwerk-verlag.de/javainsel/javainsel_02_003.html#dodtp070cd74f-8bb2-43fc-bbe4-fd5a9499b793
	 * 
	 */
	// TODO Hier Code einfuegen.
	
	/**
	 * Der Konstruktor fuer Spieler Objekte.
	 * 
	 * Er nimmt als Argumente einen String fuer den Namen,
	 * und ein char fuer das Symbol entgegen
	 * und setzt die Attribute entsprechend.
	 */
	public Spieler(String n, char s) {
		// Hier Code einfuegen.
	}
	
	/**
	 * Der Standardkonstruktor fuer Spieler Objekte.
	 * 
	 * (Der obige Konstrukor ging davon aus, dass ihm ein String
	 * fuer den Namen und ein char fuer das Symbol mitgeliefert 
	 * wurden. Ein Konstruktor, der keine Daten mitgeliefert bekommt,
	 * nennt man den Standardkonstruktor. In dem Fall muss man sich fuer
	 * geschickte Basiswerte entscheiden.)
	 */
	public Spieler() {
		// Hier Code einfuegen.
	}
	
	/**
	 * Gibt den Namen des Spielers zurueck.
	 */
	public String getName() {
		// Hier Code einfuegen / ersetzen.
		return "";
	}
	
	/**
	 * Gibt das Symbol des Spielers zurueck.
	 */
	public char getSymbol() {
		// TODO Hier Code einfuegen / ersetzen.
		return ' ';
	}
	
	/**
	 * Fragt den Spieler nach einem Eintrag auf dem Spielfeld.
	 * Gibt eine Ganzzahl zwischen 0 und 8 zurueck.
	 */
	public int frageEintrag(Spielfeld spielfeld) {
		// TODO Schaue Dir diese Methode an und vollziehe nach, was passiert.
		
		Scanner reader = new Scanner(System.in);
		int eingabe;
		
	    while (true) {
	    	// Frage an den Nutzer. Ganzzahl einlesen.
	        System.out.println("Gib ein Feld ein (0-8): ");
	        eingabe = reader.nextInt();
	        
	        // Pruefen, ob die Eingabe eine gueltige
	        // Feldkoordinate ist. Siehe:
	        // http://openbook.rheinwerk-verlag.de/javainsel/javainsel_02_004.html#dodtpb215cb39-b959-4629-8054-0476644a4101
	        // http://openbook.rheinwerk-verlag.de/javainsel/javainsel_02_004.html#dodtp844cb2de-7840-4ea8-b8e3-1bc7e4c1bd52
	        if ( (eingabe < 0) || (eingabe > 8) ) {
		        System.out.println("Ungueltige Eingabe");
		        // Springe direkt zum naechsten Schleifendurchlauf. 
		        // Siehe:
		        // http://openbook.rheinwerk-verlag.de/javainsel/javainsel_02_006.html#dodtp36aea11f-ff17-49bc-b8ec-05229cdbac7a
		        continue;
	        }
	        
	        // Pruefen, ob die Position leer ist.
	        // Wenn ja, lasse Eingabe zu. Wenn Nein, gib Nachricht und gehe zum naechsten Durchlauf.
	        if ( spielfeld.getPosition(eingabe).istLeer() ) {
	        	return eingabe;
	        } else {
	        	System.out.println("Position ist belegt.");
	        }
	    }
	}
}