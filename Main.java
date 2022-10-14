import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> persons = new ArrayList<Person>();
        char myOption;
        do{
            System.out.println("Choose from below:");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("5. Exit");
            System.out.println("Select Option:");
            myOption = scan.next().charAt(0);

            switch(myOption){
                case'1':
                        System.out.print("How many person you want to add:");
                        int numObj = scan.nextInt();
                        try {
                            if(numObj <=0 ){
                                scan.close();
                                throw new Exception("Zero or negative number is not valid ");
                            }
                                for(int i = 0;i<numObj; i++){
                                        System.out.println("Please Enter the name ");
                                        String name = scan.next();
                                        System.out.println("Please Enter the age ");
                                        int age = scan.nextInt();
                                        if(age <= 0 ){
                                            scan.close();
                                            throw new Exception("Its not valid number to be your age");
                                        }
                                        Person person = new Person(name, age);
                                        persons.add(person);
                                }
                        }catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                case '2':
                    System.out.println("\n---You Are Now Going to Delete a Person---");
                    int remove = scan.nextInt();
                    persons.remove(remove);
                    System.out.println("\n");
                    break;
                case '3':
                    System.out.println("\n---You Displayed The Person you Added---");
                    Iterator it = persons.iterator();
                    while(it.hasNext()){
                        System.out.println(it.next());
                    }
                    System.out.println("\n");
                    break;
                case '4':
                    System.out.println("\n              je vous remercie de votre service :)");
                    System.exit(0);
                    break;
            }
        }while(myOption != 1 || myOption != 2 || myOption != 3 || myOption != 4);
}
}
