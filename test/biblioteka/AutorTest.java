/**
 * 
 */
package biblioteka;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutorTest {

	private Autor autor;
	
	@Before
	public void setUp() throws Exception {
		autor = new Autor();
	}

	@After
	public void tearDown() throws Exception {
		autor = null;
	}

	@Test
	public void testSetIme() {
		autor.setIme("Pera");
		
		assertEquals("Pera", autor.getIme());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImeNull() {
		autor.setIme(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImeEmptyString() {
		autor.setIme("");
	}

	@Test
	public void testSetPrezime() {
		autor.setPrezime("Peric");
		
		assertEquals("Peric", autor.getPrezime());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimeNull() {
		autor.setPrezime(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimeEmptyString() {
		autor.setPrezime("");
	}

}
