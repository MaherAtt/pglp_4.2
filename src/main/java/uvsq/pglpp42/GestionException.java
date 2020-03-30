package uvsq.pglpp42;

import java.util.EmptyStackException;
import java.util.Stack;

public class GestionException {
  
  /**
   * méthode qui test si il y'as assez d'operandes dans la pile.
   * @param d pile des operandes
   */
  public static void testPileOperation(Stack<Double> d) {
    if (d.size() < 2) { 
      throw new ArithmeticRpnException("Pas assez d'operandes");
    }
  }
  
  /**
   * méthode qui teste si la commande saisie est valide.
   * @param st chaine saisie par user
   */
  public static void testSaisieOper(String st) {
    if (!st.equals("+") && !st.equals("*") && !st.equals("/") 
        && !st.equals("-") && !st.equals("undo") && !st.equals("quit")) {
      throw new IllegalArgumentException();
    }
  }
}