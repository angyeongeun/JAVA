package Day04;


import java.util.Scanner;
public class Ex03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- ⭐ StarPrinter ⭐ ---");
        System.out.print("- Printer Number : ");
        int choice = scanner.nextInt();
        System.out.print("- Number of StarLine : ");
        int lineNumber = scanner.nextInt();
        StarPrinter s = new StarPrinter();
        s.selectNumber(choice, lineNumber);


        scanner.close();

        
    }
}