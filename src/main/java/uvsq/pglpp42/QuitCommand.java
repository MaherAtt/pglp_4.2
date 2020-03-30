package uvsq.pglpp42;

public class QuitCommand implements Command {
  Interpreteur rom;
  
  /**
   * constructeur de QuitCommande.
   * @param inter l interpreteur 
   */
  public QuitCommand(Interpreteur inter) {
    rom = inter;
  }

  /**
   * methode execute qui change l etat de l'interpreteur et arrete le program.
   */
  public void execute() {
    // TODO Auto-generated method stub
    rom.actif = false;
    System.exit(0);
  }
}
