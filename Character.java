public abstract class Character {
    private String name;
    private String description;
    private Location currentLocation;

    public Character(String n){
        this.name = n;
        this.currentLocation = null;
    }
  
    public Character(String n, Location l){
        this.name = n;
        this.currentLocation = l;
    }

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }
  
    public Location getCurrentLocation(){
        return currentLocation;
    }
  }
