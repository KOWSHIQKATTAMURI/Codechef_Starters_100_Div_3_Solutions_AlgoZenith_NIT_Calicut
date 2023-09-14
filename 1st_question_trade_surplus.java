import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int A_exports = scanner.nextInt();
            int A_imports = scanner.nextInt();
            int B_exports = scanner.nextInt();
            int B_imports = scanner.nextInt();

            //calculate total exports and total imports
            int total_exports = A_exports + B_exports;
            int total_imports = A_imports + B_imports;

            //C will be surplus only if total exports is greater than total imports. Total exports is actually equal to exports made by C. 
            if(total_imports > total_exports){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
