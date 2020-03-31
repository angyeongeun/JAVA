package Day05;
//1. 차량 소유주를 가지고 있는 스트링 배열 1개
//2. 소유주의 차량이 뭔지 가지고 있는 스트링 1개
//3. 연식과 가격을 가지고 있는 인트 2차원 배열 1개
//값을 입력하는것까지, 5명의 정보망 - 배열 크기는 5

// 출력값 => 이름 차량 연식 가격



import java.util.Scanner;

import Util.MyScanner; 
public class Ex03{
    private final static int SIZE =5;
    private final static int INT_COLUMNS =2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nameArray = new String[SIZE];
        String[] carName = new String[SIZE];
        int[][] info = new int[SIZE][INT_COLUMNS];

        //메소드 만들어 바로 쓰기
        insert( nameArray, carName, info);
        print(nameArray, carName, info);





            
     
        
    }


    //입력하는 메소드

    private static void insert(String[] nameArray,
    String[] carName, int[][] info) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < nameArray.length; i++){
           System.out.println("-----"+ (i+1) +"번 고객 -----");


           System.out.print(" owner :");
           nameArray[i] = scanner.nextLine();


           System.out.print(" carName :");
           carName[i] = scanner.nextLine();

      
           System.out.print(" price :");
           info[i][0] = MyScanner.nextInt(scanner);
      

           System.out.print(" Used :");
           info[i][1] = MyScanner.nextInt(scanner);

        }
        
        
        scanner.close();

}



    //출력하는 메소드

    private static void print(String[] nameArray,
    String[] carName, int[][] info) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0;  i < nameArray.length; i++){
            System.out.printf("%s %s %d %d \n", nameArray[i],carName[i], info[i][0], info[i][1] );
        }

        scanner.close();


    }






}




    // //입력하는 메소드
    // //자바에서는 필요한 객체를 즉석에서 만들어서 거기서 쓰면 끝


    // //출력하는 메소드



    // //우리가 파라미터로 기본현 데이터 타입을 주거나 혹은 참조형 데이터타입을 주게되면 어떤일이 벌어질까?
    
    // //기본형 혹은 뭔가 값을 가지는 친구들(스트링 , 포장클래스)
    // //파라미터를 보내도 이친구들은굳이 주소값을 보내주는게 아니라 값자체를 보내서 컨트롤

    // public static void add(int a){
    //     a =a + 10;
    // }
    // public static void add(String str){
    //     str+= "aaaa";
    // }

    // //근데 그 자체가 값을 안가지는 경우가 2개 있다.
    // //바로 배열과 Collections라는 모음 클래스들!
    // //요둘은 call by reference가 일어난다!

    // public static void add(String[] arr){
    //     arr[0] = "a";
    //     arr[1] = "b";
    //     arr[2] = "c";


    // }



