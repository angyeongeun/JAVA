package Day02;
//else - if 구조

import java.util.Scanner;
public class Ex09{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("점수:");
        int score = scanner.nextInt();
        


        
        if(score > 0 && score < 100){
            if(score > 70 && score < 80){
                System.out.print("B");
            }
            else if(score > 60 && score < 70){
                System.out.print("C");
            }
            else if(score > 50 && score < 60){
                System.out.print("D");  
            } 
            else{ 
                System.out.print("F"); 
            } 

        }else{ 
             
            System.out.print("wrong num");

        }

    String.format("%01d", score);
            

    scanner.close();    
        
        
    }

}