package Day03;


import java.util.Scanner;
public class Ex13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("-----------------------------");
            System.out.println("|bit score management system|");
            System.out.println("-----------------------------");
            System.out.println(" 1. input 2. print 3. fin");
            System.out.println("> ");
            int choice = scanner.nextInt();
            if(choice ==1){

            }else if(choice ==2){

            }else if(choice ==3){
                System.out.println("thank you for using!");
                break;
            }else {
                System.out.println("Wrong");
            }

        }
        
        
        scanner.close();
        
    }
}