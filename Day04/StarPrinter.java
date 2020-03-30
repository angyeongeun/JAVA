package Day04;

public class StarPrinter{
    //접근제한자 사용
    public void selectNumber(int choice, int lineNumber){
        //외부에서는 얘만 출력하고 내부에서 private로 되어있는 메소드를 호출

        switch(choice){
            case 1: 
            StarPrinter1(lineNumber);
            break;

            case 2:
            StarPrinter2(lineNumber);
            break;
            
            case 3:
            StarPrinter3(lineNumber);
            break;
            
            case 4:
            StarPrinter4(lineNumber);
            break;
            
            case 5:
            StarPrinter5(lineNumber);
            break;

            case 6:
            StarPrinter6(lineNumber);
            break;

            case 7:
            StarPrinter7(lineNumber);
            break;
            
            case 8:
            StarPrinter8(lineNumber);
            break;
            
            case 9:
            StarPrinter9(lineNumber);
            break;
            
            case 10:
            StarPrinter10(lineNumber);
            break;


        }
    }


    private void StarPrinter1(int lineNumber){


        for(int i =1; i<= lineNumber; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("*");

            }
            System.out.println();

        }
        //별찍기 1번 코드
        

    }

    private void StarPrinter2(int lineNumber){



        for(int i =1; i<= lineNumber; i++) {
            String stars = "";
            for(int j = i; j <= lineNumber; j++){
                stars += "*";

            }
            System.out.println(stars);
        }
    }

    private void StarPrinter3(int lineNumber){

        for(int i =1; i<= lineNumber; i++){
            String stars = "";
            for(int j = 1; j  <= lineNumber - i; j++){
                stars += " ";
            }
            for(int j = 1  ; j <= i; j++){
                stars += "*";

            }
            System.out.println(stars);
            
            }
    }


    private void StarPrinter4(int lineNumber){

        for(int i =1; i<= lineNumber; i++){
            String stars = "";
            for(int j = 1; j  <= i - 1; j++){
                stars += " ";
            }
            for(int j = i; j <= lineNumber; j++){
                stars += "*";

            }
            System.out.println(stars);
            }


    }

    
    private void StarPrinter5(int lineNumber){


        for(int i =1; i<= lineNumber; i++){
            String stars = "";
            for(int j = 1; j <= lineNumber -i; j++){
                stars += " ";

            }
            for(int j = 1; j <= 2 * i -1; j++){
                stars += "*";

            }
        System.out.println(stars);
        }
    }
    private void StarPrinter6(int lineNumber){


        for(int i =1; i<= lineNumber; i++){
            String stars = "";
            for(int j = 1; j <= i -1 ; j++){
                stars += " ";
            }
            for(int j = 1; j <= 2 * lineNumber - (2 * i -1); j++){
                stars += "*";

            }
            System.out.println(stars);
        }    



    }


    private void StarPrinter7(int lineNumber){


        for(int i =1; i<= lineNumber; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =1; i<= lineNumber; i++) {
            String stars = "";
            for(int j = i; j <= lineNumber-1; j++){
                stars += "*";

            }
            System.out.println(stars);
        }



    }

    
    private void StarPrinter8(int lineNumber){


        for(int i =1; i<= lineNumber; i++){
            String stars = "";
            for(int j = 1; j  <= lineNumber - i; j++){
                stars += " ";
            }
            for(int j = 1  ; j <= i; j++){
                stars += "*";

            }
            System.out.println(stars);
            
            }
        for(int i =1; i<= lineNumber; i++){
                String stars = "";
                for(int j = 0; j  <= i - 1; j++){
                    stars += " ";
                }
                for(int j = i; j <= lineNumber-1; j++){
                    stars += "*";
    
                }
                System.out.println(stars);
                }


    }
    
    private void StarPrinter9(int lineNumber){


        for(int i =1; i<= lineNumber; i++){
            String stars = "";
            for(int j = 1; j <= lineNumber -i; j++){
                stars += " ";

            }
            for(int j = 1; j <= 2 * i -1; j++){
                stars += "*";

            }
        System.out.println(stars);
        }
        for(int i =1; i<= lineNumber; i++){
            String stars = "";
            for(int j = 0; j <= i -1 ; j++){
                stars += " ";
            }
            for(int j = 1; j <= 2 * lineNumber - (2 * i -1)-2; j++){
                stars += "*";

            }
            System.out.println(stars);
        }



    }

    
    private void StarPrinter10(int lineNumber){


        for(int i =1; i<= lineNumber; i++) {
            String stars = "";
            for(int j = i; j <= lineNumber ; j++){
                stars += "*";

            }
            for(int j = 0; j <= 2*i -3 ; j++){
                stars += " ";
            }
            for(int j = i; j <= lineNumber; j++){
                stars += "*";

            }

            System.out.println(stars);
        }
        for(int i =2; i<= lineNumber; i++) {
            String stars = "";
            for(int j = 1; j <= i; j++){
                System.out.print("*");

            }


        
        for(int j = 1; j  <= lineNumber + 3 - 2*(i-1); j++){
            stars += " ";
        }
        for(int j = 1  ; j <= i; j++){
            stars += "*";

        }
        
        System.out.println(stars);
    }



    }

    







}