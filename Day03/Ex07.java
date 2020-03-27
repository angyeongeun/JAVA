package Day03;
//다중 for loop





import java.util.Scanner;
public class Ex07{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("num :");
        int num1 = scanner.nextInt();


        for(int i = num1; i<=5; i++){
            for(int j =101; j<=105; j++){
                System.out.println("i : "+ i);
                System.out.print(" j : "+ j);
            }
        }



        
    }
}