package tttGame;

public class TicTacToeMain {
	
	/**
	 * Die MAIN Methode.
	 * =================
	 * Bestimmt den Ablauf des Spiels und wird bei
	 * Programmstart aufgerufen.
	 */
	public static void main(String[] args) {
		
		// TODO schreibt eine Mainfunktion,
		// um den Spielablauf zu beschreiben.
		
		// === Spielablauf vorbereiten ===

		// Erstelle Spielfeld
		int Feld[] = new Feld[8];
		
		// Erstelle Spieler
		
		
		// Setze Spieler, der anfaengt.  
		Spieler aktiverSpieler = null;
		
		// === Spielablauf ===
		
		while ( true ) {
			// Drucke Spielfeld
			// Lese Position von Nutzer ein.
			// Trage Position in Spielfeld ein.
			// Hat jemand gewonnen?
			
			if ( gewinner != null ) {
				System.out.print("Der Spieler ");
				// Gebe Namen des Gewinners aus.
				System.out.print(" hat gewonnen!");
				return;
			}
			// Wechsle den aktiven Spieler

		}
	}
}
