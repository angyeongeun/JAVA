package Day03;
//별찍기

import java.util.Scanner;
public class Ex08{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("줄 수 :");
        int num = scanner.nextInt();
        

        //별찍기 1번
        //*
        //**
        //***
        //****
        //***** 


        System.out.println("--1번--");

        for(int height =1; height<= num; height++) {
            for(int width = 1; width <= height; width++){
                System.out.print("*");

            }
            System.out.println();

        }

        System.out.println("--2번--");

        for(int height =1; height<= num; height++) {
            String stars = "";
            for(int width = height; width <= num; width++){
                stars += "*";

            }
            System.out.println(stars);
        }

        System.out.println("--3번--");

        for(int height =1; height<= num; height++){
            String stars = "";
            for(int width = 1; width  <= num - height; width++){
                stars += " ";
            }
            for(int width = 1  ; width <= height; width++){
                stars += "*";

            }
            System.out.println(stars);
            
            }
        
        
        System.out.println("--4번--");
        for(int height =1; height<= num; height++){
            String stars = "";
            for(int width = 1; width  <= height - 1; width++){
                stars += " ";
            }
            for(int width = height; width <= num; width++){
                stars += "*";

            }
            System.out.println(stars);
            }
        
        System.out.println("--5번--");
        for(int height =1; height<= num; height++){
            String stars = "";
            for(int width = 1; width <= num -height; width++){
                stars += " ";

            }
            for(int width = 1; width <= 2 * height -1; width++){
                stars += "*";

            }
        System.out.println(stars);
        }




        System.out.println("--6번--");
        for(int height =1; height<= num; height++){
            String stars = "";
            for(int width = 1; width <= height -1 ; width++){
                stars += " ";
            }
            for(int width = 1; width <= 2 * num - (2 * height -1); width++){
                stars += "*";

            }
            System.out.println(stars);
        }

        
        System.out.println("--7번--");
        for(int height =1; height<= num; height++) {
            for(int width = 1; width <= height; width++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int height =1; height<= num; height++) {
            String stars = "";
            for(int width = height; width <= num-1; width++){
                stars += "*";

            }
            System.out.println(stars);
        }
        



        System.out.println("--8번--");

        for(int height =1; height<= num; height++){
            String stars = "";
            for(int width = 1; width  <= num - height; width++){
                stars += " ";
            }
            for(int width = 1  ; width <= height; width++){
                stars += "*";

            }
            System.out.println(stars);
            
            }
        for(int height =1; height<= num; height++){
                String stars = "";
                for(int width = 0; width  <= height - 1; width++){
                    stars += " ";
                }
                for(int width = height; width <= num-1; width++){
                    stars += "*";
    
                }
                System.out.println(stars);
                }



                System.out.println("--9번--");
                for(int height =1; height<= num; height++){
                    String stars = "";
                    for(int width = 1; width <= num -height; width++){
                        stars += " ";
        
                    }
                    for(int width = 1; width <= 2 * height -1; width++){
                        stars += "*";
        
                    }
                System.out.println(stars);
                }
                for(int height =1; height<= num; height++){
                    String stars = "";
                    for(int width = 0; width <= height -1 ; width++){
                        stars += " ";
                    }
                    for(int width = 1; width <= 2 * num - (2 * height -1)-2; width++){
                        stars += "*";
        
                    }
                    System.out.println(stars);
                }




                System.out.println("--10번--");

                for(int height =1; height<= num; height++) {
                    String stars = "";
                    for(int width = height; width <= num ; width++){
                        stars += "*";
        
                    }
                    for(int width = 0; width <= 2*height -3 ; width++){
                        stars += " ";
                    }
                    for(int width = height; width <= num; width++){
                        stars += "*";
        
                    }

                    System.out.println(stars);
                }
                for(int height =2; height<= num; height++) {
                    String stars = "";
                    for(int width = 1; width <= height; width++){
                        System.out.print("*");
        
                    }
        
        
                
                for(int width = 1; width  <= num + 3 - 2*(height-1); width++){
                    stars += " ";
                }
                for(int width = 1  ; width <= height; width++){
                    stars += "*";
    
                }
                
                System.out.println(stars);
            }
    
                



                






            

        scanner.close();


        }

    }

        
         





  


        
    
