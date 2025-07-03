import java.util.Scanner;
public class Room {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("BOY COUNT:");
        int Boy = scanner.nextInt();
        System.out.print("GIRL COUNT:");
        int Girl = scanner.nextInt();
        Boy = (Boy/4)+1;
        Girl = (Girl/3)+1;
        int room = Boy + Girl;
        System.out.println("Count room:"+room);
    }
}
