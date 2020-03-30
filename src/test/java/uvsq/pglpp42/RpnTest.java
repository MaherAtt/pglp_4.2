package uvsq.pglpp42;

import static org.junit.Assert.*;

import org.junit.Test;

import uvsq.pglp42.EmptyCommandStack;
import uvsq.pglpp42.ArithmeticRpnException;
import uvsq.pglpp42.SaisieRpn;

public class RpnTest {
	 
	@Test
	public void testSaveOperande() {
		SaisieRpn ss=new SaisieRpn();
		ss.traiterSaisie("4");
		assert(ss.r.operandes.size()==1 && ss.r.operandes.get(0)==4);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSaisiIncoherente() {
		SaisieRpn ss=new SaisieRpn();
		ss.traiterSaisie("nothing");
		
	}
	
	@Test
	public void testOperationPlus() {
		SaisieRpn ss=new SaisieRpn();
		ss.traiterSaisie("4");
		ss.traiterSaisie("5");
		ss.traiterSaisie("+");
		assert(ss.r.operandes.size()==1 && ss.r.operandes.get(0)==9);		
	}
	
	@Test
	public void testOperationMul() {
		SaisieRpn ss=new SaisieRpn();
		ss.traiterSaisie("4");
		ss.traiterSaisie("5");
		ss.traiterSaisie("*");
		assert(ss.r.operandes.size()==1 && ss.r.operandes.get(0)==20);		
	}
	
	@Test
	public void testOperationDiv() {
		SaisieRpn ss=new SaisieRpn();
		ss.traiterSaisie("20");
		ss.traiterSaisie("5");
		ss.traiterSaisie("/");
		assert(ss.r.operandes.size()==1 && ss.r.operandes.get(0)==4);		
	}
	
	@Test
	public void testOperationSub() {
		SaisieRpn ss=new SaisieRpn();
		ss.traiterSaisie("20");
		ss.traiterSaisie("5");
		ss.traiterSaisie("-");
		assert(ss.r.operandes.size()==1 && ss.r.operandes.get(0)==15);		
	}
	
	@Test(expected=ArithmeticRpnException.class)
	public void testSaisieOperationNonValid() {
		SaisieRpn ss=new SaisieRpn();
		ss.traiterSaisie("4");
		ss.traiterSaisie("+");
			
	}
	
	@Test
	public void testUndo() {
		SaisieRpn ss=new SaisieRpn();
		ss.traiterSaisie("4");
		ss.traiterSaisie("5");
		ss.traiterSaisie("undo");
		assert(ss.r.operandes.size()==1 && ss.r.operandes.get(0)==4);
	}
	
	@Test(expected=EmptyCommandStack.class)
	public void testundoPileVide() {
		SaisieRpn ss=new SaisieRpn();
		ss.traiterSaisie("undo");	
	}

}
