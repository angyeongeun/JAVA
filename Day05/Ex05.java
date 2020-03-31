package Day05;
//배열에 필요한 메소드들을 구현해 놓은 클래스


import java.util.Scanner;
public class Ex05{



    public static boolean contains(String[] array, String keyword) {
        for(int i = 0; i< array.length; i++){
            if(keyword.equals(array[i])){
                return true;
            }
        }
        return false;
        

        
    }
    //오버로딩을 이용한 인트배열의 contains 메소드 구현 
    
    public static boolean contains(int[] array, int keyword) {
        for(int i = 0; i< array.length; i++){
            if(keyword == (array[i])){
                return true;
            }
        }
        return false;
        

        
    }

    //원하는 요소의 위치를 알려주는 메소드
    //indexOf

    public static int indexOf(String[] arr, String keyword){
        for(int i =0; i < arr.length; i++){
            if(keyword.equals(arr[i])){
                return i;
            }
        }
        return -1;

    }

    public static int indexOf(int[] arr, int keyword){
        for(int i =0; i < arr.length; i++){
            if(keyword ==(arr[i])){
                return i;
            }
        }
        return -1;

    }

    //위의 메소드들을 보고 가장 마지막에 나오는 요소들의 번호를 리턴하는 메소드


    public static int lastIndexOf(int[] arr, int keyword){
        for(int i =arr.length -1 ; i >= arr.length; i--){
            if(keyword ==(arr[i])){
                return i;
            }
        }
        return -1;

    }

    //배열의 크기를 구하는 메소드

    public static int arraySize(String[] arr, String keyword){
        return arr.length;
    }

    public static int arraySize(int[] arr, int keyword){
        return arr.length;
    }
    //배열의 크기를 1 늘려주는 메소드
    private static int[] expand(int[] arr){
        //먼저 기존의 배열의 값들을 복사해오자

        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            
            temp[i] =arr[i];
        }
        arr = new int[temp.length +1];
        for(int i =0; i < temp.length; i++){
            arr[i] = temp[i];
        }

        return arr;

    }

    private static String[] expand(String[] arr){
        //먼저 기존의 배열의 값들을 복사해오자

        String[] temp = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            
            temp[i] = arr[i];
        }
        arr = new String[temp.length +1];
        for(int i =0; i < temp.length; i++){
            arr[i] = temp[i];
        }

        return arr;

    }

    //배열에 추가해주는 메소드
    private static int[] add(int[] arr, int element){
        int index = arr.length;
        ///{ }, 5 => {5}
        //넘어온 배열의 크기를  늘리고 늘어난 크기  - 1의 인덱스에 추가
        //넘어온 배열의 크기를 늘리고 늘어나기전 크기의 인덱스에 추가

        arr = expand(arr);
        arr[index] = element;
        //array.length ? 3


        return arr;


    }
    private static String[] add(String[] arr, String element){
        int index = arr.length;
        ///{ }, 5 => {5}
        //넘어온 배열의 크기를  늘리고 늘어난 크기  - 1의 인덱스에 추가
        //넘어온 배열의 크기를 늘리고 늘어나기전 크기의 인덱스에 추가

        arr = expand(arr);
        arr[index] = element;
        //array.length ? 3


        return arr;


    }

    

    //삭제를 해봅시다. -> 삭제하면 크기가 줄어듦
    private static int[] remove(int[] arr, int element){
        //먼저 해당하는 번호를 찾아서 그번호 전후로 배열을 분리 
        //그리고 해당 번호를 빼고 그 앞 배열 뒷배열을 연결시킨다.
        // {1,2,3} -> {1},{3} -> {1,3}


        int index = indexOf(arr, element);

        // for(int i = 0; i < index; i++)
        // for(int i = index +1; i < arr.length; i+)

        if(index !=-1){
            int[] front = new int[index];
            int[] back = new int[arr.length - front.length -1];
            // back -> total - front -1

        }
         

        return arr;

    }





    












    //오버로딩을 이용한 인트배열의 contains 메소드 구현 
    //




}
