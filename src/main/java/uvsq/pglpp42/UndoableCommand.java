package uvsq.pglpp42;

public interface UndoableCommand extends Command {
  /**
   * methode abstraire undo a appeler lorseque l user saisi undo.
   */
  public void undo();
}
