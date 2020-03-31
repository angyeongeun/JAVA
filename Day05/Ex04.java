package Day05;

import java.util.Scanner;

public class Ex04{

    //call by value(값호출) -> 원본에 손을 안대기 때문에 쉽다. vs
    // call by reference(참조 호출) ->주소값을 가지고 있는 참조형 데이터 중에서도 특별하게 배열, collections가 콜바이 레퍼런스가 가능하다.
    // 이친구들은 스택 영역에 힙메모리로 향하는 주소값을 가지고 있고
    // 힙 메모리 안에는? 
    //다시 힙 영역안의 다른곳으로 향하는 메모리 주소값을 가지고 있기 때문에 콜바이 레퍼런스가 일어나게 된다.
    //이 주소값에 의한 참조의 경우

    
    //
    public static void main(String[] args) {
        //만약에 우리가 자리가 없으면 자동으로 자리가 늘어나는 배열이 필요하다면 -> 메소드를 만들어야함
        
        //배열의 크기를 늘리려면...

        int[] arr = new int[3];

        arr[0] =100;
        System.out.println(arr[0]);

        
        arr = new int[4];
        System.out.println(arr[0]);

        //배열을 늘리는 방법 => 기존의 데이터를 임시보관할 곳에 복사하고 -> 늘리고 -> 임시보관한 데이터에서 다시 데이터를 복사해와야함

        System.out.println(arr.length);

        arr[0] = 150;
        arr= expand(arr);
        System.out.println(arr.length);




 
        
    }
    //배열의 크기를 늘려주는 메소드

    public static int[] expand(int[] array) {//임시로 보관하는 변수들은 temp라는 단어를 넣어줌
        
        int[] temp = new int[array.length];
        for(int i =0; i< array.length; i++){
            temp[i] =array[i];
        }
        array = new int[array.length +1];
        for(int i =0; i < temp.length; i++){
            temp[i] =array[i];

        }

        return array;
        //크기가 늘어난 배열을 보내서 원본에 덮어씀



}



}
