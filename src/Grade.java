import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("My score: ");
        int score = scanner.nextInt();
        String grade =(score >= 70 ) ? "A":
                (score >= 65 ) ? "B+":
                (score >= 60 ) ? "B":
                        (score >= 55 ) ? "C+":
                        (score >= 50 ) ? "C":
                                (score >= 45 ) ? "D+":
                                (score >= 40 ) ? "D": "F";
        System.out.println("My grade:"+grade);
    }
}
