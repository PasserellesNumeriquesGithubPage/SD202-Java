public class Animal{
  // public Animal(String power){
  //     System.out.println("I have a: "+power);
  // }
  private String name; // private = restricted access
  // Getter
  public String getName() {
    return name;
  }
  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
  

  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}