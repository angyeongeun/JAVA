package Util;



import java.util.Scanner;

import BoardProject.Board;

public class MyScanner{
    public static int nextInt(Scanner scanner){
        
        int userNumber = scanner.nextInt();
        scanner.nextLine();
        return userNumber;

    }
}