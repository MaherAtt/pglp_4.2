package uvsq.pglpp42;

public class QuitCommand implements Command {
  Interpreteur r;

  public QuitCommand(Interpreteur inter){
    r = inter;
  }

  public void execute() {
    // TODO Auto-generated method stub
    r.actif = false;
    System.exit(0);
  }
}
