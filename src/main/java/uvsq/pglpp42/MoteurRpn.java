package uvsq.pglpp42;

import java.util.Stack;

public class MoteurRpn extends Interpreteur {
  protected Stack<Double> operandes;

  public MoteurRpn() {
    operandes = new Stack<Double>();
  }

  public void saveOperande(double op) {
    SaveCommand sv = new SaveCommand(this,op);
    sv.execute();
    this.historique.add(sv);
  }

  public void operation(char op) {
    OperationCommand o = new OperationCommand(this,op);
    o.execute();
    this.historique.add(o);
  }

  public void push(double r) {
    operandes.push(r);
  }

  public double pop() {
    return operandes.pop();
  }

  public void afficherStack() {
    for (int i = 0;i < operandes.size();i++) {
      System.out.println(operandes.get(i));
    }
  }
}
