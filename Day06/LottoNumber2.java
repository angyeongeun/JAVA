package Day06;
//로또 추첨기
//1~45까지 랜덤한 숫자를 크기가 6인 배열에 담는다.


import Day05.MyArray;
import java.util.Arrays;
import java.util.Random;
public class LottoNumber2{

    private static final int MAX = 45;
    private static final int SIZE = 6;
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoArray = new int[SIZE];

    //중복제거를 위한 while문
    while(lottoArray.length < SIZE){
            int randomNumber = random.nextInt(MAX) +1;
            if(!MyArray.contains(lottoArray, randomNumber)){
                lottoArray =MyArray.add(lottoArray,randomNumber);
            }
        }


    for(int i = 0; i< lottoArray.length -1; i++){
        if(lottoArray[i] > lottoArray[i+1]){
            int temp = lottoArray[i];
            lottoArray[i] =lottoArray[i+1];
            lottoArray[i+1] =temp;
            i =-1;
        }
    }
    System.out.println("---중복제거후---");
    for(int i : lottoArray){
        System.out.println(i);
        }


    









    }




}
