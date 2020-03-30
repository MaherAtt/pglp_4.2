package uvsq.pglpp42;

import java.util.EmptyStackException;
import java.util.Stack;

public class GestionException {
  public static void testPileOperation(Stack<Double> d) {
    if (d.size() < 2) { 
      throw new ArithmeticRpnException("Pas assez d'operandes");
    }
  }
 
  public static void testSaisieOper(String st) {
    if (!st.equals("+") && !st.equals("*") && !st.equals("/") && !st.equals("-") && !st.equals("undo") && !st.equals("quit")) {
      throw new IllegalArgumentException();
    }
  }
}