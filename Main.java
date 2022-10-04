import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String myfavorite[] = {"Black Color", "Black Car", "Black Gadgets", "Black T-shirt", "Black Short", "Black Motor"};
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the index of the favorites you want to display: ");
        int choice = Scan.nextInt();
        try{
            if(choice < 0){
                Scan.close();
                throw new favoriteException("The Index is Negative");
            }if(choice > 5){
                Scan.close();
                throw new favoriteException("The index "+ choice +" is not valid");
            }
            System.out.println(myfavorite[choice]);
        }catch(favoriteException e){
            System.out.println(e.getMessage());
        }
        Scan.close();
    }
}
