package CoronaProject;


import java.util.Scanner;

import Day05.MyArray;
import Util.MyScanner;
import jdk.jshell.execution.Util;



public class CoronaEx{
    public static void main(String[] args) {

        String NATION_NAME ="korea";
        //public static  final String nation_name = "한국";


        Scanner scanner = new Scanner(System.in);
        Nation[]world = null;
        City[] cities = null;

        while(true){
            //메뉴를 출력한다
            //1. 세계현황 보기
            //2. 한국 현황보기
            //3. 종료

            System.out.println("---------CORONA-19------------");
            System.out.println("1. 세계 2. 한국 3. 종료");
            System.out.print(">");
            int choice = MyScanner.nextInt(scanner);
            if( choice ==1){
                if(choice ==1){
                    //null인지 체크한다.
                    if(world == null){
                        world = NationUtil.start(scanner);


                    }else {
                        System.out.println("1. 전체 다시입력 2. 개별 수정");
                        choice = MyScanner.nextInt(scanner);
                        if(choice ==1){
                            world = NationUtil.start(scanner);
                        }else {
                            //이때는 현재 상태 전체를 출력하고 수정할 나라의 번호를 선택하게 한다.
                            

                            NationUtil.print(world);
                            System.out.println("수정할 번호를 입력하세요 : ");
                            int index = validateIndex(scanner, world.length);
                            world = NationUtil.update(world, index, scanner);
                            

                           
                                
                            

                            //현재 상태 전체를 출력하고
                            //수정할 나라의 번호를 선택하게 한다.
                        }
                    }
                }else if(choice == 2){
                    //출력하는 메소드를 실행하되, world가 null인지 체크해서 널이 아닐때만 실행한다.

                    if(world != null){



                        NationUtil.print(world);
                    }else{ // world = null 이면 -> 즉 아무 입력값이 없다는 뜻이므로...
                        //경고메세지만 출력!
                        System.out.println("There's no info");
                    }
                }


        


            }else if (choice ==2){
                // // 한국 현황 보여주는 메소드 실행
                // System.out.println("1. 입력 2. 출력 3. 뒤로");
                // System.out.print(">");

                choice = showMenu(scanner);
                switch(choice){
                    case 1:
                    cities = cityUtil.addData(scanner, cities);
                    break;
                    case 2:
                    cityUtil.print(cities);
                    break;
                    case 3:
                    break;
                }



            }else if(choice ==3){
                // 종료하기
                System.out.println("----🖐🏼 Thank you for using!-----");
                break;

            }
            



        }
    

        scanner.close();
        
    }




    private static int validateIndex(Scanner scanner , int length){
    
        int index = MyScanner.nextInt(scanner) -1;

        while(index < 0 || index >= length){
            System.out.println("wrong number");
            System.out.print("수정할 번호를 입력하세요 : ");
            index = MyScanner.nextInt(scanner) -1 ;
            
        }

        return index;
            
        
    }

    public static int showMenu( Scanner scanner){
        int choice = 0;

        System.out.println("1. 입력 2. 출력 3. 뒤로");
        System.out.print(">");
        choice = MyScanner.nextInt(scanner);


        return choice;
    }

}