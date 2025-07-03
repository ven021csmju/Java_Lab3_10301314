import java.util.Scanner;

public class Room {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("BOY COUNT: ");
        int boy = scanner.nextInt();

        System.out.print("GIRL COUNT: ");
        int girl = scanner.nextInt();

        int boyRoom = boy / 4;
        if (boy % 4 > 0) {
            boyRoom += 1;
        }

        int girlRoom = girl / 3;
        if (girl % 3 > 0) {
            girlRoom += 1;
        }

        int room = boyRoom + girlRoom;
        System.out.println("Count room: " + room);
    }
}

