package uvsq.pglpp42;

import java.util.Scanner;

public class SaisieRpn {
  protected MoteurRpn r;

  public SaisieRpn() {
    r = new MoteurRpn();  
  }
  
  public void saisir() {
    System.out.println("Saisissez :");
    System.out.println("1-Un nombre");
    System.out.println("2-Une operation");
    System.out.println("3-Undo pour anuller la derniere command");
    System.out.println("4-Quit pour quitter");
    Scanner sc = new Scanner(System.in);
    while (true) {
      r.afficherStack();
      String str = sc.nextLine();
      String[] strs = str.split(" ");
      for (int i = 0;i < strs.length;i++) {
        this.traiterSaisie(strs[i]);
      }
    }
  }
  
  public void traiterSaisie(String sais) {
    try {
      double h = Double.parseDouble(sais);
      r.saveOperande(h);
    } catch (Exception e) {
      GestionException.testSaisieOper(sais);
      switch (sais) {
        case "undo" : r.undo();
        break;
        case "quit" : r.quit(); 
        break;
        default : r.operation(sais.charAt(0));
      }
            
    }
  }
}
