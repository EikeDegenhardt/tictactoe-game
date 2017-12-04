package tttGame;

public class Spielfeld {
	
	/**
	 * Die Positionen des Spielfelds als Array mit neun Eintraegen vom Typ Position.
	 * Die erste Zeile sind die Schluessel 0, 1, 2. 
	 * Die zweite Zeile sind die Schluessel 3, 4, 5. 
	 * Die dritte Zeile sind die Schluessel 6, 7, 8.
	 */
	// TODO Arbeitet eigenstaendig das folgende Kapitel durch:
	// http://openbook.rheinwerk-verlag.de/javainsel/javainsel_03_008.html#dodtp9894e88c-16e7-4052-8cc7-1f947e09e784
	private Position[]  positionen = new Position[9];
	
	/**
	 * Standardkonstruktor.
	 * Befuellt das "positionen" Attribut initial mit neuen Position-Objekten.
	 */
	public Spielfeld() {
		// TODO Verwendet eine for-Schleife, um durch das
		// Array 'positionen' zu gehen und an jeder Stelle ein
		// neues Position-Objekt einzufuegen.
	}
	
	/** 
	 * Gibt Position an abgefragter Stelle zurueck.
	 */
	public Position getPosition(int i) {
		// TODO Hier Code einfuegen.
	}
	
	/**
	 * Setzt Besitzer an gegebener Stelle
	 * auf gegebenen Spieler
	 */
	public void setPosition(int i, Spieler s) {
		// TODO Hier Code einfuegen.
	}
	
	/** 
	 * Gibt das Spielfeld menschenlesbar aus.
	 */
	public void druckeSpielfeld() {
		System.out.println( "   |   |   ");
		System.out.println(" " + this.positionen[0].getSymbol() + " | " + this.positionen[1].getSymbol() + " | " + this.positionen[2].getSymbol() + " ");
		System.out.println("   |   |   ");
		System.out.println("---+---+---");
		System.out.println("   |   |   ");
		System.out.println(" " + this.positionen[3].getSymbol() + " | " + this.positionen[4].getSymbol() + " | " + this.positionen[5].getSymbol() + " ");
		System.out.println("   |   |   ");
		System.out.println("---+---+---");
		System.out.println("   |   |   ");
		System.out.println(" " + this.positionen[6].getSymbol() + " | " + this.positionen[7].getSymbol() + " | " + this.positionen[8].getSymbol() + " ");
		System.out.println("   |   |   ");
	}
	
	/**
	 * Bestimmt, ob das Spiel gewonnen ist.
	 * Gibt gegebenenfalls den Spieler zurueck, der gewonnen hat.
	 * Gibt es keinen Gewinner, wird das Nullobjekt zurueck gegeben.	
	 */
	public Spieler istGewonnen() {
		// TODO Pruefe, ob es einen Gewinner gibt. Beachte, was als Rueckgabe erwartet wird (obigen Kommentar).
		// Verwende die (private) Methode istGleicherSpieler() (siehe unten)
		
    	// Pruefe Reihen
   		// Pruefe Spalten
	    // Prüfe Diagonale 1
	    // Prüfe Diagonale 2
		
		// Kein Gewinner
		return null;
	}
	
	/**
	 * Prueft fuer drei Schluessel, ob die Eintraege
	 * im Spielfeld dort gleich sind.
	 */
	private boolean istGleicherSpieler(int eins, int zwei, int drei) {
		if ( (positionen[eins] == positionen[zwei]) && (positionen[zwei] == positionen[drei]) ) {
			if ( positionen[eins].istLeer() ) {
				return false;
			}
			return true;
		}
		return false;
	}
	
}
