import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            
            //if n is equal to 2 or 3, then there exists no solution
            if(n == 2 || n == 3){
                System.out.println(-1);
                continue;
            }
            
            int[] arr = new int[n + 1];
            //taking a 1-based indexed array
            for(int i = 1; i <= n; i++){
                arr[i] = i;
            }
            
            //as we are swapping the ith index element with (i + 2)th index elemenet, we need to make sure (i + 2) is not more than n
            for(int i = 1; i + 2 <= n;){
                //if one is there in the present index of the string and previously we found a one, then we will update the present index value to 0
                int temp = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = temp;
                
                //if i is odd, then just go to next index.
                //if i is even, then go to (i + 3)th index as (i + 1)th index is already swapped with (i - 1)th and (i + 2)th index is already swapped with ith.
                if(i%2 == 1){
                    i += 1;
                }else{
                    i += 3;
                }
            }
            
            //case when only one element is left to be swapped
            if(n%4 == 1){
                int temp = arr[n];
                arr[n] = arr[n - 2];
                arr[n - 2] = temp;
                
                temp = arr[n];
                arr[n] = arr[n - 1];
                arr[n - 1] = temp;
            }
            
            //case when two elements are left to be swapped
            else if(n%4 == 2){
                int temp = arr[n];
                arr[n] = arr[n - 2];
                arr[n - 2] = temp;
                
                temp = arr[n - 1];
                arr[n - 1] = arr[n - 3];
                arr[n - 3] = temp;
                
                temp = arr[n];
                arr[n] = arr[n - 1];
                arr[n - 1] = temp;
            }
            
            //case when three elements are left to be swapped
            else if(n%4 == 3){
                int temp = arr[n - 1];
                arr[n - 1] = arr[n - 3];
                arr[n - 3] = temp;
                
                temp = arr[n - 2];
                arr[n - 2] = arr[n - 4];
                arr[n - 4] = temp;
                
                temp = arr[n - 1];
                arr[n - 1] = arr[n - 2];
                arr[n - 2] = temp;
                
                temp = arr[n - 3];
                arr[n - 3] = arr[n - 4];
                arr[n - 4] = temp;
            }
            
            for(int i = 1; i <= n; i++){
               System.out.print(arr[i] + " ");
            }
           System.out.println();
        }
    }
}
