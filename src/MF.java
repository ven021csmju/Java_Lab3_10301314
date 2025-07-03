import java.util.Scanner;
public class MF {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("My number: ");
        int Number = scanner.nextInt();
        String FM = (Number % 2 == 0) ? "Male" : "Famale" ;
        System.out.println(FM);
    }
}
