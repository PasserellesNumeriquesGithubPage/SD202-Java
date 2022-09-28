import java.util.Scanner;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class list{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
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
                            if(add > 0){
                                list.add(add);
                            }else{
                                System.out.println("You're not allowed to add Negative Value");
                                break;
                            }
                        }
                    System.out.println("\n");
                    break;
                case '2':
                    System.out.println("\n---You Are Now Going to Delete a Day---");
                    Integer remove = scan.nextInt();
                    list.remove(remove);
                    System.out.println("\n");
                    break;
                case '3':
                    System.out.println("\n---You Displayed The Days you Added---");
                    Stream<Integer> day = list.stream();
                    day.forEach(lists ->{
                        System.out.println("The Days you Added in the List array: "+lists);
                    });
                    System.out.println("\n");
                    break;
                case '4':
                    System.out.println("\n---You Cleared The Hash Map arrays value---");
                    list.clear();
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