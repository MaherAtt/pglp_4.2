package uvsq.pglpp42;

import static org.junit.Assert.*;

import org.junit.Test;

public class RpnTest {
	 
	@Test
	public void testSaveOperande() {
		SaisieRpn ss=new SaisieRpn();
		ss.traiterSaisie("4");
		assert(ss.r.operandes.size()==1 && ss.r.operandes.get(0)==4);
	}
	
	
	
	

}
