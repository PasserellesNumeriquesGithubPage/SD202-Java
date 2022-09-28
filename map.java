import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class map{
        public static void main(String[] args) {
            Map<Integer, String> hashMAP = new HashMap<Integer, String>();
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
                        System.out.println("\n---You are now going to add a Day and Week---");
                        for (int i = 0; i < 5; ++i) {
                            System.out.println("Type a Key to add");
                            Integer a = scan.nextInt();
                            String b = scan.nextLine();
                            if(a % 3 == 0){
                                System.out.println("Youre not Allowed to add Prime numbers");
                            }else{
                                hashMAP.put(a, b);
                            }
                        }
                        System.out.println("\n");
                        break;
                    case '2':
                        System.out.println("\n---You are now going to delete using the Day---");
                        Integer a = scan.nextInt();
                        hashMAP.remove(a);
                        System.out.println("\n");
                        break;
                    case '3':
                        System.out.println("\n---You Displayed Hash Map arrays value---");
                        Set<Integer> keys = hashMAP.keySet();
                        for(Integer key : keys){
                            System.out.println("Key="+key + " Value="+hashMAP.get(key));
                        }
                        System.out.println("\n");
                        break;
                    case '4':
                        System.out.println("\n---You Cleared The Hash Map arrays value---");
                        hashMAP.clear();
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
