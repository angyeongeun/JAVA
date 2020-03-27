package Day03;


import java.util.Scanner;
public class Ex05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("first num : ");
        int num1 = scanner.nextInt();

        System.out.print("second num : ");
        int num2 = scanner.nextInt();

        int result = 0;

        if(num1> num2){
            int temp = num1;
            num1 =num2;
            num2 =temp;
        }

        for(int i= num1; i >= num2; i++){
            result += i;
            
        }
        System.out.print(result);





        scanner.close();

        
    }
}