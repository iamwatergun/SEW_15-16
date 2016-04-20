package dreieck;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TestIstGleichschenkelig {

	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	//gleichSchenklig()
	//Ist das Dreieck gleichschenklig wird ein true geliefert. Folgende Regel muss erfuellt sein: Zwei Seiten muessen gleich lang sein
	@Test
	public void istDreieckSeiteAUndBGleichSchenklig(){
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(5);
			
		assertTrue(dreieck.gleichSchenkelig());
	}
		
	@Test
	public void istDreieckSeiteAUndCGleichSchenklig(){
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(3);
			
		assertTrue(dreieck.gleichSchenkelig());
	}
		
	@Test
	public void istDreieckSeiteBUndCGleichSchenklig(){
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
			
		assertTrue(dreieck.gleichSchenkelig());
	}
}
