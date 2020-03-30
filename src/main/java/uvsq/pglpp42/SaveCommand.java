package uvsq.pglpp42;

public class SaveCommand implements UndoableCommand {
  MoteurRpn rom;
  double operand;

  /**
   * constructeur de SaveCommand.
   * @param inter MoteurRpn
   * @param op l operande a enregistrer
   */
  public SaveCommand(MoteurRpn inter,double op) {
    rom = inter;
    operand = op;
  }

  /**
   * methode execute qui enregistre l operande.
   */
  public void execute() {
    // TODO Auto-generated method stub
    rom.push(operand);    
  }
  
  /**
   * methode undo qui annule l'enregistrement et supprime la drn operande enregistré.
   */
  public void undo() {
    // TODO Auto-generated method stub
    rom.pop();
  } 
}
