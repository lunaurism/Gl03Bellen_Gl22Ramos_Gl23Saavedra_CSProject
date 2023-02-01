public class Evidence implements Interactive {
  protected String name;
  private String description;
  private Location currentLocation;

  public String getName() {
        return name;
    }

  public String getDescription() {
        return description;
  }
  
  public Location getCurrentLocation() {
        return currentLocation;
  }

  public void inspect(Interactive i) {
    i.interact();
  }
  
  public void present(Interactive p) {
    p.interact();
  }