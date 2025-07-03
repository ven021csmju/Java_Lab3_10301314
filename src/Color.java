import java.util.Scanner;
public class Color {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("My number color:");
        int Number = scanner.nextInt();
        Number = Number%10;
        String ID = (Number == 0) ? "Red": (Number == 5) ? "Red":
                         (Number == 1) ? "Green": (Number == 6) ? "Green":
                                 (Number == 2) ? "Yellow": (Number == 7) ? "Yellow":
                                         (Number == 3) ? "Sky Blue": (Number == 8) ? "Sky Blue":
                                                 (Number == 4) ? "Gray": (Number == 9) ? "Gray":"Eror";
                                                 System.out.println("My is color:"+ID);
    }
}
