package uvsq.pglpp42;

public class OperationCommand implements UndoableCommand {
  private MoteurRpn rom;
  private double op1;
  private double op2;
  private char operation;

  /**
   * constructeur de la commande.
   * @param mtr moteurRpn
   * @param operat operateur
   */
  public OperationCommand(MoteurRpn mtr,char operat) {
    operation = operat;
    rom = mtr;
  }
  
  /**
   * methode execute qui fait l'operation.
   */
  public void execute() {
    // TODO Auto-generated method stub
    GestionException.testPileOperation(rom.operandes);
    op2 = rom.pop();
    op1 = rom.pop();
    switch (operation) {
      case '+' : rom.push(op1 + op2); 
      break;
      case '-' : rom.push(op1 - op2); 
      break;
      case '*' : rom.push(op1 * op2); 
      break;
      case '/' : rom.push(op1 / op2); 
      break;
      default : break;
    }
  }

  /**
   * methode undo qui annule la drn operation effectué.
   */
  public void undo() {
    // TODO Auto-generated method stub
    rom.pop();
    rom.push(op1);
    rom.push(op2);
  }
}
