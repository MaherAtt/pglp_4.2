package uvsq.pglpp42;

import java.util.Stack;

public class MoteurRpn extends Interpreteur {
  protected Stack<Double> operandes;
  
  /**
   * constructeur de MoteurRpn.
   */
  public MoteurRpn() {
    operandes = new Stack<Double>();
  }

  /**
   * methode qui cree une SaveCommand et l'execute.
   * @param op operande saisie par le user
   */
  public void saveOperande(double op) {
    SaveCommand sv = new SaveCommand(this,op);
    sv.execute();
    this.historique.add(sv);
  }

  /**
   * methode qui cree une operationCommand et l'execute.
   * @param op operation saisie par le user
   */
  public void operation(char op) {
    OperationCommand o = new OperationCommand(this,op);
    o.execute();
    this.historique.add(o);
  }

  /**
   * methode qui emplile une operande.
   * @param r operande
   */
  public void push(double r) {
    operandes.push(r);
  }
  
  /**
   * methode qui depile une operande.
   * @return operande
   */
  public double pop() {
    return operandes.pop();
  }
  
  /**
   * methode qui affiche la pile des operandes.
   */
  public void afficherStack() {
    for (int i = 0;i < operandes.size();i++) {
      System.out.println(operandes.get(i));
    }
  }
}
