package Day06;
//배열메소드 불러와서 실행하기

//기본형 데이터 타입 -> 주소값 없음


import Day05.MyArray;
public class Ex01{
    public static void main(String[] args) {
        int[] arr =  {2,3,1,4,5,6};
        int element = 5; 
        int[] myArr = {1,2,3,4,5,6,7};

        System.out.println(arr.length);
        arr = MyArray.removeByIndex(arr, element); //return값이 arr이니까  덮어씌워 줘야함!
        System.out.println(arr.length);
        System.out.println(MyArray.indexOf(arr, 20));

        //ArrayList 클래스로부터 배열 메소드를 가져올 수 있음!


        
    }
}