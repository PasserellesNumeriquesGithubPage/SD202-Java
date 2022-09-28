import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class set {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        char myOption;
        do{
            System.out.println("Choose from below:");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Clear");
            System.out.println("5. Exit");
            System.out.println("Select Option:");
            myOption = scan.next().charAt(0);

            switch(myOption){
                case'1':
                    System.out.println("\n---You Are Now Going to Add a Day ---");
                        for (int i = 0; i < 5; ++i) {
                        System.out.println("Type a day");
                        Integer add = scan.nextInt();
                        Boolean x = set.contains(add);
                            if (x == false) {
                                set.add(add);
                            } else {
                                System.out.println("Your not allowed to add existing number");
                                break;
                            }
                        }
                    System.out.println("\n");
                    break;
                case '2':
                    System.out.println("\n---You Are Now Going to Delete a Day---");
                    Integer remove = scan.nextInt();
                    set.remove(remove);
                    System.out.println("\n");
                    break;
                case '3':
                    System.out.println("\n---You Displayed The Days you Added---");
                    Iterator it = set.iterator();
                    while(it.hasNext()){
                        System.out.println(it.next());
                    }
                    System.out.println("\n");
                    break;
                case '4':
                    System.out.println("\n---You Cleared The Hash Map arrays value---");
                    set.clear();
                    System.out.println("\n");
                    break;
                case '5':
                    System.out.println("\n              je vous remercie de votre service :)");
                    System.exit(0);
                    break;
            }
        }while(myOption != 1 || myOption != 2 || myOption != 3 || myOption != 4 || myOption != 5);
}
}
