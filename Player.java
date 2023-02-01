import java.util.*;

public class Player extends Character {
  private ArrayList<Evidence> evidenceList;

  public ArrayList<Evidence> getEvidenceList() {
    return evidenceList;
  }

  public void inspectEvidence();
  public void presentEvidence();
}