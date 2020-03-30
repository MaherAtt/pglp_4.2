package uvsq.pglpp42;

public class UndoCommand implements Command {
  Interpreteur r;

  public UndoCommand(Interpreteur inter) {
    r = inter;
  }

  public void execute() {
    // TODO Auto-generated method stub
    r.getLastCmd().undo();
    r.removeLastCmd();
  }
}
