package Day05;

import java.util.Scanner;

public class Ex01{

    public static void main(String[] args) {
        int[][] nestedArray = new int[2][];
        int[] array01 = new int[3];
        int[] array02 = new int[4];
        nestedArray[0] =array01;
        nestedArray[1] = array02;
        //System.out.println(nestedArray[1]);

        //학생 5명의 국영수 점수를 관리하는 2차원배열 + 이름을 가지는 스트링 배열

        String[] nameArray = new String[5] ;
        int[][] scoreArray = new int[5][3];
        // nameArray[0] 학생
        // scoreArray[0][0] 국어 ...

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < nameArray.length; i++){
            System.out.println("-----" + (i+1)+ "번 학생 -----");
            System.out.print("name :");
            String name = scanner.nextLine();
            
                System.out.print(name + "korean :");
                scoreArray[i][0] =scanner.nextInt();
                System.out.print(name + "english :");
                scoreArray[i][1] =scanner.nextInt();
                System.out.print(name + "math :");
                scoreArray[i][2] =scanner.nextInt();

                nameArray[i] =name;
                scanner.nextLine();
            




          
            
        }
        
                    

        for(int i = 0; i< scoreArray.length; i++){
            int total = scoreArray[i][0] +scoreArray[i][1] + scoreArray[i][2];
            double average = total /3.0;
            System.out.println("--"+ nameArray[i] +"--");
            System.out.println("korean\tenglish\tmath\ttotal\taverage\t");
            for(int j = 0; j < scoreArray[i].length; j++){
                System.out.print(scoreArray[i][j] + "\t" );

            }
            for(int k = 0; k < scoreArray[i].length; k++){
                System.out.print(total+ "\t" + average + "\t");

            }
            System.out.println();
            System.out.println("=========================================");
            

        }
        scanner.close();

        
    }

    // private void printSumAndAverage(int[] scoreArray){
                    

        
    //         for(int i = 0; i < scoreArray.length; i++){
    //             int total = scoreArray[i][j] +scoreArray[i][j] + scoreArray[i][j];
    //             double average = total /3.0;
    //             System.out.print(scoreArray[i][j] + "\t" );

    //         }
    //         System.out.print(total+ "\t" + average + "\t");
    //         System.out.println();
    //         System.out.println("=========================================");
            

        
        

        

    // }




}