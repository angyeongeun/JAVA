package Day04;
//배열 -> 한종류의 데이터타입이 우리가 지정한 크기만큼 모여있는 것을 배열이라고 한다.
//

import java.util.Scanner;
public class Ex04Array{
    public static void main(String[] args) {
        //배열 선언 방법 :

        //만약 크기가 5인 인트배열을 선언한다면?

        int[] array = new int[5];
        //각각의 int를 하나씩 호출하려면 위치번호(인덱스)를 주어야함!
        
        //System.out.println(array[0]);
        //배열의 각 인덱스번호의 있는 요소들은 우리가 따로 초기화를 안해줘도 기본형 데이터타입의 경우, 0으로 초기화됨
        
        //값을 넣을때,
        array[0] =5; 
        //System.out.println(array[0]);
        //index는 0부터 시작하기 때문에 마지막 인덱스는 index의 length-1 이다!

        for(int i =0; i<= 4; i++){
            System.out.println(array[i]);
        }
        //만약에 이러한 index가 가능한 범위를 넘어서면..->out of bounds error occurs!

        // Scanner scanner = new Scanner(System.in);
        // for(int i = 0; i < 5; i++) {
        //     System.out.print((i+1) + "번째 숫자 : ");
        //     array[i] = scanner.nextInt();
        // }

        for(int i = 0; i<5;i++){
            System.out.println("array["+i+"]" +array[i]);

        }
        String[] stringArray = new String[5];
        //클래스 배열의 경우 배열자체에도 초기화를 해주고, 위치에도 초깅화를 해줘야함
        
        for(int i =0; i<5; i++){
            System.out.println("-------------");
            System.out.println(stringArray[i]);
            stringArray[i] = new String();
            System.out.println(stringArray[i]);
            System.out.println("--------------");
            //null과 ""은 다른개념이다.

        }

        scanner.close();

    


        

        
    }
}