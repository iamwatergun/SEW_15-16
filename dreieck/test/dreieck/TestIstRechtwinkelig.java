package dreieck;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TestIstRechtwinkelig {

	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	//rechtWinkelig()
		@Test
		public void istDreieckRechtWinkeligAIstHypotenuse() {
			dreieck.setSeite_a(17);
			dreieck.setSeite_b(8);
			dreieck.setSeite_c(15);
			
			assertTrue(dreieck.rechtWinkelig());
		}
		
		@Test
		public void istDreieckRechtWinkeligBIstHypotenuse() {
			dreieck.setSeite_a(15);
			dreieck.setSeite_b(17);
			dreieck.setSeite_c(8);
			
			assertTrue(dreieck.rechtWinkelig());
		}
		
		@Test
		public void istDreieckRechtWinkeligCIstHypotenuse() {
			dreieck.setSeite_a(15);
			dreieck.setSeite_b(8);
			dreieck.setSeite_c(17);
			
			assertTrue(dreieck.rechtWinkelig());
		}
		
		@Test
		public void istDreieckRechtWinkeligCNein() {
			dreieck.setSeite_a(1);
			dreieck.setSeite_b(1);
			dreieck.setSeite_c(1);
			
			assertFalse(dreieck.rechtWinkelig());
		}
		
		@Test
		public void istDreieckRechtwinkeligFalse() {
			dreieck.setSeite_a(2);
			dreieck.setSeite_b(4);
			dreieck.setSeite_c(6);
			
			assertFalse(dreieck.rechtWinkelig());
		}

		@Test
		public void istDreieckRechtwinkeligIstDreieckFalse() {
			dreieck.setSeite_a(0);
			dreieck.setSeite_b(4);
			dreieck.setSeite_c(6);
			
			assertFalse(dreieck.rechtWinkelig());
		}

}
