package Day05;
//SAT 3번 보고 가장 잘 나온 점수를 뽑아서 보여주는 프로그램 작성
//과목 -> 수학, 읽기, 쓰기

import java.util.Scanner;
public class Ex02_SAT{

    public static void main(String[] args) {

        // String[] part = new String[3] ; //string을 자동적으로 메소드를 이용해서 넣기?
        int[][] scoreArray = new int[3][3];





        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < scoreArray.length; i++){
            System.out.println("----- SAT"+ (i+1)+" -----"); // score[i -> 과목 번호][점수]
            System.out.print(" math part :");
            scoreArray[i][0] = scanner.nextInt();
            System.out.print(" reading part :");
            scoreArray[i][1] = scanner.nextInt();
            System.out.print(" writing part :");
            scoreArray[i][2] = scanner.nextInt();

                        


 
        
        }
        int[] maxScores = calculateMax(scoreArray);
        System.out.println("====== Max score =====");
        System.out.println(" math part " + maxScores[0]);
        System.out.println(" math part " + maxScores[1]);
        System.out.println(" math part " + maxScores[2]);



        scanner.close();






    }

    private static int[] calculateMax(int[][] scoreArray){
        int[] maxScores = new int[3];
        int mathMax = 0;
        int readingMax = 0;
        int writingMax = 0;

        for(int  i = 0; i< scoreArray.length; i++){
            //삼항연산자 => 우리가 어딘가에 값을 정할때 사용된다. 오직값을 결정할때만 쓰임 -> 조건문과 다름
            mathMax = mathMax < scoreArray[i][0] ? scoreArray[i][0] : mathMax;
            readingMax = readingMax < scoreArray[i][1] ? scoreArray[i][1] : readingMax;
            writingMax = writingMax < scoreArray[i][2] ? scoreArray[i][2] : writingMax;

    
        }
        //값복사 vs 주소값 복사
        //call by value vs call by reference
        maxScores[0] = mathMax;
        maxScores[1] = readingMax;
        maxScores[2] = writingMax;

        return maxScores;

    
    
    }

    
}