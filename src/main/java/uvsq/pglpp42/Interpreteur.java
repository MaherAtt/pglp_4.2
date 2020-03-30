package uvsq.pglpp42;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Interpreteur {
  protected ArrayList<UndoableCommand> historique;
  protected boolean actif;
  
  /**
   * constructeur de l'interpreteur.
   */
  public Interpreteur() {
    historique = new ArrayList<UndoableCommand>();
    actif = true;
  }

  /**
   * méthode undo qui crée une undoCommand et l'execute.
   */
  public void undo() {
    UndoCommand u = new UndoCommand(this);
    u.execute();
  }

  /**
   * méthode quit qui crée une QuitCommand et l'execute.
   */
  public void quit() {
    QuitCommand q = new QuitCommand(this);
    q.execute();
  }

  /**
   * méthode qui supprime la dérniere commande de l'historique.
   */
  public void removeLastCmd() {
    historique.remove(historique.size() - 1);
  }

  /**
   * méthode qui retourne la derniere commande de l'historique.
   * @return la derniere commande
   */
  public UndoableCommand getLastCmd() {
    if (historique.size() > 0) {
      return historique.get(historique.size() - 1);
    } else {
      throw new EmptyCommandStack(); 
    }
  }
}