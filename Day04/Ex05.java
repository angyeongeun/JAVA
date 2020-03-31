package Day04;
//array practice


import java.util.Scanner;

public class Ex05{
    private static final int SIZE =5;
    private static final String EMPTY_STRING ="";



    // "" -> 주인이 아님
    //null -> 건물이 없음 ^^


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[SIZE];
        //array가 class배열이므로 초기화를 해주자
        //초기화도 메소드를 시켜서 코드를 분리!
        EMPTY_STRING.equals("abc");
        init(array);
        printAll(array);
        for(int i = 0; i < array.length; i++){
            System.out.print("write string : ");
            String userString = scanner.nextLine();
    
    
            add(array, userString);
        }

        printAll(array);// pritnall 

        System.out.println(indexOf(array, "abc"));
        remove(array, "abc");
        System.out.println(indexOf(array, "abc"));






        scanner.close();
    
    }



    private static void init(String[] array){
        for(int i= 0; i< array.length; i++){
            //array.length는 해당배열의 크기를 리턴해준다.
           array[i] = new String();

        }
    }

    

    private static void add(String[] array, String input){
        int index = indexOf(array, EMPTY_STRING);
        for(int i = 0; i< array.length; i++){

        if(index != -1) {
                

                array[index] = input; 
          
        }else{
                System.out.print("no empty space!(빈공간이 없음)");

            }
        }


    }




    //스트링 파라미터를 이용해서 해당 스트링이 존재하면 그 칸에 new string을 호출하는 방식으로 해당 스트링을 제거하는 메소드 
    private static void remove(String[] array, String keyword){
        for(int i = 0; i< array.length; i++){
            if(array[i].equals(keyword)){

                array[i] = new String();

            }else{
                System.out.print("empty space");

            }
        }

    }



    // private static boolean contains(String[] array, String keyword){
    //     //q배열을 돌며 빈공간 -> keyword 이 있으면 true, 없으면 false
    //     for(int i =0; i< array.length; i++){
    //         if(array[i].equals(keyword)){
    //             return true;
    //         }
    //     }return false;
    // }





    private static int indexOf(String[] array, String input){
        for(int i = 0; i< array.length; i++){
            if(array[i].equals(input)){
                return i;
            }
        }
        return -1;
    }




    private static void printAll(String[] array){
        for(int i = 0; i< array.length; i++){
            System.out.println(array[i]);

        }
    }



    
}