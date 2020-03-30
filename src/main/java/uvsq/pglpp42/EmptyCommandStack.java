package uvsq.pglpp42;

public class EmptyCommandStack extends RuntimeException {
  /**
   * constructeur de l'exception.
   */
  public EmptyCommandStack() {
    super("Aucune command a anuller l'historique est vide");
  }
}