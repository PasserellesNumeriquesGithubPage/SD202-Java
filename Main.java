import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
// import java.util.InputMismatchException;

public class Main{
    public static void main(String args []) {
        List<Brand> brands = new ArrayList<Brand>();
        Scanner scan = new Scanner(System.in);
        Brand brandLanding = new Brand();
        String yes = "Yes";
        String no = "No";
        int myOption;
        Menu:
        do {
                brandLanding.landingPage();
                myOption = scan.nextInt();
                System.out.println("==========================================================================================================================");
                            if(myOption == 1){
                                    boolean x = false;
                                    try{
                                        while(x = true){
                                                System.out.println("How many Brand you want to add: ");
                                                int option = scan.nextInt();
                                                    for (int i = 0; i < option; i++){       
                                                        System.out.println("What brand you want to add: ");
                                                        String bName = scan.next();
                                                        System.out.println("What Type of brand is these: ");
                                                        String bType = scan.next();
                                                        System.out.println("Where is these brand located: ");
                                                        String bLocation = scan.next();
                                                        System.out.println("Who is the owner of these brand: ");
                                                        String bOwner = scan.next();
                                                        Brand brand = new Brand(bName, bType, bLocation, bOwner);
                                                        brands.add(brand);
                                                        System.out.println("\n");
                                                        System.out.println(brand.Introduction());
                                                    }
                                                        System.out.println("Would you like to add more? ");
                                                        System.out.println("Type Yes/No");
                                                        String continueToYes = scan.next();
                                                            if (continueToYes.equals(yes)){
                                                            System.out.println("You continue to ADD");
                                                                System.out.println("\n");
                                                                x = true;
                                                            }else if(continueToYes.equals(no)){ 
                                                                System.out.println("You exited the Add menu");
                                                                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                                                                System.out.println("\n");
                                                                break;
                                                            }else{
                                                                throw new exceptionBrand("Please Type Yes or No only! ");
                                                            }
                                        }
                                    }catch(exceptionBrand e){
                                        System.out.println(e.getMessage());
                                    }finally{
                                        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                                        System.out.println("\n");
                                        continue Menu;
                                    }
                            }else if(myOption == 2){
                                    while (true){
                                        try{
                                            System.out.println("Removing Brand");
                                                    for (int i = 0; i < brands.size();i++) { 		      
                                                        System.out.print(i+" "+"Brand Name: "+brands.get(i).getBrandName()+"\t"); 		
                                                        System.out.print(" Brand Type: "+brands.get(i).getBrandType()+"\t");
                                                        System.out.print(" Brand Location: "+brands.get(i).getbrandLocation()+ "\t");
                                                        System.out.print(" Brand Owner: "+brands.get(i).getBrandOwner()+"\n");
                                                    }  
                                                        System.out.println("Would you like to DELETE? ");
                                                        System.out.println("Type Yes/No");
                                                        String continueToYes = scan.next();
                                                        if (continueToYes.equals(yes)){
                                                            System.out.println("Brand you like to delete: ");
                                                            String delete = scan.next();
                                                            if (brands.contains(delete)) {
                                                                System.out.println("Error! There is no Brand with that name! Please try again!");
                                                                break;
                                                            }
                                                            System.out.println("Are you sure you would like to delete this Branch named \""+delete+"\" .");
                                                            if(delete != ""){
                                                                System.out.println("To make sure you are not a ROBOT, Please input the index of the Brand Name");
                                                                int index = scan.nextInt();
                                                                brands.remove(index);
                                                                System.out.println(delete + " has been removed from the Brand List.");
                                                            }
                                                        }else if(continueToYes.equals(no)){ 
                                                            System.out.println("Exited in Remove Menu");
                                                            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                                            System.out.println("\n");
                                                            continue Menu;
                                                        }else{
                                                            throw new exceptionBrand("It should just be Yes or No");
                                                        }

                                        }catch(exceptionBrand e){
                                            System.out.println(e.getMessage());
                                        }finally{
                                            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                                            System.out.println("\n");
                                            continue Menu;
                                        } 
                                    }
                            }else if(myOption == 3){
                                    while (true){
                                        try{
                                            System.out.println("Displaying Brand");
                                            for (int i = 0; i < brands.size();i++) { 		      
                                                System.out.print(i+" "+"Brand Name: "+brands.get(i).getBrandName()+"\t"); 		
                                                System.out.print(" Brand Type: "+brands.get(i).getBrandType()+"\t");
                                                System.out.print(" Brand Location: "+brands.get(i).getbrandLocation()+ "\t");
                                                System.out.print(" Brand Owner: "+brands.get(i).getBrandOwner()+"\n");
                                            }
                                            System.out.println("Would you like to Display a Brand?");
                                            System.out.println("Type Yes/No");
                                            String continueToYes = scan.next();
                                                if (continueToYes.equals(yes)){
                                                        System.out.println("What exact index you want to show: ");
                                                        int index = scan.nextInt();
                                                        for(int i = 0; i <= index; i++) {   
                                                            System.out.print(index+" "+"Brand Name: "+brands.get(index).getBrandName()+"\t"); 		
                                                            System.out.print(" Brand Type: "+brands.get(index).getBrandType()+"\t");
                                                            System.out.print(" Brand Location: "+brands.get(index).getbrandLocation()+ "\t");
                                                            System.out.print(" Brand Owner: "+brands.get(index).getBrandOwner()+"\n");
                                                        
                                                            System.out.println("\n");
                                                            System.out.println("Would you like to change something in your brand: ");
                                                            System.out.println("Type Yes/No");
                                                            String continueToYes1 = scan.next();
                                                            if(continueToYes1.equals(yes)){
                                                                System.out.println("What would you like to change ");
                                                                System.out.println("1. Brand Type");
                                                                System.out.println("2. Brand Location");
                                                                System.out.println("3. Brand Owner");
                                                                System.out.println("Select Option");
                                                                int choice = scan.nextInt();
                                                                    if (choice == 1) {
                                                                            System.out.println("What would you like to change for the Brand Type?");
                                                                            String toChangeBrandType = scan.next();
                                                                            brands.get(index).changeBrandType(toChangeBrandType);
                                                                            System.out.println(brands.get(index).getBrandName() + " has changed to "+ brands.get(index).getBrandType());
                                                                    } else if(choice == 2){
                                                                            System.out.println("What is the new location of Brands Company?");
                                                                            String toChangeBrandLocation = scan.next();
                                                                            brands.get(index).changeBrandLocation(toChangeBrandLocation);
                                                                            System.out.println(brands.get(index).getBrandName() + " has changed to "+ brands.get(index).getbrandLocation());
                                                                    }else if(choice == 3){
                                                                        System.out.println("Who is the new owner?");
                                                                        String toChangeBrandOwner = scan.next();
                                                                        brands.get(index).changeBrandOwner(toChangeBrandOwner);
                                                                        System.out.println(brands.get(index).getBrandName() + " the New Owner of the brand is "+ brands.get(index).getBrandOwner());
                                                                    }else{
                                                                        throw new exceptionBrand("Not in the Option");
                                                                    }
                                                                    
                                                            }else if(continueToYes.equals(no)){ 
                                                                System.out.println("Exited in Display Menu");
                                                                System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
                                                                System.out.println("\n");
                                                                continue Menu;
                                                            }else{
                                                                throw new Exception("It should just be Yes or No");
                                                            }
                                                        }
                                                }
                                        }catch(Exception e){
                                            System.out.println(e.getMessage());
                                        }finally{
                                            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                                            System.out.println("\n");
                                            continue Menu;
                                        }
                                    }
                            }else if(myOption == 4){
                                    while (true){
                                        try{
                                            System.out.println("Are you sure you want to exit? ");
                                            System.out.println("Type Yes/No");
                                            String continueToYes = scan.next();
                                                if (continueToYes.equals(yes)){
                                                    System.out.println("Exited in the program");
                                                    System.out.println("\n");
                                                    System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[ Thank you and Come back again! ]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
                                                    System.exit(0);
                                                }else if(continueToYes.equals(no)){
                                                    System.out.println("You are in Brand Menu");
                                                    continue Menu;
                                                }else{
                                                    throw new Exception("It should just be Yes or No");
                                                }
                                        }catch(Exception e){
                                            System.out.println(e.getMessage());
                                        }finally{
                                            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                                            System.out.println("\n");
                                            continue Menu;
                                        }
                                    }
                    }
        }while (myOption != 1 || myOption != 2 || myOption != 3 || myOption != 4);
    }
}