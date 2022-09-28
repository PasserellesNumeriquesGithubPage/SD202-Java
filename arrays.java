import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class arrays{
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    Set<Integer> set = new HashSet<Integer>();

    public void arrayList(){
            System.out.println("-The ArrayList-");
            for(int i = 0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
    }
    public void hashSet(){
            System.out.println("-The HashSet-");
            set.forEach(System.out::println);
    }
    public void input(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Type whole numbers only: ");
            int num = sc.nextInt();
            list.add(num);
            set.add(num);    
        }
    }
}