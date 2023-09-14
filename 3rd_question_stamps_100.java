import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            String s = scanner.next();

            //to count the one that is appearing first
            int count_one = 0;

            //should only check till (n - 2)th position
            //ones in the last two positions cannot be updated untill and unless we find a one in the first (n - 3) positions
            for(int i = 0; i < n - 2; i++){
                //if one is there in the present index of the string and previously we found a one, then we will update the present index value to 0
                if(s.charAt(i) == '1' && count_one > 0){
                    s = s.substring(0, i) + '0' + s.substring(i + 1);
                }else if(s.charAt(i) == '1'){
                    count_one++;
                }
            }

            //if we found a one, then even the values on the last three positions of the string will also be updated to zero
            if(count_one > 0){
                for(int i = n - 2; i < n; i++){
                    s = s.substring(0, i) + '0' + s.substring(i + 1);
                }
            }
            System.out.println(s);
        }
    }
}
