package uvsq.pglpp42;

import java.util.Scanner;

public class SaisieRpn {
  protected MoteurRpn rom;

  /**
   * constructeur de saisieRpn.
   */
  public SaisieRpn() {
    rom = new MoteurRpn();  
  }
  
  /**
   * methode qui boucle et qui demande a l user de saisir.
   */
  public void saisir() {
    System.out.println("Saisissez :");
    System.out.println("1-Un nombre");
    System.out.println("2-Une operation");
    System.out.println("3-Undo pour anuller la derniere command");
    System.out.println("4-Quit pour quitter");
    Scanner sc = new Scanner(System.in);
    while (true) {
      rom.afficherStack();
      String str = sc.nextLine();
      String[] strs = str.split(" ");
      for (int i = 0;i < strs.length;i++) {
        this.traiterSaisie(strs[i]);
      }
    }
  }
  
  /**
   * methode qui traite une saisie de l'user.
   * @param sais saisie de l'utilisateur
   */
  public void traiterSaisie(String sais) {
    try {
      double h = Double.parseDouble(sais);
      rom.saveOperande(h);
    } catch (Exception e) {
      GestionException.testSaisieOper(sais);
      switch (sais) {
        case "undo" : rom.undo();
        break;
        case "quit" : rom.quit(); 
        break;
        default : rom.operation(sais.charAt(0));
      }
            
    }
  }
}
