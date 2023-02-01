public class NPC extends Character implements Interactive {
  private String dialog;
  private String alibi;

    public NPC(String n){
        super(n);
        this.dialog = "Hello.";
    }

    public void String getAlibi() {
      return alibi;
    }
  
    public void interact() {
      System.out.printf("%s\n", dialog);
    }
}