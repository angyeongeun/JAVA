package Util;
//배열에 필요한 메소드들을 구현해 놓은 클래스
//private이라고 되어 있을경우, 다른 클래스에서 사용하지 못할 수도 있다?



import java.util.Arrays;

import BoardProject.Board;
import BoardProject.Member;
import BoardProject.Reply;

public class MyArray{

    public static void main(String[] args) {

        int[] arr =  {2,3,1,4,5,6};
        int element = 5; 
        int[] myArr = {1,2,3,4,5,6,7};

        System.out.println(arr.length);
        arr = add(arr, element); //return값이 arr이니까  덮어씌워 줘야함!
        System.out.println(arr.length);
        System.out.println(indexOf(arr, 20));
        
        
    }


    // 같은 keyword를 가졌는지 확인해주는 메소드
    public static boolean contains(String[] array, String keyword) {
        for(int i = 0; i< array.length; i++){
            if(keyword.equals(array[i])){
                return true;
            }
        }
        return false;
        

        
    }
    //overloading int -> string
    public static boolean contains(int[] array, int keyword) {
        for(int i = 0; i< array.length; i++){
            if(keyword == (array[i])){
                return true;
            }
        }
        return false;
        

        
    }


    //원하는 요소의 위치를 알려주는 메소드
    public static int indexOf(String[] arr, String keyword){
        for(int i =0; i < arr.length; i++){
            if(keyword.equals(arr[i])){
                return i;
            }
        }
        return -1;

    }
    //overloading int -> string
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
    //overloading int -> string
    public static int lastIndexOf(String[] arr, String keyword){//static int ->  반환을 int로?
        for(int i =arr.length -1 ; i >= arr.length; i--){
            if(keyword ==(arr[i])){
                return i;
            }
        }
        return -1;

    }


    //배열의 크기를 구하는 메소드
    public static int arraySize(int[] arr, int keyword){
        return arr.length;
    }  
    //overloading int -> string
    public static int arraySize(String[] arr, String keyword){
        return arr.length;
    }
    

    //배열의 크기를 1 늘려주는 메소드
    public static int[] expand(int[] arr){
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
    //overloading int -> string
    public static String[] expand(String[] arr){
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
    public static int[] add(int[] arr, int element){
        int index = arr.length;
        ///{ }, 5 => {5}
        //넘어온 배열의 크기를  늘리고 늘어난 크기  - 1의 인덱스에 추가
        //넘어온 배열의 크기를 늘리고 늘어나기전 크기의 인덱스에 추가

        arr = expand(arr);
        arr[index] = element;
        //array.length ? 3


        return arr;


    }




    //overloading int -> string
    public static String[] add(String[] arr, String element){
        int index = arr.length;
        ///{ }, 5 => {5}
        //넘어온 배열의 크기를  늘리고 늘어난 크기  - 1의 인덱스에 추가
        //넘어온 배열의 크기를 늘리고 늘어나기전 크기의 인덱스에 추가

        arr = expand(arr);
        arr[index] = element;
        //array.length ? 3


        return arr;


    }


    



    //특정 숫자를 빼주는 메소드
    public static int[] remove(int[] arr, int element){
        //먼저 해당하는 번호를 찾아서 그번호 전후로 배열을 분리 
        //그리고 해당 번호를 빼고 그 앞 배열 뒷배열을 연결시킨다.
        // {1,2,3} -> {1},{3} -> {1,3}


        int index = indexOf(arr, element);

        // for(int i = 0; i < index; i++)
        // for(int i = index +1; i < arr.length; i+)

        if(index !=-1){
            int[] front = new int[index];
            for(int i =0; i< front.length; i++){
                front[i] = arr[i];
            }
            // back -> total - front -1
            int[] back = new int[arr.length - front.length -1];
            
            int backIndex =0;


            for(int i = index+1 ; i <  arr.length; i++){
            //그럼 우리가 back을 위한 위치를 따로 만들어서 0부터 1 씩 증가하면서 위치를 직접 지정해줘야함

                back[backIndex] =arr[i];
                backIndex++;

            }
            arr = new int[front.length + back.length];
            //for( int i =0; i<arr.length; i++){
                //만약 front의 길이가 3이고 back의 길이가 2면? -> i는 5번 반복


            //앞을 복사하는 for문 배열
            for(int i = 0; i < front.length; i++){
                arr[i] =front[i];

                }



            //back을 복사하는 for문 배열
            //backindex를 0으로 초기화

            backIndex = front.length;
            for(int i =0; i< back.length; i++){

                arr[backIndex] = back[i];
                backIndex++;
                
                


            }



            


        }
         

        return arr;
        

    }
    //overloading int -> string
    public static String[] remove(String[] arr, String element){
        //먼저 해당하는 번호를 찾아서 그번호 전후로 배열을 분리 
        //그리고 해당 번호를 빼고 그 앞 배열 뒷배열을 연결시킨다.
        // {1,2,3} -> {1},{3} -> {1,3}


        int index = indexOf(arr, element);

        // for(int i = 0; i < index; i++)
        // for(int i = index +1; i < arr.length; i+)

        if(index !=-1){
            String[] front = new String[index];
            for(int i =0; i< front.length; i++){
                front[i] = arr[i];
            }
            // back -> total - front -1
            String[] back = new String[arr.length - front.length -1];
            

            int backIndex =0;


            for(int i = index +1; i <  arr.length; i++){
                //그럼 우리가 back을 위한 위치를 따로 만들어서 0부터 1 씩 증가하면서 위치를 직접 지정해줘야함

                back[backIndex] =arr[i];
                backIndex++;

            }
            arr = new String[front.length + back.length];
            //for( int i =0; i<arr.length; i++){
                //만약 front의 길이가 3이고 back의 길이가 2면? -> i는 5번 반복


            //앞을 복사하는 for문 배열
            for(int i = 0; i < front.length; i++){
                arr[i] =front[i];

                }



            //back을 복사하는 for문 배열
            //backindex를 0으로 초기화

            backIndex = front.length;
            for(int i =0; i< back.length; i++){

                arr[backIndex] = back[i];
                backIndex++;
            
            }

        }
         

        return arr;

    }



    // index값으로 특정 숫자를 찾아서 빼주기
    public static int[] removeByIndex(int[] arr, int index){
        if (index >=0 && index <= arr.length -1){
            arr = remove(arr, arr[index]);
        }
        
        return arr;
    }
    //overloading int -> string
    public static String[] removeByIndex(String[] arr, int index){
        return(index >=0 && index <= arr.length -1)?
            remove(arr, arr[index]) : arr;
    
        
    }









//<------------------🖐🏼🖐🏼🖐🏼🖐🏼🖐🏼🖐🏼🖐🏼🖐🏼🖐🏼-------private method for specific work-----------------------------------------------------------------------------------------






        //우리가 만든 member을 자동으로 expand하는 메소드
    
        public static Member[] expand(Member[] arr){
            Member[] temp = new Member[arr.length];
            for(int i = 0; i < arr.length; i++){
                
                temp[i] = arr[i];
            }
    
            
            arr = new Member[temp.length +1];
            for(int i =0; i < temp.length; i++){
                arr[i] = temp[i];
            }
    
            return arr;
        }
    
        //우리가 만든 member을 자동으로 add하는 메소드
    
        public static Member[] add(Member[] arr, Member element){
            int index = arr.length;
            arr = expand(arr);
            arr[index] = element;
            return arr;
    
            
        }





        //우리가 만든 Reply을 자동으로 expand하는 메소드
    
        public static Reply[] expand(Reply[] arr){
                    Reply[] temp = new Reply[arr.length];
                    for(int i = 0; i < arr.length; i++){
                        
                        temp[i] = arr[i];
                    }
            
                    
                    arr = new Reply[temp.length +1];
                    for(int i =0; i < temp.length; i++){
                        arr[i] = temp[i];
                    }
            
                    return arr;
                }
            
        //우리가 만든 Reply을 자동으로 add하는 메소드
            
        public static Reply[] add(Reply[] arr, Reply element){
                    int index = arr.length;
                    arr = expand(arr);
                    arr[index] = element;
                    return arr;
            
                    
                }





        
        //우리가 만든 Board 자동으로 expand하는 메소드 🎈
    
        public static Board[] expand(Board[] arr){
        Board[] temp = new Board[arr.length];
        for(int i = 0; i < arr.length; i++){
            
            temp[i] = arr[i];
        }

        
        arr = new Board[temp.length +1];
        for(int i =0; i < temp.length; i++){
            arr[i] = temp[i];
        }

        return arr;
    }

        public static Board[] add(Board[] arr, Board element){
        int index = arr.length;
        arr = expand(arr);
        arr[index] = element;
        return arr;
        }
       

       
        // board의 index 구하는 메소드 (board, member, reply 모두..) 🎈
        public static int indexOf(Board[] arr, Board b){
            for(int i =0; i< arr.length; i++){
                if(b.id == arr[i].id){
                    return i;
                }
            }
            
            
            return -1;
        }

        public static int indexOf(Member[] arr, Member m){
            for(int i =0; i< arr.length; i++){
                if(m.id == arr[i].id){
                    return i;
                }
            }
            
            
            return -1;
        }

        public static int indexOf(Reply[] arr, Reply r){
            for(int i =0; i< arr.length; i++){
                if(r.id == arr[i].id){
                    return i;
                }
            }
            
            
            return -1;
        }



        




        //board, member, reply 에 대한 remove method🎈
            
  
        public static Board[] remove(Board[] arr, Board element){
                //먼저 해당하는 번호를 찾아서 그번호 전후로 배열을 분리 
                //그리고 해당 번호를 빼고 그 앞 배열 뒷배열을 연결시킨다.
                // {1,2,3} -> {1},{3} -> {1,3}
        
        
                int index = indexOf(arr, element);
        
                // for(int i = 0; i < index; i++)
                // for(int i = index +1; i < arr.length; i+)
        
                if(index !=-1){
                    Board[] front = new Board[index];
                    for(int i =0; i< front.length; i++){
                        front[i] = arr[i];
                    }
                    // back -> total - front -1
                    Board[] back = new Board[arr.length - front.length -1];
                    
        
                    int backIndex =0;
        
        
                    for(int i = index +1; i <  arr.length; i++){
                        //그럼 우리가 back을 위한 위치를 따로 만들어서 0부터 1 씩 증가하면서 위치를 직접 지정해줘야함
        
                        back[backIndex] =arr[i];
                        backIndex++;
        
                    }
                    arr = new Board[front.length + back.length];
                    //for( int i =0; i<arr.length; i++){
                        //만약 front의 길이가 3이고 back의 길이가 2면? -> i는 5번 반복
        
        
                    //앞을 복사하는 for문 배열
                    for(int i = 0; i < front.length; i++){
                        arr[i] =front[i];
        
                        }
        
        
        
                    //back을 복사하는 for문 배열
                    //backindex를 0으로 초기화
        
                    backIndex = front.length;
                    for(int i =0; i< back.length; i++){
        
                        arr[backIndex] = back[i];
                        backIndex++;
                        
                        
        
        
                    }
        
        
        
                    
        
        
                }
                 
        
                return arr;
        
            }
        
    
     
        public static Member[] remove(Member[] arr, Member element){
            //먼저 해당하는 번호를 찾아서 그번호 전후로 배열을 분리 
            //그리고 해당 번호를 빼고 그 앞 배열 뒷배열을 연결시킨다.
            // {1,2,3} -> {1},{3} -> {1,3}
    
    
            int index = indexOf(arr, element);
    
            // for(int i = 0; i < index; i++)
            // for(int i = index +1; i < arr.length; i+)
    
            if(index !=-1){
                Member[] front = new Member[index];
                for(int i =0; i< front.length; i++){
                    front[i] = arr[i];
                }
                // back -> total - front -1
                Member[] back = new Member[arr.length - front.length -1];
                
    
                int backIndex =0;
    
    
                for(int i = index +1; i <  arr.length; i++){
                    //그럼 우리가 back을 위한 위치를 따로 만들어서 0부터 1 씩 증가하면서 위치를 직접 지정해줘야함
    
                    back[backIndex] =arr[i];
                    backIndex++;
    
                }
                arr = new Member[front.length + back.length];
                //for( int i =0; i<arr.length; i++){
                    //만약 front의 길이가 3이고 back의 길이가 2면? -> i는 5번 반복
    
    
                //앞을 복사하는 for문 배열
                for(int i = 0; i < front.length; i++){
                    arr[i] =front[i];
    
                    }
    
    
    
                //back을 복사하는 for문 배열
                //backindex를 0으로 초기화
    
                backIndex = front.length;
                for(int i =0; i< back.length; i++){
    
                    arr[backIndex] = back[i];
                    backIndex++;
                    
                    
    
    
                }
    
    
    
                
    
    
            }
             
    
            return arr;
    
        }
    

      
        public static Reply[] remove(Reply[] arr, Reply element){
        //먼저 해당하는 번호를 찾아서 그번호 전후로 배열을 분리 
        //그리고 해당 번호를 빼고 그 앞 배열 뒷배열을 연결시킨다.
        // {1,2,3} -> {1},{3} -> {1,3}


        int index = indexOf(arr, element);

        // for(int i = 0; i < index; i++)
        // for(int i = index +1; i < arr.length; i+)

        if(index !=-1){
            Reply[] front = new Reply[index];
            for(int i =0; i< front.length; i++){
                front[i] = arr[i];
            }
            // back -> total - front -1
            Reply[] back = new Reply[arr.length - front.length -1];
            

            int backIndex =0;


            for(int i = index +1; i <  arr.length; i++){
                //그럼 우리가 back을 위한 위치를 따로 만들어서 0부터 1 씩 증가하면서 위치를 직접 지정해줘야함

                back[backIndex] =arr[i];
                backIndex++;

            }
            arr = new Reply[front.length + back.length];
            //for( int i =0; i<arr.length; i++){
                //만약 front의 길이가 3이고 back의 길이가 2면? -> i는 5번 반복


            //앞을 복사하는 for문 배열
            for(int i = 0; i < front.length; i++){
                arr[i] =front[i];

                }



            //back을 복사하는 for문 배열
            //backindex를 0으로 초기화

            backIndex = front.length;
            for(int i =0; i< back.length; i++){

                arr[backIndex] = back[i];
                backIndex++;
                
                


            }



            


        }
         

        return arr;

    }
}
