public abstract class Scenario {
  private String name;
  private String dialogue;

  public void getName() {
    return name;
  }

  public void interact() {
    System.out.printf("%s\n", dialogue);
  }
}