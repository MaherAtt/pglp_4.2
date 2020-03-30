package uvsq.pglpp42;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Interpreteur {
  protected ArrayList<UndoableCommand> historique;
  protected boolean actif;
  public Interpreteur() {
    historique = new ArrayList<UndoableCommand>();
    actif = true;
  }

  public void undo() {
    UndoCommand u = new UndoCommand(this);
    u.execute();
  }

  public void quit() {
    QuitCommand q = new QuitCommand(this);
    q.execute();
  }

  public void removeLastCmd() {
    historique.remove(historique.size() - 1);
  }

  public UndoableCommand getLastCmd() {
    if (historique.size() > 0) {
      return historique.get(historique.size() - 1);
    } else {
      throw new EmptyCommandStack(); 
    }
  }
}