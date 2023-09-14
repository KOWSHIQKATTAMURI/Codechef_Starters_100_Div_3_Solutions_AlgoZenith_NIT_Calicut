import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            
            //there are only 3 jars
            //so if two of them have one chocolate each, then all the conditions will be satisfied
            //so the remaining jar can have the rest of the chocolates
            System.out.println(1 + " " + 1 + " " + (n - 2));
        }
    }
}
