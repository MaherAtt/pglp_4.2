package uvsq.pglpp42;

public class SaveCommand implements UndoableCommand {
  MoteurRpn r;
  double operand;

  public SaveCommand(MoteurRpn inter,double op) {
    r = inter;
    operand = op;
  }

  public void execute() {
    // TODO Auto-generated method stub
    r.push(operand);    
  }
  public void undo() {
    // TODO Auto-generated method stub
    r.pop();
  } 
}
