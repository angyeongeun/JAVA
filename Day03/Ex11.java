package Day03;






import java.util.Scanner;
public class Ex11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("score : ");
        int score = scanner.nextInt();


        while(score < 0 || score > 100){
            System.out.println("Hey! you got the worng score!");
            System.out.print("Try again  :");
            score = scanner.nextInt();


        }

        if(90 < score && score < 100 ){
            System.out.print("A");
        }
        else if(80 < score && score < 90 ){
            System.out.print("B");
        }
        else{
            System.out.print("F");
        }



            
        }

    



        
}
