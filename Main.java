import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<Person>();
            System.out.print("How many person you want to add:");
            int numObj = scan.nextInt();
            scan.nextLine();
                try{
                        if(numObj > 0 ){
                            for(int i = 0;i<numObj; i++){
                                System.out.println("Please enter the name of The Thing for number "+ i);
                                String name = scan.nextLine();
                                persons.add(new Person(name));
                            }
                            for(int j = 0;j<numObj; j++){
                                System.out.println(persons.get(j).getName());
                            }
                        }else if(numObj == 0){
                            scan.close();
                            throw new ExceptionS("Zero is not valid to input");
                        }else{
                            scan.close();
                            throw new ExceptionS("Negative Variable is not allowed");
                        }
                }catch(ExceptionS e){
                    System.out.println(e.getMessage());
                }
        
    } 
}
/*
1. Create a class with at least 2 properties, and also your own Exception class.
2. In the Main Class, there will be a number input that will ask the user how many objects to create.
3. Put the objects inside an array of objects created, you can use ArrayList and use the class that you 
    created as the object.
4. Ask for user input for the values of the properties (ex. Name, Age for Person class). All the objects 
    created must have values.
5. Think of two scenarios to prevent and implement  try catch. (ex. Name should be string or should not contain 
    special characters etc.)
*/
// You can create or use the Main class used from Monday. Submit with the repository link.