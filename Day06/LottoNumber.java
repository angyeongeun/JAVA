package Day06;
//로또 추첨기
//1~45까지 랜덤한 숫자를 크기가 6인 배열에 담는다.


import Day05.MyArray;
import java.util.Arrays;
import java.util.Random;
public class LottoNumber{
    private static final int MAX = 45;
    private static final int SIZE = 6;
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoArray = new int[SIZE];
      
    
    
        for(int i = 0; i < lottoArray.length; i++){
            int computerNumber = random.nextInt(MAX)+1 ;
            lottoArray[i] = computerNumber;

        }


        
        for(int i : lottoArray){
            System.out.println(i);
        }

        //-- forEach문의 제약 -> 
        //1. 데이터를 바꾸더라도 원본은 바뀌지 않는다. 값만 복사해서 보여주는 용도
        //2. 원본이 나온 collection의 갯수가 바뀌면 안된다.



        System.out.println("--------Lotto Number-------");
        System.out.println(Arrays.toString(lottoArray));


        //지금까지 만든 lottoArray는 중복값이 나올 수 있음!
    // for(int i = 0; i < lottoArray.length; i++){
    //     //lottoArray[i]는 기준점이 된다.
    //     for(int j = 0; j< lottoArray.length; j++){
           
    //         //lottoArray[j]는 중복인지 검사할 값이 됨
    //         //if문을 만들어서 위치가 다르지만 값이 같다를 조건으로..
    //         if(lottoArray[i] == lottoArray[j] && i != j){
    //             System.out.println(i+1+ " and " + (j+1) +" 중복");
    //             lottoArray[i]  = random.nextInt(MAX)+1 ;
    //             j = -1;


                
    //         }

    //     }
    // }
        //중복제거를 위한 while문
        while(lottoArray.length < SIZE){
            int randomNumber = random.nextInt(MAX) +1;
            if(!MyArray.contains(lottoArray, randomNumber)){
                System.out.println( lottoArray + " and " + randomNumber +" 중복");
                lottoArray =MyArray.add(lottoArray, randomNumber);
            }
        }
         System.out.println("---중복제거후---");
         

        for(int i : lottoArray){
            System.out.println(i);
            }


    // for(int i = 0; i< lottoArray.length -1; i++){
    //     if(lottoArray[i] > lottoArray[i+1]){
    //         int temp = lottoArray[i];
    //         lottoArray[i] =lottoArray[i+1];
    //         LottoNumber
    //     }
    // }









    }




}