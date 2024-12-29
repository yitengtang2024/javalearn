package Final;

public final class Moon{
  private String name;

  public Moon(String name){
    this.name=name;
  }

  public String getName(){
    return name;
  }

  public void orbitEarth(){
    System.out.println(name + " is orbiting Earth.");
  }
}
