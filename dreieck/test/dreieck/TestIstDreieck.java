package dreieck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestIstDreieck {
	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;

	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	//seite_a == 0 || seite_b == 0 || seite_c == 0
	@Test
	public void istDreieckSeiteANull() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());   // assertFalse prüft ob false zurückgeliefert wird
	}										 // falls dies passier ist der Test erfolgreich
	
	@Test
	public void istDreieckSeiteBNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteCNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(0);
		
		assertFalse(dreieck.istDreieck());
	}
	
	//seite_a < 0 || seite_b < 0 || seite_c < 0
	@Test
	public void istDreieckSeiteAKleinerNull(){
		dreieck.setSeite_a(-5);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteBKleinerNull(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(-5);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteCKleinerNull(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(-5);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteXKleinerNullFalse(){
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(6);
		dreieck.setSeite_c(7);
		
		assertTrue(dreieck.istDreieck());
	}

	//Summe zweier Seiten darf nicht gleich dem Betrag der dritten Seite entsprechen
	@Test
	public void istDreieckSummeAUndBGleichC() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(6);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSummeAUndCGleichB() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(6);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSummeBUndCGleichA() {
		dreieck.setSeite_a(6);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	//Summe zweier Seiten darf nicht kleiner 0 sein
	@Test
	public void istDreieckSummeAUndBKleinerNull() {
		dreieck.setSeite_a(Integer.MAX_VALUE -1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSummeAUndCKleinerNull() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(Integer.MAX_VALUE -1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSummeBUndCKleinerNull() {
		dreieck.setSeite_b(Integer.MAX_VALUE -1);
		dreieck.setSeite_a(3);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	//Summe zweier Seiten darf nicht kleiner dem Betrag der dritten Seite entsprechen
	@Test
	public void istDreieckSummeAUndBKleinerC() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(5);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSummeAUndCKleinerB() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSummeBUndCKleinerA() {
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
}
