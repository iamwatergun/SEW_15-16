package dreieck;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TestIstGleichseitig {

	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	//gleichSeitig()
	//Ist das Dreieck gleichseitig wird ein true geliefert. Folgende Regel muss erfuellt sein: seite_a == seite_b && seite_b == seite_c
	@Test
	public void istDreieckGleichSeitig(){
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.gleichSeitig());
	}
	
	@Test
	public void istDreieckGleichseitigMitAGleichB() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(4);
		
		assertFalse(dreieck.gleichSeitig());
	}
		
	@Test
	public void istDreieckGleichseitigMitBGleichC() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.gleichSeitig());
	}
		
	@Test
	public void istDreieckGleichSeitigFalse(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(4);
			
		assertFalse(dreieck.gleichSeitig());
	}
		
	@Test
	public void istDreieckGlelichSeitigIstDreieckFalse() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(3);
		dreieck.setSeite_a(4);
		
		assertFalse(dreieck.gleichSeitig());
	}
}
