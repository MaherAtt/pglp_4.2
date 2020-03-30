package uvsq.pglpp42;

public interface UndoableCommand extends Command {
  public void undo();
}
