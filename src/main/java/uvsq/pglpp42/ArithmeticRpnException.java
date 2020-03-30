package uvsq.pglpp42;

public class ArithmeticRpnException extends RuntimeException {
  /**
   * Constructeur de l'exception.
   * @param msg : message qui s'affiche avec l'exception
   */
  public ArithmeticRpnException(String msg) {
    super(msg);
  }
}