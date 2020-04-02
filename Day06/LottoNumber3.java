package Day06;
//로또 추첨기
//1~45까지 랜덤한 숫자를 크기가 6인 배열에 담는다.
//1000개 단위로 몇 게임인지 변환 -> 그횟수만큼 배열을 만들어서 통쨰로 보여준다




import java.util.Scanner;
import Day05.MyArray;
import java.util.Random;
public class LottoNumber3{

    private static final int MAX = 45;
    private static final int SIZE = 6;
    private static final int PRICE = 1000;

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        Random random = new Random();

        System.out.println("----- lotto 판매기 -----");
        System.out.print("얼마 출력? :");
        int money = scanner.nextInt();
        //투입한 금액을 1000원 단위로 나눠서 총 몇게임인지 int game에 저장
        //로또 당첨금 3배로 늘리고 번호와 한게임당 금액을 늘리겠다.

        int game = money/PRICE;
        int[][] totalGames = new int[game][];


        

        for(int i = 0; i< totalGames.length; i++){
            totalGames[i] =new int[0];
            while(totalGames[i].length < SIZE){
                int randomNumber = random.nextInt(MAX) +1;
                if(MyArray.contains(totalGames[i], randomNumber)){
                    totalGames[i] = MyArray.add(totalGames[i], randomNumber);

                }
            }

        }

        for(int i = 0; i< totalGames.length -1; i++){
            for(int j = 0; j < totalGames[i].length -1; j++){
                if(totalGames[i][j] > totalGames[i][j+1]){
                int temp = totalGames[i][j];
                totalGames[i][j] =totalGames[i][j+1];
                totalGames[i][j+1] =temp;
                i =-1;

                }
        }
    }

        int gameNumber = 1;
        for(int[] arr : totalGames){
            System.out.println("====="+ gameNumber + "번 게임====");
            for(int i : arr){

                System.out.printf("%3d\t", i);
                
            
        }
        System.out.println("\n==================================");
        gameNumber++;


        }


        scanner.close();

    }



}



    



