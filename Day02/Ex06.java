package Day02;



import java.util.Scanner;
public class Ex06{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        System.out.print("num :");
        int num = scanner.nextInt();
        if(num % 2 == 1){
            System.out.print("홀");
        }else{
            System.out.print("짝");
        } 
        

    }
}