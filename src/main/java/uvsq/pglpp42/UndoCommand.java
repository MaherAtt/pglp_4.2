package uvsq.pglpp42;

public class UndoCommand implements Command {
  Interpreteur rom;

  /**
   * constructeur de undoCommand.
   * @param inter interpteteur
   */
  public UndoCommand(Interpreteur inter) {
    rom = inter;
  }

  /**
   * methode execute qui anulle la drn commande executé.
   */
  public void execute() {
    // TODO Auto-generated method stub
    rom.getLastCmd().undo();
    rom.removeLastCmd();
  }
}
