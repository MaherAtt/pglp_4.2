package uvsq.pglpp42;

public class OperationCommand implements UndoableCommand {
  private MoteurRpn r;
  private double op1;
  private double op2;
  private char operation;

  public OperationCommand(MoteurRpn mtr,char operat) {
    operation = operat;
    r = mtr;
  }
  
  public void execute() {
    // TODO Auto-generated method stub
    GestionException.testPileOperation(r.operandes);
    op2 = r.pop();
    op1 = r.pop();
    switch (operation) {
      case '+' : r.push(op1 + op2); 
      break;
      case '-' : r.push(op1 - op2); 
      break;
      case '*' : r.push(op1 * op2); 
      break;
      case '/' : r.push(op1 / op2); 
      break;
      default : break;
    }
  }

  public void undo() {
    // TODO Auto-generated method stub
    r.pop();
    r.push(op1);
    r.push(op2);
  }
}
